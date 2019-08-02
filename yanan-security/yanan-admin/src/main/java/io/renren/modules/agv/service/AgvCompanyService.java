/**
 * Copyright (c) 2016-2019 雅南集团 All rights reserved.
 *
 * https://www.yanan.io
 *
 * 版权所有，侵权必究！
 */

package io.renren.modules.agv.service;

import io.renren.common.agvs.Company;

/**
 * 
 * @author 吴航
 *
 */
public interface AgvCompanyService {

	/*
	 * 添加公司
	 */
	Boolean addCompany(Company name);
	
	/*
	 * 删除公司
	 */
	Boolean delCompany(Integer companyID);
	
	/*
	 * 修改公司信息
	 */
	Boolean modifyCompany(Company name);
	
	/*
	 * 根据ID得到公司对象
	 */
	Company getCompany(Integer companyID);
}
