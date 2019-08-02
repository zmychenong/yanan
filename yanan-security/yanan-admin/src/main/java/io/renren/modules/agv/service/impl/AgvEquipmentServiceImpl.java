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
import io.renren.common.agvs.EquipmentData;
import io.renren.common.agvs.WorkAreaName;
import io.renren.common.utils.SingleAGV;
import io.renren.modules.agv.service.AgvEquipmentService;

/**
 * 
 * @author 吴航
 *
 */
@Service("AgvEquipmentService")
public class AgvEquipmentServiceImpl implements AgvEquipmentService {

	AGVSIServiceForView agv = SingleAGV.getAgvTarget();
	@Override
	public Boolean addEquipment(WorkAreaName name, EquipmentData equipment) {
		Boolean result = agv.addEquipment(name, equipment);
		return result;
	}

	@Override
	public Boolean delEquipment(WorkAreaName name, Integer equipmentID) {
		Boolean result = agv.delEquipment(name, equipmentID);
		return result;
	}

	@Override
	public Boolean modifyEquipment(WorkAreaName name, EquipmentData equipment) {
		Boolean result = agv.modifyEquipment(name, equipment);
		return result;
	}

	@Override
	public EquipmentData getEquipment(WorkAreaName name, Integer equipmentID) {
		EquipmentData equipmentData = agv.getEquipment(name, equipmentID);
		return equipmentData;
	}

}
