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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.renren.common.agvs.Factory;
import io.renren.common.annotation.SysLog;
import io.renren.common.utils.NoRepeatSubmit;
import io.renren.common.utils.R;
import io.renren.modules.agv.service.AgvFactoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * AGV仓库管理
 * @author 吴航
 *
 */
@RequestMapping("/agv/factory")
@RestController
@Api(value="AGV仓库管理接口",tags="AGV仓库管理接口")
public class AgvFactoryController {

	@Autowired
	AgvFactoryService agvFactoryService;
	
	/*
	 * 修改仓库信息
	 */
	@SysLog("修改仓库信息")
	@ApiOperation(value="修改仓库信息",notes="ajax提交，提交方式:post,参数格式：json对象")
	@RequestMapping(value="/modify",method=RequestMethod.POST,produces="application/json;charset=utf-8")
	@ApiResponses({
		@ApiResponse(code = 200,message = "成功！"),
        @ApiResponse(code = 401,message = "未授权！"),
        @ApiResponse(code = 404,message = "页面未找到！"),
        @ApiResponse(code = 403,message = "出错了！"),
        @ApiResponse(code = 400,message = "参数填写错误！")
	})
	@NoRepeatSubmit
	public void modifyFactory(@RequestBody Factory name){
		Boolean result = agvFactoryService.modifyFactory(name);
		R.getResult(result);
		
	}
	
	
	/*
	 * 删除仓库信息
	 */
	@SysLog("删除仓库信息")
	@ApiOperation(value="删除仓库信息",notes="ajax提交，提交方式:post,参数格式：json字符串")
	@RequestMapping(value="/del",method=RequestMethod.POST,produces="application/json;charset=utf-8")
	@ApiResponses({
		@ApiResponse(code = 200,message = "成功！"),
        @ApiResponse(code = 401,message = "未授权！"),
        @ApiResponse(code = 404,message = "页面未找到！"),
        @ApiResponse(code = 403,message = "出错了！"),
        @ApiResponse(code = 400,message = "参数填写错误！")
	})
	@NoRepeatSubmit
	public void delFactory(@RequestParam("companyID") Integer companyID,@RequestParam("factoryID") Integer factoryID) {
		Boolean result = agvFactoryService.delFactory(companyID, factoryID);
		R.getResult(result);
	}
	
	/*
	 * 单个仓库
	 */
	@ResponseBody
	@ApiOperation(value="获取单个仓库对象",notes="ajax提交，提交方式:post,参数格式：json字符串")
	@RequestMapping(value="/getFactory",method=RequestMethod.POST,produces="application/json;charset=utf-8")
	@ApiResponses({
		@ApiResponse(code = 200,message = "成功！"),
        @ApiResponse(code = 401,message = "未授权！"),
        @ApiResponse(code = 404,message = "页面未找到！"),
        @ApiResponse(code = 403,message = "出错了！"),
        @ApiResponse(code = 400,message = "参数填写错误！")
	})
	@NoRepeatSubmit
	public R getFactory(@RequestParam("companyID") Integer companyID,@RequestParam("factoryID") Integer factoryID){
		Factory factory = agvFactoryService.getFactory(companyID, factoryID);
		if(factory!=null){
			return R.ok().put("factory", factory);
		}else{
			return R.error("无此仓库！");
		}
	}
	
	/*
	 * 添加仓库
	 */
	@SysLog("添加仓库信息")
	@ApiOperation(value="添加仓库信息",notes="ajax提交，参数格式：json对象")
	@RequestMapping(value="/add",method=RequestMethod.POST,produces="application/json;charset=utf-8")
	@ApiImplicitParam(name="name",value="仓库对象",dataType="Factory",paramType="body")
	@ApiResponses({
		@ApiResponse(code = 200,message = "成功！"),
        @ApiResponse(code = 401,message = "未授权！"),
        @ApiResponse(code = 404,message = "页面未找到！"),
        @ApiResponse(code = 403,message = "出错了！"),
        @ApiResponse(code = 400,message = "参数填写错误！")
	})
	@NoRepeatSubmit
	public void addFactory(@RequestBody Factory name){
		Boolean result = agvFactoryService.addFactory(name);
		R.getResult(result);
	}
	
}
