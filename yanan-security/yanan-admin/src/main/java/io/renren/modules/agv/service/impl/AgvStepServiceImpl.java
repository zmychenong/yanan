package io.renren.modules.agv.service.impl;

import org.springframework.stereotype.Service;

import io.renren.common.agvs.AGVSIServiceForView;
import io.renren.common.agvs.AGVStepMessage;
import io.renren.common.agvs.WorkAreaName;
import io.renren.common.utils.SingleAGV;
import io.renren.modules.agv.service.AgvStepService;

@Service("AgvStepService")
public class AgvStepServiceImpl implements AgvStepService {

	AGVSIServiceForView agv = SingleAGV.getAgvTarget();
	@Override
	public Boolean addStep(WorkAreaName name, AGVStepMessage agvStep) {
		Boolean result = agv.addStep(name, agvStep);
		return result;
	}

	@Override
	public Boolean delStep(WorkAreaName name, AGVStepMessage agvStep) {
		Boolean result = agv.delStep(name, agvStep);
		return result;
	}

	@Override
	public Boolean modifyStep(WorkAreaName name, AGVStepMessage agvStep) {
		Boolean result = agv.modifyStep(name, agvStep);
		return result;
	}

}
