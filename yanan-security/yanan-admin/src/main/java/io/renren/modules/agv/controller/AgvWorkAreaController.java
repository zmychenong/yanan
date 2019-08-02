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

import io.renren.common.agvs.WorkAreaName;
import io.renren.common.annotation.SysLog;
import io.renren.common.utils.NoRepeatSubmit;
import io.renren.common.utils.R;
import io.renren.modules.agv.service.AgvWorkAreaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * AGV工作区管理接口
 * @author 吴航
 *
 */
@RestController
@RequestMapping("/agv/workarea")
@Api(value="AGV工作区管理接口",tags="AGV工作区管理接口")
public class AgvWorkAreaController {

	
	@Autowired
	AgvWorkAreaService agvWorkAreaService;
	/*
	 * 新增工作区
	 */
	@SysLog("新增工作区")
	@ApiOperation(value="新增工作区",notes="ajax提交，提交方式:post,参数格式：json对象")
	@RequestMapping(value="/add",method=RequestMethod.POST,produces="application/json;charset=utf-8")
	@ApiResponses({
		@ApiResponse(code = 200,message = "成功！"),
        @ApiResponse(code = 401,message = "未授权！"),
        @ApiResponse(code = 404,message = "页面未找到！"),
        @ApiResponse(code = 403,message = "出错了！"),
        @ApiResponse(code = 400,message = "参数填写错误！")
	})
	@NoRepeatSubmit
	public void addWorkArea(@RequestBody WorkAreaName name){
		Boolean result = agvWorkAreaService.addWorkArea(name);
		R.getResult(result);
	}
	
	/*
	 * 删除工作区
	 */
	@SysLog("删除工作区")
	@ApiOperation(value="删除工作区",notes="ajax提交，提交方式:post,参数格式：json字符串")
	@RequestMapping(value="/del",method=RequestMethod.POST,produces="application/json;charset=utf-8")
	@ApiResponses({
		@ApiResponse(code = 200,message = "成功！"),
        @ApiResponse(code = 401,message = "未授权！"),
        @ApiResponse(code = 404,message = "页面未找到！"),
        @ApiResponse(code = 403,message = "出错了！"),
        @ApiResponse(code = 400,message = "参数填写错误！")
	})
	@NoRepeatSubmit
	public void delWorkArea(@RequestParam Integer companyID,
			@RequestParam Integer factoryID,@RequestParam Integer workAreaID){
		Boolean result = agvWorkAreaService.delWorkArea(companyID, factoryID, workAreaID);
		R.getResult(result);
	}
	
	
	/*
	 * 修改工作区
	 */
	@SysLog("修改工作区")
	@ApiOperation(value="修改工作区",notes="ajax提交，提交方式:post,参数格式：json对象")
	@RequestMapping(value="/modify",method=RequestMethod.POST,produces="application/json;charset=utf-8")
	@ApiResponses({
		@ApiResponse(code = 200,message = "成功！"),
        @ApiResponse(code = 401,message = "未授权！"),
        @ApiResponse(code = 404,message = "页面未找到！"),
        @ApiResponse(code = 403,message = "出错了！"),
        @ApiResponse(code = 400,message = "参数填写错误！")
	})
	@NoRepeatSubmit
	public void modifyWorkArea(@RequestBody WorkAreaName name){
		Boolean result = agvWorkAreaService.modifyWorkArea(name);
		R.getResult(result);
	}
	
	/*
	 * 获取单个工作区对象
	 */
	@ApiOperation(value="获取单个工作区对象",notes="ajax提交，提交方式:get,参数格式：json字符串")
	@RequestMapping(value="/getWorkArea",method=RequestMethod.GET,produces="application/json;charset=utf-8")
	@ApiResponses({
		@ApiResponse(code = 200,message = "成功！"),
        @ApiResponse(code = 401,message = "未授权！"),
        @ApiResponse(code = 404,message = "页面未找到！"),
        @ApiResponse(code = 403,message = "出错了！"),
        @ApiResponse(code = 400,message = "参数填写错误！")
	})
	@NoRepeatSubmit
	public R getWorkArea(@RequestParam Integer companyID,
			@RequestParam Integer factoryID,@RequestParam Integer workAreaID){
		WorkAreaName workArea = agvWorkAreaService.getWorkArea(companyID, factoryID, workAreaID);
		if(workArea!=null){
			return R.ok().put("workArea", workArea);
		}else{
			return R.error("无此工作区！");
		}
	}
}
