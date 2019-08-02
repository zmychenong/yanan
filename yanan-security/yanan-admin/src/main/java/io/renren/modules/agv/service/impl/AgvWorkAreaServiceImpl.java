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
import io.renren.common.agvs.WorkAreaName;
import io.renren.common.utils.SingleAGV;
import io.renren.modules.agv.service.AgvWorkAreaService;

@Service("AgvWorkAreaService")
public class AgvWorkAreaServiceImpl implements AgvWorkAreaService {

	AGVSIServiceForView agv = SingleAGV.getAgvTarget();
	@Override
	public Boolean addWorkArea(WorkAreaName name) {
		Boolean result = agv.addWorkArea(name);
		return result;
	}

	@Override
	public Boolean delWorkArea(Integer companyID, Integer factoryID, Integer workAreaID) {
		Boolean result = agv.delWorkArea(companyID, factoryID, workAreaID);
		return result;
	}

	@Override
	public Boolean modifyWorkArea(WorkAreaName name) {
		Boolean result = agv.modifyWorkArea(name);
		return result;
	}

	@Override
	public WorkAreaName getWorkArea(Integer companyID, Integer factoryID, Integer workAreaID) {
		WorkAreaName workArea = agv.getWorkArea(companyID, factoryID, workAreaID);
		return workArea;
	}

}
