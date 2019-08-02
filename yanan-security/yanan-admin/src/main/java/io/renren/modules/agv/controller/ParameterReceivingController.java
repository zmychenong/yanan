/**
 * Copyright (c) 2016-2019 雅南集团 All rights reserved.
 *
 * https://www.yanan.io
 *
 * 版权所有，侵权必究！
 */

package io.renren.modules.agv.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.renren.common.utils.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import net.sf.json.JSONObject;

/**
 * 前端参数接收类
 *
 * @author 吴航
 */

@RestController
@Api(value="数据传输接口",tags="数据传输接口")
@RequestMapping("/sys/parameterReceiving")
public class ParameterReceivingController {

	@ResponseBody
	@ApiOperation(value="参数转换",notes="ajax提交，返回值：json字符串")
	@RequestMapping(value="/postAndJson",method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ApiImplicitParam(value="json参数jsonParam",name="jsonParam",required=true)
	@ApiResponses({
		@ApiResponse(code = 200,message = "成功！"),
        @ApiResponse(code = 401,message = "未授权！"),
        @ApiResponse(code = 404,message = "页面未找到！"),
        @ApiResponse(code = 403,message = "出错了！"),
        @ApiResponse(code = 400,message = "参数填写错误！")
	})
	public R postAndJson(@RequestBody String jsonParam){
		JSONObject obj = JSONObject.fromObject(jsonParam);
		System.out.println("sss"+obj);
		
		String name = obj.getString("companyID");
		System.out.println(name);
		return R.ok().put("result", name);
	}
}
