/**
 * Copyright (c) 2016-2019 雅南集团 All rights reserved.
 *
 * https://www.yanan.io
 *
 * 版权所有，侵权必究！
 */

package io.renren.modules.agv.service;

import io.renren.common.agvs.ClusterMessage;
import io.renren.common.agvs.WorkAreaName;

/**
 * AGV交管接口
 * @author 吴航
 *
 */
public interface AgvClusterService {

	/*
	 * 新增交管信息
	 */
	void addCluster(WorkAreaName name,ClusterMessage cluster);
	
	/*
	 * 删除交管信息
	 */
	void delCluster(WorkAreaName name,Integer clusterID);
	
	/*
	 * 修改交管信息
	 */
	void modifyCluster(WorkAreaName name,ClusterMessage cluster);
}
