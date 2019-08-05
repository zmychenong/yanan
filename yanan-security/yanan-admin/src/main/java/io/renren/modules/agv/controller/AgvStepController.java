/**
 * Copyright (c) 2016-2019 雅南集团 All rights reserved.
 *
 * https://www.yanan.io
 *
 * 版权所有，侵权必究！
 */

package io.renren.modules.agv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.renren.common.agvs.AGVStepMessage;
import io.renren.common.agvs.WorkAreaName;
import io.renren.common.annotation.SysLog;
import io.renren.common.utils.NoRepeatSubmit;
import io.renren.common.utils.R;
import io.renren.modules.agv.service.AgvStepService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

/**
 * AGV工作区节点管理
 * @author 吴航
 *
 */
@RestController
@RequestMapping("/agv/step")
@Api(value="AGV工作区节点管理接口",tags="AGV工作区节点管理接口")
public class AgvStepController {

	@Autowired
	private AgvStepService agvStepService;
	
	/*
	 * 添加节点
	 */
	@SysLog("添加工作区节点")
	@ApiOperation(value="给某工作区添加节点",notes="ajax提交，两个对象：name和agvStep,参数格式：json字符串")
	@RequestMapping(value="/add",method=RequestMethod.POST,produces="application/json;charset=utf-8")
	@ApiImplicitParams({
		@ApiImplicitParam(name="name",value="工作区对象",dataType="WorkAreaName",paramType="body"),
		@ApiImplicitParam(name="agvStep",value="工作区节点对象",dataType="AGVStepMessage",paramType="body")
	})
	@NoRepeatSubmit
	public void addStep(WorkAreaName name,AGVStepMessage agvStep){
		Boolean result = agvStepService.addStep(name, agvStep);
		R.getResult(result);
	}
	
	
	/*
	 * 删除节点
	 */
	@SysLog("删除工作区节点")
	@ApiOperation(value="删除某个工作区节点",notes="ajax提交，两个对象：name和agvStep,参数格式：json字符串")
	@RequestMapping(value="/del",method=RequestMethod.POST,produces="application/json;charset=utf-8")
	@ApiImplicitParams({
		@ApiImplicitParam(name="name",value="工作区对象",dataType="WorkAreaName",paramType="body"),
		@ApiImplicitParam(name="agvStep",value="工作区节点对象",dataType="AGVStepMessage",paramType="body")
	})
	@NoRepeatSubmit
	public void delStep(WorkAreaName name, AGVStepMessage agvStep){
		Boolean result = agvStepService.delStep(name, agvStep);
		R.getResult(result);
	}
	
	/*
	 * 修改节点
	 */
	@SysLog("修改工作区节点")
	@ApiOperation(value="修改某个工作区节点",notes="ajax提交，两个对象：name和agvStep,参数格式：json字符串")
	@RequestMapping(value="/modify",method=RequestMethod.POST,produces="application/json;charset=utf-8")
	@ApiImplicitParams({
		@ApiImplicitParam(name="name",value="工作区对象",dataType="WorkAreaName",paramType="body"),
		@ApiImplicitParam(name="agvStep",value="工作区节点对象",dataType="AGVStepMessage",paramType="body")
	})
	@NoRepeatSubmit
	public void modifyStep(WorkAreaName name, AGVStepMessage agvStep){
		Boolean result = agvStepService.modifyStep(name, agvStep);
		R.getResult(result);
	}
	
}
