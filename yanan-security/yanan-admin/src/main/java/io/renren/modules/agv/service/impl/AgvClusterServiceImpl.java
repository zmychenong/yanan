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
import io.renren.common.agvs.ClusterMessage;
import io.renren.common.agvs.WorkAreaName;
import io.renren.common.utils.SingleAGV;
import io.renren.modules.agv.service.AgvClusterService;

/**
 * 
 * @author 吴航
 *
 */
@Service("AgvClusterService")
public class AgvClusterServiceImpl implements AgvClusterService {

	AGVSIServiceForView agv = SingleAGV.getAgvTarget();
	@Override
	public void addCluster(WorkAreaName name, ClusterMessage cluster) {
		agv.addCluster(name, cluster);

	}

	@Override
	public void delCluster(WorkAreaName name, Integer clusterID) {
		agv.delCluster(name, clusterID);

	}

	@Override
	public void modifyCluster(WorkAreaName name, ClusterMessage cluster) {
		agv.modifyCluster(name, cluster);

	}

}
