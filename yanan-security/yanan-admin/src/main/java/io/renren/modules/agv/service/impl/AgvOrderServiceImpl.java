/**
 * Copyright (c) 2016-2019 雅南集团 All rights reserved.
 *
 * https://www.yanan.io
 *
 * 版权所有，侵权必究！
 */

package io.renren.modules.agv.service.impl;

import org.springframework.stereotype.Service;

import io.renren.common.agvs.AGVOrderMessage;
import io.renren.common.agvs.AGVSIServiceForView;
import io.renren.common.agvs.WorkAreaName;
import io.renren.common.utils.SingleAGV;
import io.renren.modules.agv.service.AgvOrderService;


/**
 * 
 * @author 吴航
 *
 */
@Service("AgvOrderService")
public class AgvOrderServiceImpl implements AgvOrderService {

	AGVSIServiceForView agv = SingleAGV.getAgvTarget();
	
	@Override
	public void addOrder(AGVOrderMessage orderMessage) {
		agv.addOrder(orderMessage);
		
	}

	@Override
	public void delOrder(WorkAreaName name, Integer orderID) {
		agv.delOrder(name, orderID);
		
	}

}
