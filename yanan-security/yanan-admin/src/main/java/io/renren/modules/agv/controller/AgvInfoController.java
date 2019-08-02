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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.renren.common.agvs.AGVName;
import io.renren.common.agvs.AGVSIServiceForView;
import io.renren.common.agvs.ArrayOfAGVName;
import io.renren.common.agvs.WorkAreaName;
import io.renren.common.annotation.SysLog;
import io.renren.common.utils.NoRepeatSubmit;
import io.renren.common.utils.R;
import io.renren.common.utils.SingleAGV;
import io.renren.modules.agv.service.AgvInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

/**
 * AGV小车信息
 * 
 * @author 吴航
 *
 */
@RestController
@RequestMapping("/agv/info")
@Api(value="AGV信息接口",tags="AGV信息接口")
public class AgvInfoController {

	
	@Autowired
	private AgvInfoService agvInfoService;
	
	/*
	 * AGV信息显示
	 */
	@ApiOperation(value="查看某个工作区小车信息列表",notes="ajax提交，提交方式:post,参数格式：json字符串")
	@RequestMapping(value="/list",method=RequestMethod.POST,produces="application/json;charset=utf-8")
	@ApiImplicitParam(name="name",value="工作区对象",dataType="WorkAreaName",paramType="body")
	@NoRepeatSubmit
	public R getCarrierArray(@RequestBody WorkAreaName name){
		AGVSIServiceForView agv = SingleAGV.getAgvTarget();
		ArrayOfAGVName arrayOfAGVName = agv.getCarrierArray(name);
		List<AGVName> agvName = arrayOfAGVName.getAGVName();
		
		return R.ok();
	}
	
	
	/*
	 * 新增AGV信息
	 */
	@SysLog("新增AGV信息")
	@ApiOperation(value="添加AGV信息",notes="ajax提交，提交方式:post,参数格式：json字符串")
	@RequestMapping(value="/add",method=RequestMethod.POST,produces="application/json")
	@ApiImplicitParam(name="name",value="AGV对象",dataType="AGVName",paramType="body")
	@NoRepeatSubmit
	public R addRegisterCarrier(@RequestBody AGVName name){
		
		agvInfoService.addRegisterCarrier(name);
		return R.ok();
	}
	
	
	/*
	 * 删除AGV信息
	 */
	@SysLog("删除AGV信息")
	@ApiOperation(value="删除某个AGV信息",notes="ajax提交，提交方式:post,参数格式：json字符串")
	@RequestMapping(value="/del",method=RequestMethod.POST,produces="application/json")
	@ApiImplicitParam(name="name",value="AGV对象",dataType="AGVName",paramType="body")
	@NoRepeatSubmit
	public R delRegisterCarrier(@RequestBody AGVName name){
		agvInfoService.delRegisterCarrier(name);
		return R.ok();
	}
	
	
	/*
	 * 修改AGV信息
	 */
	@SysLog("修改AGV信息")
	@ApiOperation(value="修改AGV信息",notes="ajax提交，提交方式:post,参数格式：json字符串")
	@RequestMapping(value="/modify",method=RequestMethod.POST,produces="application/json")
	@ApiImplicitParam(name="name",value="AGV对象",dataType="AGVName",paramType="body")
	@NoRepeatSubmit
	public R modifyCarrier(@RequestBody AGVName name){
		
		agvInfoService.modifyCarrier(name);
		return R.ok();
	}
	
	/*
	 * 获取单个AGV的信息
	 */
	@ApiOperation(value="获取单个AGV信息",notes="ajax提交，提交方式:post,参数格式：json字符串")
	@RequestMapping(value="/getCarrier",method=RequestMethod.POST,produces="application/json")
	@ApiImplicitParams({
		@ApiImplicitParam(name="name",value="工作区对象",dataType="WorkAreaName",paramType="body"),
		@ApiImplicitParam(name="id",value="AGVID",dataType="int",paramType="query")
	})
	@NoRepeatSubmit
	public R getCarrier(@RequestBody WorkAreaName name,
			@RequestParam Integer id){
		AGVName agvName = agvInfoService.getCarrier(name, id);
		if(agvName!=null){
			return R.ok().put("agvName", agvName);
		}else{
			return R.error("无此AGV，请重新输入！");
		}
		
	}
}
