/**
 * Copyright (c) 2016-2019 雅南集团 All rights reserved.
 *
 * https://www.yanan.io
 *
 * 版权所有，侵权必究！
 */

package io.renren.modules.job.task;

import java.util.List;

import javax.xml.ws.WebServiceException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.RedisConnectionFailureException;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;

import io.renren.common.agvs.AGVOrderMessage;
import io.renren.common.agvs.AGVSIServiceForView;
import io.renren.common.agvs.ArrayOfAGVOrderMessage;
import io.renren.common.agvs.ArrayOfWorkAreaName;
import io.renren.common.agvs.WorkAreaName;
import io.renren.common.utils.JedisUtil;
import io.renren.common.utils.MailTest;
import io.renren.common.utils.SingleAGV;
import io.renren.modules.job.service.ScheduleJobService;
import net.sf.json.JSONObject;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.exceptions.JedisConnectionException;

/**
 * AGV任务定时任务
 *
 * @author 吴航
 */
@Component("AgvOrderTask")
public class AgvOrderTask implements ITask {
	private Logger logger = LoggerFactory.getLogger(getClass());
	private AGVSIServiceForView agv = null;
	private Jedis jedis = null;
	private WorkAreaName workAreaName;
	// 静态变量param用来保存公司ID，仓库ID，工作区ID
	static String param;
	//保存异常次数
	static int wcfNum = 0 ;
	static int redisNum = 0 ;
	
	@Autowired
	private ScheduleJobService scheduleJobService;
	@SuppressWarnings("unchecked")
	@Override
	public void run(String params) {
		logger.debug("agvOrderTask定时任务正在执行，参数为：{}", params);
		agv = SingleAGV.getAgvTarget();
		try {

			if (param == null) {
				// 如果参数为空，所有工作区第一个为默认工作区
				logger.debug("参数为空，取默认工作区");
				ArrayOfWorkAreaName arrayOfWorkAreaName = agv.getAllWorkArea();
				List<WorkAreaName> allOrderList = arrayOfWorkAreaName.getWorkAreaName();
				if (allOrderList != null && !allOrderList.isEmpty()) {
					WorkAreaName workAreaName = allOrderList.get(0);
					ArrayOfAGVOrderMessage arrayOfAGVOrderMessage = agv.getOrderArray(workAreaName);
					List<AGVOrderMessage> agvOrderMessage = arrayOfAGVOrderMessage.getAGVOrderMessage();
					if (agvOrderMessage != null && !agvOrderMessage.isEmpty()) {
						String agvOrderList = JSON.toJSON(agvOrderMessage).toString();
						jedis = JedisUtil.getJedis();
						jedis.set("agvOrderList", agvOrderList);
						jedis.expire("agvOrderList", 60);
						JedisUtil.close(jedis);
						
					}

				}
			} else {
				// 不为空则解析为json进行查询
				JSONObject jobj = JSONObject.fromObject(param);
				Integer workAreaID = jobj.getInt("workAreaID");
				Integer factoryID = jobj.getInt("factoryID");
				Integer companyID = jobj.getInt("companyID");
				workAreaName = agv.getWorkArea(companyID, factoryID, workAreaID);
			}
			if (workAreaName != null) {

				List<AGVOrderMessage> agvOrderMessage = (List<AGVOrderMessage>) agv.getOrderArray(workAreaName);
				if (agvOrderMessage != null && !agvOrderMessage.isEmpty()) {
					String agvOrderList = JSON.toJSON(agvOrderMessage).toString();
					jedis = JedisUtil.getJedis();
					jedis.set("agvOrderList", agvOrderList);
					jedis.expire("agvOrderList", 60);
					JedisUtil.close(jedis);
				} else {
					logger.debug("此工作区暂时没有AGV任务列表");
				}

			} else {
				logger.debug("没有此工作区，请检查公司ID丶仓库ID丶工作区ID");
			}
			wcfNum=0;
			redisNum=0;
		} catch (WebServiceException e) {
			wcfNum++;
			logger.debug("WCF服务未正常开启");
		} catch (NullPointerException e) {
			wcfNum++;
			logger.debug("WCF服务未正常开启或某个值为空");
		} catch (JedisConnectionException e) {
			redisNum++;
			logger.debug("redis服务器连接异常");
		} catch(RedisConnectionFailureException e){
			redisNum++;
			logger.debug("redis服务器连接异常");
		} finally{
			if(wcfNum>=3){
				Long[] jobIds = {(long) 2,(long) 3};
				scheduleJobService.pause(jobIds);
				MailTest.send("WCF");
			}else if(redisNum>=3){
				Long[] jobIds = {(long) 2,(long) 3};
				scheduleJobService.pause(jobIds);
				MailTest.send("Redis");
			}
		}

	}

	public static String getParam() {
		return param;
	}

	public static void setParam(String param) {
		AgvOrderTask.param = param;
	}

}
