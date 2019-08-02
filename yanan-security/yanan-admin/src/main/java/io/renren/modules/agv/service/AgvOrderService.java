/**
 * Copyright (c) 2016-2019 雅南集团 All rights reserved.
 *
 * https://www.yanan.io
 *
 * 版权所有，侵权必究！
 */

package io.renren.modules.agv.service;

import io.renren.common.agvs.AGVOrderMessage;
import io.renren.common.agvs.WorkAreaName;

/**
 * AGV任务接口
 * @author 吴航
 *
 */
public interface AgvOrderService {

	/*
	 * 新增AGV任务
	 */
	void addOrder(AGVOrderMessage orderMessage);
	
	/*
	 * 删除AGV任务
	 */
	void delOrder(WorkAreaName name,Integer orderID);
}
