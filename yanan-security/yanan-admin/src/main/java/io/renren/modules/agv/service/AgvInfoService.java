/**
 * Copyright (c) 2016-2019 雅南集团 All rights reserved.
 *
 * https://www.yanan.io
 *
 * 版权所有，侵权必究！
 */

package io.renren.modules.agv.service;

import io.renren.common.agvs.AGVName;
import io.renren.common.agvs.WorkAreaName;

/**
 * 
 * @author 吴航
 *
 */
public interface AgvInfoService {

	/*
	 * AGV信息显示
	 */
	
	
	/*
	 * 新增AGV信息
	 */
	void addRegisterCarrier(AGVName name);
	
	/*
	 * 删除AGV信息
	 */
	void delRegisterCarrier(AGVName name);
	
	/*
	 * 修改AGV信息
	 */
	void modifyCarrier(AGVName name);
	
	/*
	 * 获得单个AGV的信息
	 */
	AGVName getCarrier(WorkAreaName name,Integer id);
}
