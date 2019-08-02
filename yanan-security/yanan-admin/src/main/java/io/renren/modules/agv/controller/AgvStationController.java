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

import io.renren.common.agvs.StationMessage;
import io.renren.common.agvs.WorkAreaName;
import io.renren.common.annotation.SysLog;
import io.renren.common.utils.NoRepeatSubmit;
import io.renren.common.utils.R;
import io.renren.modules.agv.service.AgvStationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * AGV站点管理
 * @author 吴航
 *
 */
@RestController
@RequestMapping("/agv/station")
@Api(value="AGV站点管理接口",tags="AGV站点管理接口")
public class AgvStationController {

	@Autowired
	private AgvStationService agvStationService;
	
	/*
	 * 新增站点
	 */
	@SysLog("新增AGV站点")
	@ApiOperation(value="给某个工作区新添加站点",notes="ajax提交，两个对象：name和station,参数格式：json字符串")
	@RequestMapping(value="/add",method=RequestMethod.POST,produces="application/json")
	@ApiImplicitParams({
		@ApiImplicitParam(name="name",value="工作区对象",dataType="WorkAreaName",paramType="body"),
		@ApiImplicitParam(name="station",value="站点对象",dataType="StationMessage",paramType="body")
	})
	@NoRepeatSubmit
	public R addStation(WorkAreaName name,
			 StationMessage station){
		agvStationService.addStation(name, station);
		return R.ok();
	}
	
	/*
	 * 删除站点
	 */
	@SysLog("删除AGV站点")
	@ApiOperation(value="删除某个工作区某个站点",notes="ajax提交，提交方式:post,参数格式：json字符串")
	@RequestMapping(value="/del",method=RequestMethod.POST,produces="application/json")
	@NoRepeatSubmit
	public R delStation(@RequestBody @ApiParam(value="工作区对象",name="name",required=true) WorkAreaName name,
			@RequestParam @ApiParam(value="站点ID",name="stationID",required=true) Integer stationID){
		agvStationService.delStation(name, stationID);
		return R.ok();
	}
	
	/*
	 * 修改站点
	 */
	@SysLog("修改AGV站点")
	@ApiOperation(value="修改某个工作区某个站点信息",notes="ajax提交，两个对象：name和station,参数格式：json字符串")
	@RequestMapping(value="/modify",method=RequestMethod.POST,produces="application/json")
	@ApiImplicitParams({
		@ApiImplicitParam(name="name",value="工作区对象",dataType="WorkAreaName",paramType="body"),
		@ApiImplicitParam(name="station",value="站点对象",dataType="StationMessage",paramType="body")
	})
	@NoRepeatSubmit
	public R modifyStation(WorkAreaName name,
			StationMessage station){
		agvStationService.modifyStation(name, station);
		return R.ok();
	}
	
	/*
	 * 获取单个站点信息
	 */
	
	@ApiOperation(value="获取单个站点的信息",notes="ajax提交，提交方式:post,参数格式：json字符串")
	@RequestMapping(value="/getStation",method=RequestMethod.POST,produces="application/json")
	@NoRepeatSubmit
	public R getStation(@RequestBody @ApiParam(value="工作区对象",name="name",required=true) WorkAreaName name,
			@RequestParam @ApiParam(value="站点ID",name="stationID",required=true) Integer stationID){
		StationMessage stationMessage = agvStationService.getStation(name, stationID);
		if(stationMessage!=null){
			return R.ok().put("stationMessage", stationMessage);
		}else{
			return R.error("无此站点信息，请重新输入！");
		}
		
	}
	
	
}
