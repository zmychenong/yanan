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

import io.renren.common.agvs.Company;
import io.renren.common.utils.NoRepeatSubmit;
import io.renren.common.utils.R;
import io.renren.modules.agv.service.AgvCompanyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * 
 * @author 吴航
 *
 */
@RestController
@RequestMapping("/agv/company")
@Api(value="AGV公司管理接口",tags="AGV公司管理接口")
public class AgvCompanyController {

	@Autowired
	private AgvCompanyService agvCompanyService;
	
	/*
	 * 添加公司
	 */
	@ApiOperation(value="添加公司信息",notes="ajax提交，提交方式:post,参数格式：json对象")
	@RequestMapping(value="/add",method=RequestMethod.POST,produces="application/json;charset=utf-8")
	@ApiResponses({
		@ApiResponse(code = 200,message = "成功！"),
        @ApiResponse(code = 401,message = "未授权！"),
        @ApiResponse(code = 404,message = "页面未找到！"),
        @ApiResponse(code = 403,message = "出错了！"),
        @ApiResponse(code = 400,message = "参数填写错误！")
	})
	@NoRepeatSubmit
	public void addCompany(@RequestBody Company name){
		Boolean result = agvCompanyService.addCompany(name);
		R.getResult(result);
	}
	
	/*
	 * 删除公司
	 */
	@ApiOperation(value="删除公司信息",notes="ajax提交，提交方式:post,参数格式：json字符串")
	@RequestMapping(value="/del",method=RequestMethod.POST,produces="application/json;charset=utf-8")
	@ApiResponses({
		@ApiResponse(code = 200,message = "成功！"),
        @ApiResponse(code = 401,message = "未授权！"),
        @ApiResponse(code = 404,message = "页面未找到！"),
        @ApiResponse(code = 403,message = "出错了！"),
        @ApiResponse(code = 400,message = "参数填写错误！")
	})
	@NoRepeatSubmit
	public void delCompany(@RequestParam Integer companyID){
		Boolean result = agvCompanyService.delCompany(companyID);
		R.getResult(result);
	}
	
	/*
	 * 修改公司
	 */
	@ApiOperation(value="修改公司信息",notes="ajax提交，提交方式:post,参数格式：json对象")
	@RequestMapping(value="/modify",method=RequestMethod.POST,produces="application/json;charset=utf-8")
	@ApiResponses({
		@ApiResponse(code = 200,message = "成功！"),
        @ApiResponse(code = 401,message = "未授权！"),
        @ApiResponse(code = 404,message = "页面未找到！"),
        @ApiResponse(code = 403,message = "出错了！"),
        @ApiResponse(code = 400,message = "参数填写错误！")
	})
	@NoRepeatSubmit
	public void modifyCompany(@RequestBody Company name){
		Boolean result = agvCompanyService.modifyCompany(name);
		R.getResult(result);
	}
	
	/*
	 * 获取公司对象
	 */
	@ApiOperation(value="获得单个公司对象",notes="ajax提交，提交方式:post,参数格式：json字符串")
	@RequestMapping(value="/getCompany",method=RequestMethod.GET,produces="application/json;charset=utf-8")
	@ApiResponses({
		@ApiResponse(code = 200,message = "成功！"),
        @ApiResponse(code = 401,message = "未授权！"),
        @ApiResponse(code = 404,message = "页面未找到！"),
        @ApiResponse(code = 403,message = "出错了！"),
        @ApiResponse(code = 400,message = "参数填写错误！")
	})
	@NoRepeatSubmit
	public R getCompany(@RequestParam Integer companyID){
		Company company = agvCompanyService.getCompany(companyID);
		if(company!=null){
			return R.ok().put("company", company);
		}else{
			return R.error("无此公司！");
		}
	}
}
