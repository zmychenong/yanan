/**
 * Copyright (c) 2016-2019 雅南集团 All rights reserved.
 *
 * https://www.yanan.io
 *
 * 版权所有，侵权必究！
 */

package io.renren.modules.job.task;

import javax.xml.ws.WebServiceException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.RedisConnectionFailureException;
import org.springframework.stereotype.Component;

import io.renren.common.agvs.AGVSIServiceForView;
import io.renren.common.agvs.ArrayOfWorkAreaName;
import io.renren.common.utils.JedisUtil;
import io.renren.common.utils.SingleAGV;
import io.renren.modules.job.service.ScheduleJobService;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.exceptions.JedisConnectionException;

/**
 * 
 *
 * 监测服务宕机定时任务
 *
 * @author 吴航
 */
@Component("ControService")
public class ControService implements ITask {
	private Logger logger = LoggerFactory.getLogger(getClass());
	private static int wcfStatus = 1;
	private static int redisStatus = 1;
	private static int status = 0;

	@Autowired
	private ScheduleJobService scheduleJobService;
	@Override
	@SuppressWarnings("unused")
	public void run(String params) {
		logger.debug("ControService定时任务正在执行，参数为：{}", params);
		try {
			AGVSIServiceForView agv = SingleAGV.getAgvTarget();

			ArrayOfWorkAreaName arrayOfWorkAreaName = agv.getAllWorkArea();
			Jedis jedis = JedisUtil.getJedis();
			jedis.set("name", "xxx");
			jedis.expire("name", 60);
			JedisUtil.close(jedis);
			wcfStatus = 1;
			redisStatus =1;
		} catch (WebServiceException e) {
			logger.debug("WCF服务未正常开启");
			wcfStatus = 0;
		} catch (NullPointerException e) {
			logger.debug("WCF服务未正常开启或某个值为空");
			wcfStatus = 0;
		} catch (JedisConnectionException e) {
			logger.debug("redis服务器连接异常");
			redisStatus = 0;
		}  finally {
			if (redisStatus != status && wcfStatus != status) {
				logger.debug("所有服务正常开启！");
				Long[] jobIds = {(long) 2,(long) 3};
				scheduleJobService.resume(jobIds);
				AgvOrderTask.setRedisNum(0);
				AgvOrderTask.setWcfNum(0);
				AgvStatusTask.setRedisNum(0);
				AgvStatusTask.setWcfNum(0);
			}else{
				logger.debug("服务异常关闭！");
				Long[] jobIds = {(long) 2,(long) 3};
				scheduleJobService.pause(jobIds);
				AgvOrderTask.setRedisNum(0);
				AgvOrderTask.setWcfNum(0);
				AgvStatusTask.setRedisNum(0);
				AgvStatusTask.setWcfNum(0);
			}
		}
	}

	public static int getRedisStatus() {
		return redisStatus;
	}

	public static void setRedisStatus(int redisStatus) {
		ControService.redisStatus = redisStatus;
	}

}
