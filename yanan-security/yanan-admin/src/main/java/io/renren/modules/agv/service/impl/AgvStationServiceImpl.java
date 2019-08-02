package io.renren.modules.agv.service.impl;

import org.springframework.stereotype.Service;

import io.renren.common.agvs.AGVSIServiceForView;
import io.renren.common.agvs.StationMessage;
import io.renren.common.agvs.WorkAreaName;
import io.renren.common.utils.SingleAGV;
import io.renren.modules.agv.service.AgvStationService;

/**
 * 
 * @author 吴航
 *
 */
@Service("AgvStationService")
public class AgvStationServiceImpl implements AgvStationService {

	AGVSIServiceForView agv = SingleAGV.getAgvTarget();
	@Override
	public void addStation(WorkAreaName name, StationMessage station) {
		agv.addStation(name, station);

	}

	@Override
	public void delStation(WorkAreaName name, Integer stationID) {
		agv.delStation(name, stationID);

	}

	@Override
	public void modifyStation(WorkAreaName name, StationMessage station) {
		agv.modifyStation(name, station);

	}

	@Override
	public StationMessage getStation(WorkAreaName name, Integer stationID) {
		StationMessage stationMessage = agv.getStation(name, stationID);
		return stationMessage;
	}

}
