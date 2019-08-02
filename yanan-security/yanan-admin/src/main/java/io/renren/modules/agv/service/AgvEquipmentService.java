/**
 * Copyright (c) 2016-2019 雅南集团 All rights reserved.
 *
 * https://www.yanan.io
 *
 * 版权所有，侵权必究！
 */


package io.renren.modules.agv.service;

import io.renren.common.agvs.EquipmentData;
import io.renren.common.agvs.WorkAreaName;

/**
 * AGV设备接口
 * @author 吴航
 *
 */
public interface AgvEquipmentService {

	/*
	 * 新增设备
	 */
	Boolean addEquipment(WorkAreaName name,EquipmentData equipment);
	
	/*
	 * 删除设备
	 */
	Boolean delEquipment(WorkAreaName name,Integer equipmentID);
	
	/*
	 * 修改设备
	 */
	Boolean modifyEquipment(WorkAreaName name,EquipmentData equipment);
	
	/*
	 * 获取单个设备
	 */
	EquipmentData getEquipment(WorkAreaName name,Integer equipmentID);
}
