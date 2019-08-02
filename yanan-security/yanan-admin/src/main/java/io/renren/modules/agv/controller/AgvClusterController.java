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

import io.renren.common.agvs.ClusterMessage;
import io.renren.common.agvs.WorkAreaName;
import io.renren.common.annotation.SysLog;
import io.renren.common.utils.NoRepeatSubmit;
import io.renren.common.utils.R;
import io.renren.modules.agv.service.AgvClusterService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * AGV交管管理
 * @author 吴航
 *
 */
@RestController
@RequestMapping("/agv/cluster")
@Api(value="AGV交管接口",tags="AGV交管接口")
public class AgvClusterController {

	@Autowired
	private AgvClusterService agvClusterService;
	
	/*
	 * 新增交管信息
	 */
	@SysLog("新增交管信息")
	@ApiOperation(value="给某个工作区新添加交管信息",notes="ajax提交，两个对象：name和cluster,参数格式：json字符串")
	@RequestMapping(value="/add",method=RequestMethod.POST,produces="application/json")
	@ApiImplicitParams({
		@ApiImplicitParam(name="name",value="工作区对象",dataType="WorkAreaName",paramType="body"),
		@ApiImplicitParam(name="cluster",value="交管对象",dataType="ClusterMessage",paramType="body")
	})
	@NoRepeatSubmit
	public R addCluster( WorkAreaName name,
			  ClusterMessage cluster){
		agvClusterService.addCluster(name, cluster);
		return R.ok();
	}
	
	/*
	 * 删除交管信息
	 */
	@SysLog("删除交管信息")
	@ApiOperation(value="删除某个工作区交管信息",notes="ajax提交，提交方式:post,参数格式：json字符串")
	@RequestMapping(value="/del",method=RequestMethod.POST,produces="application/json")
	@NoRepeatSubmit
	public R delCluster(@RequestBody @ApiParam(value="工作区对象",name="name",required=true) WorkAreaName name,
			@ApiParam(value="交管信息ID",name="clusterID",required=true) @RequestParam Integer clusterID){
		agvClusterService.delCluster(name, clusterID);
		return R.ok();
	}
	
	/*
	 * 修改交管信息
	 */
	@SysLog("修改交管信息")
	@ApiOperation(value="删除某个工作区交管信息",notes="ajax提交，两个对象：name和cluster,参数格式：json字符串")
	@RequestMapping(value="/modify",method=RequestMethod.POST,produces="application/json")
	@ApiImplicitParams({
		@ApiImplicitParam(name="name",value="工作区对象",dataType="WorkAreaName",paramType="body"),
		@ApiImplicitParam(name="cluster",value="交管对象",dataType="ClusterMessage",paramType="body")
	})
	@NoRepeatSubmit
	public R modifyCluster( WorkAreaName name,
			  ClusterMessage cluster){
		agvClusterService.modifyCluster(name, cluster);
		return R.ok();
	}
}
