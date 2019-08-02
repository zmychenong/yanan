/**
 * Copyright (c) 2016-2019 雅南集团 All rights reserved.
 *
 * https://www.yanan.io
 *
 * 版权所有，侵权必究！
 */

package io.renren.common.aspect;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import io.renren.common.utils.NoRepeatSubmit;
import io.renren.common.utils.R;
import io.renren.common.utils.RedisUtils;
import io.renren.modules.job.task.ControService;

/**
 * 处理前端重复提交切面类
 * @author 吴航
 *
 */
@Aspect
@Component
public class NoRepeatSubmitAop {

	private Logger logger = LoggerFactory.getLogger(getClass());
	//使用redis缓存url
	@Autowired
	private RedisUtils redisUtils;
	@Around("execution(public * *(..)) && @annotation(nrs)")
	public Object arround(ProceedingJoinPoint pjp, NoRepeatSubmit nrs){
		try {
			
			ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
			String sessionid = RequestContextHolder.getRequestAttributes().getSessionId();
			HttpServletRequest request = attributes.getRequest();
			String Urlkey = sessionid;
			
			String key = sessionid+"-"+request.getServletPath();
			System.out.println("点击的URL："+request.getServletPath());
			if(redisUtils.get(Urlkey) == null){
				//如果缓存中有这个url则代表重复请求
				Object obj = pjp.proceed();
				if(ControService.getRedisStatus()==1){
					redisUtils.set(Urlkey, key, 2);
				}
				
				return obj;
			}else{
	
				logger.debug("请勿重复请求！");
				return R.error("请勿重复请求！");
			}
		} catch (Throwable e) {
			
			logger.debug("处理前端重复请求失败！");
			e.printStackTrace();
			return R.error();
		}
	}
	
	
}
