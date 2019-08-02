package io.renren.modules.agv.service.impl;

import org.springframework.stereotype.Service;

import io.renren.common.agvs.AGVSIServiceForView;
import io.renren.common.agvs.Factory;
import io.renren.common.utils.SingleAGV;
import io.renren.modules.agv.service.AgvFactoryService;
@Service("AgvFactoryService")
public class AgvFactoryServiceImpl implements AgvFactoryService {

	AGVSIServiceForView agv = SingleAGV.getAgvTarget();
	@Override
	public Boolean modifyFactory(Factory name) {
		Boolean result = agv.modifyFactory(name);
		return result;
	}

	@Override
	public Factory getFactory(Integer companyID, Integer factoryID) {
		Factory factory = agv.getFactory(companyID, factoryID);
		return factory;
	}

	@Override
	public Boolean delFactory(Integer companyID, Integer factoryID) {
		Boolean result = agv.delFactory(companyID, factoryID);
		return result;
	}

	@Override
	public Boolean addFactory(Factory name) {
		Boolean result = agv.addFactory(name);
		return result;
	}

}
