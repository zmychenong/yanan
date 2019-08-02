/**
 * Copyright (c) 2016-2019 雅南集团 All rights reserved.
 *
 * https://www.yanan.io
 *
 * 版权所有，侵权必究！
 */

package io.renren.modules.agv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.renren.common.agvs.AGVOrderMessage;
import io.renren.common.agvs.WorkAreaName;
import io.renren.common.annotation.SysLog;
import io.renren.common.utils.NoRepeatSubmit;
import io.renren.common.utils.R;
import io.renren.modules.agv.service.AgvOrderService;
//import io.renren.modules.job.task.AgvOrderTask;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import net.sf.json.JSONObject;

/**
 * AGV任务管理
 *
 * @author 吴航 
 */
@RestController
@RequestMapping("/agv/order")
@Api(value="AGV任务管理接口",tags="AGV任务管理接口")
public class AgvOrderController {

	@Autowired
	private AgvOrderService agvOrderService;
	
	/*
	 * 任务显示
	 * 
	 */
	
	@ApiOperation(value="查看某个工作区任务集合",notes="ajax提交，提交方式:get,参数格式：json字符串")
	@RequestMapping(value="/selectWorkArea",method=RequestMethod.GET,produces="application/json;charset=utf-8")
	@ApiResponses({
		@ApiResponse(code = 200,message = "成功！"),
        @ApiResponse(code = 401,message = "未授权！"),
        @ApiResponse(code = 404,message = "页面未找到！"),
        @ApiResponse(code = 403,message = "出错了！"),
        @ApiResponse(code = 400,message = "参数填写错误！")
	})
	@NoRepeatSubmit
	public R test(@RequestParam @ApiParam(value="公司ID,仓库ID,工作区ID",name="orderMessage",required=true) String jsonParam){	
		
		JSONObject obj = JSONObject.fromObject(jsonParam);
		System.out.println("sss"+obj);
		/*AgvOrderTask agvOrder = new AgvOrderTask();
		AgvOrderTask.setParam(jsonParam);*/
		//agvOrder.run(jsonParam);
		String name = obj.getString("companyID");
		System.out.println(name);
		return R.ok();
	} 
	
	
	/*
	 * 新增任务
	 */
	@SysLog("新增AGV任务")
	@ApiOperation(value="给某个工作区新添加任务",notes="ajax提交，提交方式:post,参数格式：json对象")
	@RequestMapping(value="/add",method=RequestMethod.POST,produces="application/json")
	@ApiResponses({
		@ApiResponse(code = 200,message = "成功！"),
        @ApiResponse(code = 401,message = "未授权！"),
        @ApiResponse(code = 404,message = "页面未找到！"),
        @ApiResponse(code = 403,message = "出错了！"),
        @ApiResponse(code = 400,message = "参数填写错误！")
	})
	@NoRepeatSubmit
	public R addOrder(@RequestBody @ApiParam(value="AGV任务信息对象",name="orderMessage",required=true)AGVOrderMessage orderMessage){
		agvOrderService.addOrder(orderMessage);
		return R.ok();
	}
	
	/*
	 * 删除任务
	 */
	@SysLog("删除AGV任务")
	@ApiOperation(value="删除某工作区的某个任务",notes="ajax提交，提交方式:post")
	@RequestMapping(value="/del",method=RequestMethod.POST,produces="application/json")
	@ApiResponses({
		@ApiResponse(code = 200,message = "成功！"),
        @ApiResponse(code = 401,message = "未授权！"),
        @ApiResponse(code = 404,message = "页面未找到！"),
        @ApiResponse(code = 403,message = "出错了！"),
        @ApiResponse(code = 400,message = "参数填写错误！")
	})
	@NoRepeatSubmit
	public R delOrder(@RequestBody @ApiParam(value="单个工作区对象",name="name",required=true)WorkAreaName name,
			@RequestParam	@ApiParam(value="任务ID",name="orderID",required=true)Integer orderID){
		agvOrderService.delOrder(name, orderID);
		return R.ok();
	}
	
	
	
	
	
}
