/**
 * Copyright (c) 2016-2019 雅南集团 All rights reserved.
 *
 * https://www.yanan.io
 *
 * 版权所有，侵权必究！
 */
package io.renren.common.utils;

import javax.xml.ws.WebServiceException;

import io.renren.common.agvs.AGVSIServiceForView;
import io.renren.common.agvs.AGVSServiceForView;

/**
 * 使用单例模式，AGV对象只有一个
 *
 * @author 吴航
 */
public class SingleAGV {

	private SingleAGV() {
	}

	/**
	 * 双重校验的单例模式
	 */
	private static volatile AGVSServiceForView agvTarget = null;
	private static volatile AGVSIServiceForView agvObject = null;

	public static AGVSIServiceForView getAgvTarget() {
		if (agvTarget == null) {
			if (agvObject == null) {
				synchronized (AGVSIServiceForView.class) {
					if (agvTarget == null) {
						if (agvObject == null) {
							try {
								agvTarget = new AGVSServiceForView();
								agvObject = agvTarget.getBasicHttpBindingAGVSIServiceForView();
							} catch (WebServiceException e) {
								new R().info();
							}
						}

					}
				}

			}
		}
		
		return agvObject;
	}

}
