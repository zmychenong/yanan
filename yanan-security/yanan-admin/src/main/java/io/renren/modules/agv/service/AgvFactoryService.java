/**
 * Copyright (c) 2016-2019 雅南集团 All rights reserved.
 *
 * https://www.yanan.io
 *
 * 版权所有，侵权必究！
 */

package io.renren.modules.agv.service;

import io.renren.common.agvs.Factory;

/**
 * 
 * @author 吴航
 *
 */
public interface AgvFactoryService {

	/*
	 * 修改仓库
	 */
	Boolean modifyFactory(Factory name);
	
	/*
	 * 单个仓库
	 */
	Factory getFactory(Integer companyID,Integer factoryID);
	
	/*
	 * 删除仓库
	 */
	Boolean delFactory(Integer companyID,Integer factoryID);
	
	/*
	 * 添加仓库
	 */
	Boolean addFactory(Factory name);
}
