/**
 * Copyright (c) 2016-2019 雅南集团 All rights reserved.
 *
 * https://www.yanan.io
 *
 * 版权所有，侵权必究！
 */

package io.renren.modules.agv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.renren.common.utils.R;
import io.renren.common.utils.RedisUtils;
import io.renren.modules.job.task.ControService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * 前端参数发送类
 *
 * @author 吴航
 */

@RestController
@Api(value="数据请求接口",tags="数据请求接口")
@RequestMapping("/sys/parameterSend")
public class ParameterSendController {

	@Autowired
    private RedisUtils redisUtils;
	String value = null;
	
	@ResponseBody
	@ApiOperation(value="数据同步,需要哪些数据",notes="ajax提交，返回json字符串")
	@ApiImplicitParam(value="参数key",name="key",required=true,paramType="query",dataType="String")
	@RequestMapping(value="/sendParam",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ApiResponses({
		@ApiResponse(code = 200,message = "成功！"),
        @ApiResponse(code = 401,message = "未授权！"),
        @ApiResponse(code = 404,message = "页面未找到！"),
        @ApiResponse(code = 403,message = "出错了！"),
        @ApiResponse(code = 400,message = "参数填写错误！")
	})
	public R sendParam(@RequestParam String key){
		System.out.println("传的key"+key);
		if(ControService.getRedisStatus()==1){
			value = redisUtils.get(key);
			System.out.println("取的值"+value);
			if(value==""||value == null){
				return R.error("缓存无此值，请检查参数key");
			}else{
				return R.ok().put(key, value);
			}
		}else{
			return R.error("redis服务器未正常启动！");
		}
		
		
	}
	
	
	
	
	
	
}
