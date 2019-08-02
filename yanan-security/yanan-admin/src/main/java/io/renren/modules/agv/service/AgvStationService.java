/**
 * Copyright (c) 2016-2019 雅南集团 All rights reserved.
 *
 * https://www.yanan.io
 *
 * 版权所有，侵权必究！
 */

package io.renren.modules.agv.service;

import io.renren.common.agvs.StationMessage;
import io.renren.common.agvs.WorkAreaName;

/**
 * AGV站点接口
 * @author 吴航
 *
 */
public interface AgvStationService {

	/*
	 * 新增站点
	 */
	void addStation(WorkAreaName name,StationMessage station);
	
	/*
	 * 删除站点
	 */
	void delStation(WorkAreaName name,Integer stationID);
	
	/*
	 * 修改站点
	 */
	void modifyStation(WorkAreaName name,StationMessage station);
	
	/*
	 * 获取单个站点信息
	 */
	StationMessage getStation(WorkAreaName name,Integer stationID);
}
