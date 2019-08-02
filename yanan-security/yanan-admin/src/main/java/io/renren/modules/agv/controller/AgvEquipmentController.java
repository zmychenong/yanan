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

import io.renren.common.agvs.EquipmentData;
import io.renren.common.agvs.WorkAreaName;
import io.renren.common.annotation.SysLog;
import io.renren.common.utils.NoRepeatSubmit;
import io.renren.common.utils.R;
import io.renren.modules.agv.service.AgvEquipmentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

/**
 * AGV设备管理
 * @author 吴航
 *
 */
@RestController
@RequestMapping("/agv/equipment")
@Api(value="AGV设备管理接口",tags="AGV设备管理接口")
public class AgvEquipmentController {

	@Autowired
	private AgvEquipmentService agvEquipmentService;
	
	/*
	 * 新增设备
	 */
	@SysLog("新增设备信息")
	@ApiOperation(value="新增设备信息",notes="ajax提交，两个对象：name和equipment，参数格式：json字符串")
	@RequestMapping(value="/add",method=RequestMethod.POST,produces="application/json")
	@ApiImplicitParams({
		@ApiImplicitParam(name="name",value="工作区对象",dataType="WorkAreaName",paramType="body"),
		@ApiImplicitParam(name="equipment",value="设备对象",dataType="EquipmentData",paramType="body")
	})
	@NoRepeatSubmit
	public void addEquipment( WorkAreaName name,
			 EquipmentData equipment){
		Boolean result = agvEquipmentService.addEquipment(name, equipment);
		R.getResult(result);
		
	}
	
	/*
	 * 删除设备
	 */
	@SysLog("删除设备信息")
	@ApiOperation(value="删除设备信息",notes="ajax提交，提交方式:post,参数格式：json字符串")
	@RequestMapping(value="/del",method=RequestMethod.POST,produces="application/json")
	@ApiImplicitParams({
		@ApiImplicitParam(name="name",value="工作区对象",dataType="WorkAreaName",paramType="body"),
		@ApiImplicitParam(name="equipmentID",value="设备ID",dataType="int",paramType="query")
	})
	@NoRepeatSubmit
	public void delEquipment(@RequestBody WorkAreaName name,
			 @RequestParam Integer equipmentID){
		Boolean result = agvEquipmentService.delEquipment(name, equipmentID);
		R.getResult(result);
	}
	
	/*
	 * 修改设备
	 */
	@SysLog("修改设备信息")
	@ApiOperation(value="修改设备信息",notes="ajax提交，两个对象：name和equipment,参数格式：json字符串")
	@ApiImplicitParams({
		@ApiImplicitParam(name="name",value="工作区对象",dataType="WorkAreaName",paramType="body"),
		@ApiImplicitParam(name="equipment",value="设备对象",dataType="EquipmentData",paramType="body")
	})
	@RequestMapping(value="/modify",method=RequestMethod.POST,produces="application/json")
	@NoRepeatSubmit
	public void modifyEquipment(WorkAreaName name,
			EquipmentData equipment){
		Boolean result = agvEquipmentService.modifyEquipment(name, equipment);
		R.getResult(result);
	}
	
	/*
	 * 获取单个设备
	 */
	
	@ApiOperation(value="获取单个设备信息",notes="ajax提交，提交方式:post,参数格式：json字符串")
	@RequestMapping(value="/getEquipment",method=RequestMethod.POST,produces="application/json")
	@ApiImplicitParams({
		@ApiImplicitParam(name="name",value="工作区对象",dataType="WorkAreaName",paramType="body"),
		@ApiImplicitParam(name="equipmentID",value="设备ID",dataType="int",paramType="query")
	})
	@NoRepeatSubmit
	public R getEquipment(@RequestBody  WorkAreaName name,
			@RequestParam Integer equipmentID){
		EquipmentData equipmentData = agvEquipmentService.getEquipment(name, equipmentID);
		if(equipmentData!=null){
			return R.ok().put("equipmentData", equipmentData);
		}else{
			return R.error("无此设备，请重新输入！");
		}
		
	}
}
