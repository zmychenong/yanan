/**
 * Copyright (c) 2016-2019 雅南集团 All rights reserved.
 *
 * https://www.yanan.io
 *
 * 版权所有，侵权必究！
 */

package io.renren.modules.agv.service.impl;

import org.springframework.stereotype.Service;

import io.renren.common.agvs.AGVSIServiceForView;
import io.renren.common.agvs.Company;
import io.renren.common.utils.SingleAGV;
import io.renren.modules.agv.service.AgvCompanyService;

@Service("AgvCompanyService")
public class AgvCompanyServiceImpl implements AgvCompanyService {

	AGVSIServiceForView agv = SingleAGV.getAgvTarget();
	@Override
	public Boolean addCompany(Company name) {
		Boolean result = agv.addCompany(name);
		return result;
	}

	@Override
	public Boolean delCompany(Integer companyID) {
		Boolean result = agv.delCompany(companyID);
		return result;
	}

	@Override
	public Boolean modifyCompany(Company name) {
		Boolean result = agv.modifyCompany(name);
		return result;
	}

	@Override
	public Company getCompany(Integer companyID) {
		Company company = agv.getCompany(companyID);
		return company;
	}

}
