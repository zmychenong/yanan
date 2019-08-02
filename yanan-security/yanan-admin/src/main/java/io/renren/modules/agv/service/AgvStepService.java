/**
 * Copyright (c) 2016-2019 雅南集团 All rights reserved.
 *
 * https://www.yanan.io
 *
 * 版权所有，侵权必究！
 */

package io.renren.modules.agv.service;

import io.renren.common.agvs.AGVStepMessage;
import io.renren.common.agvs.WorkAreaName;

/**
 * 
 * @author 吴航
 *
 */
public interface AgvStepService {

	/*
	 * 工作区增加节点接口
	 */
	Boolean addStep(WorkAreaName name,AGVStepMessage agvStep);
	
	
	/*
	 * 删除节点
	 */
	Boolean delStep(WorkAreaName name,AGVStepMessage agvStep);
	
	/*
	 * 修改节点
	 */
	Boolean modifyStep(WorkAreaName name,AGVStepMessage agvStep);
}
