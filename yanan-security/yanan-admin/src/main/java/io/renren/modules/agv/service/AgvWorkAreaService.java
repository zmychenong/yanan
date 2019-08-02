/**
 * Copyright (c) 2016-2019 雅南集团 All rights reserved.
 *
 * https://www.yanan.io
 *
 * 版权所有，侵权必究！
 */

package io.renren.modules.agv.service;

import io.renren.common.agvs.WorkAreaName;

/**
 * 
 * @author 吴航
 *
 */
public interface AgvWorkAreaService {

	/*
	 * 添加工作区
	 */
	Boolean addWorkArea(WorkAreaName name);
	
	/*
	 * 删除工作区
	 */
	Boolean delWorkArea(Integer companyID,Integer factoryID,Integer workAreaID);
	
	/*
	 * 修改工作区
	 */
	Boolean modifyWorkArea(WorkAreaName name);
	
	/*
	 * 获得单个工作区对象
	 */
	WorkAreaName getWorkArea(Integer companyID,Integer factoryID,Integer workAreaID);
}
