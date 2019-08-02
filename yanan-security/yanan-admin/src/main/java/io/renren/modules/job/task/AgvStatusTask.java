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

import io.renren.common.agvs.AGVSIServiceForView;
import io.renren.common.agvs.AGVStatusMessage;
import io.renren.common.agvs.ArrayOfAGVStatusMessage;
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
 * 工作区内所有AGV状态定时任务
 * 
 * @author 吴航
 *
 */
@Component("AgvStatusTask")
public class AgvStatusTask implements ITask {

	private Logger logger = LoggerFactory.getLogger(getClass());
	private WorkAreaName workAreaName = null;
	private static String param = null;
	private AGVSIServiceForView agv = null;
	private Jedis jedis = null;
	
	static int wcfNum = 0 ;
	static int redisNum = 0 ;
	
	@Autowired
	private ScheduleJobService scheduleJobService;
	@Override
	public void run(String params) {
		logger.debug("AgvStatusTask定时任务正在执行，参数为：{}", params);
		agv = SingleAGV.getAgvTarget();
		try {
			if (param == null) {
				logger.debug("工作区对象为空！取第一个为默认工作区！");
				ArrayOfWorkAreaName arrayOfWorkAreaName = agv.getAllWorkArea();
				List<WorkAreaName> workAreaNameList = arrayOfWorkAreaName.getWorkAreaName();
				workAreaName = workAreaNameList.get(0);
			} else {
				JSONObject jobj = JSONObject.fromObject(param);
				Integer workAreaID = jobj.getInt("workAreaID");
				Integer factoryID = jobj.getInt("factoryID");
				Integer companyID = jobj.getInt("companyID");
				workAreaName = agv.getWorkArea(companyID, factoryID, workAreaID);
			}
			if (workAreaName != null) {
				ArrayOfAGVStatusMessage arrayOfAGVStatusMessage = agv.getCarrierStatusArray(workAreaName);
				List<AGVStatusMessage> agvStatusMessage = arrayOfAGVStatusMessage.getAGVStatusMessage();
				if (agvStatusMessage != null && !agvStatusMessage.isEmpty()) {
					String agvStatusList = JSON.toJSONString(agvStatusMessage);
					jedis = JedisUtil.getJedis();
					jedis.set("agvStatusList", agvStatusList);
					jedis.expire("agvStatusList", 60);
					JedisUtil.close(jedis);
					
				}
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

	public static void setParams(String param) {
		AgvStatusTask.param = param;
	}

}
