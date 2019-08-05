/**
 * Copyright (c) 2016-2019 雅南集团 All rights reserved.
 *
 * https://www.yanan.io
 *
 * 版权所有，侵权必究！
 */

package io.renren.modules.agv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.renren.common.agvs.AGVOrderMessage;
import io.renren.common.agvs.WorkAreaName;
import io.renren.common.annotation.SysLog;
import io.renren.common.utils.NoRepeatSubmit;
import io.renren.common.utils.R;
import io.renren.modules.agv.service.AgvOrderService;
import io.renren.modules.agv.service.AgvWorkAreaService;
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

@CrossOrigin(allowedHeaders = "*", allowCredentials = "true")
@RestController
@RequestMapping("/agv/order")
@Api(value="AGV任务管理接口",tags="AGV任务管理接口")
public class AgvOrderController {

	@Autowired
	private AgvOrderService agvOrderService;
	@Autowired
	private AgvWorkAreaService agvWorkAreaService;
	
	/*
	 * 任务显示
	 * 
	 */
	
	@ApiOperation(value="查看某个工作区任务集合",notes="ajax提交，提交方式:get,参数格式：json字符串")
	@RequestMapping(value="/getOrderList",method=RequestMethod.GET,produces="application/json;charset=utf-8")
	@NoRepeatSubmit
	public R getOrderList(@RequestParam int companyID,@RequestParam int factoryID ,@RequestParam int workAreaID ){	
		WorkAreaName workAreaName = agvWorkAreaService.getWorkArea(companyID, factoryID, workAreaID);
		if(workAreaName!=null){
			List<AGVOrderMessage> orderList = agvOrderService.getOrderList(workAreaName);
			if(orderList != null && !orderList.isEmpty()){
				return R.ok().put("orderList", orderList);
			}else{
				return R.error("此工作区暂无任务");
			}
			
		}else{
			return R.error("无此工作区");
		}
	} 
	
	
	/*
	 * 新增任务
	 */
	@SysLog("新增AGV任务")
	@ApiOperation(value="给某个工作区新添加任务",notes="ajax提交，提交方式:post,参数格式：json对象")
	@RequestMapping(value="/add",method=RequestMethod.POST,produces="application/json")
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
	@NoRepeatSubmit
	public R delOrder(@RequestBody @ApiParam(value="单个工作区对象",name="name",required=true)WorkAreaName name,
			@RequestParam	@ApiParam(value="任务ID",name="orderID",required=true)Integer orderID){
		agvOrderService.delOrder(name, orderID);
		return R.ok();
	}
	
	
	/*
	 * 查看其他工作区任务集合
	 */
	@ApiOperation(value="查看其他工作区任务集合",notes="ajax提交，提交方式:get,参数格式：json字符串")
	@RequestMapping(value="/selectWorkArea",method=RequestMethod.GET,produces="application/json;charset=utf-8")
	@NoRepeatSubmit
	public R selectWorkArea(@RequestParam int companyID,@RequestParam int factoryID ,@RequestParam int workAreaID ){	
		/*System.out.println("进来了");
		JSONObject obj = JSONObject.fromObject(jsonParam);
		System.out.println("sss"+obj);
		AgvOrderTask agvOrder = new AgvOrderTask();
		AgvOrderTask.setParam(jsonParam);
		//agvOrder.run(jsonParam);
		String name = obj.getString("companyID");
		System.out.println(name);*/
		System.out.println("name");
		return R.ok().put("name", factoryID);
	}
	
	
	/*
	 * 任务执行状态接口
	 */
	/*public R getOrderStatus(){
		
	}*/
	
	
	
}
