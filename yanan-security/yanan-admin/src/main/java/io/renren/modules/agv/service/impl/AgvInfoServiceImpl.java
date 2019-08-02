/**
 * Copyright (c) 2016-2019 雅南集团 All rights reserved.
 *
 * https://www.yanan.io
 *
 * 版权所有，侵权必究！
 */

package io.renren.modules.agv.service.impl;

import org.springframework.stereotype.Service;

import io.renren.common.agvs.AGVName;
import io.renren.common.agvs.AGVSIServiceForView;
import io.renren.common.agvs.WorkAreaName;
import io.renren.common.utils.SingleAGV;
import io.renren.modules.agv.service.AgvInfoService;

/**
 * 
 * @author 吴航
 *
 */
@Service("AgvInfoService")
public class AgvInfoServiceImpl implements AgvInfoService {

	AGVSIServiceForView agv = SingleAGV.getAgvTarget();
	
	@Override
	public void addRegisterCarrier(AGVName name) {
		
		agv.addRegisterCarrier(name);
	}

	@Override
	public void delRegisterCarrier(AGVName name) {
		
		agv.delRegisterCarrier(name);
		
	}

	@Override
	public void modifyCarrier(AGVName name) {
		
		agv.modifyCarrier(name);
		
	}

	@Override
	public AGVName getCarrier(WorkAreaName name, Integer id) {
		AGVName agvName = agv.getCarrier(name, id);
		
		return agvName;
	}

}
