package com.deviceApp.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.deviceApp.dao.DeviceDao;
import com.deviceApp.model.DeviceDetails;

public class DeviceServicesImpl implements DeviceServices {
	
	@Autowired
	DeviceDao devicedao;
	
	public boolean addEntity(DeviceDetails devicedetails) throws Exception {
		return devicedao.addDevice(devicedetails);
		
	}
	
	public DeviceDetails getEntityById(long id) throws Exception {
		return devicedao.getDeviceById(id);
	}
	
	public List<DeviceDetails> getEntityList() throws Exception {
		return devicedao.getDeviceList();
	}

}
