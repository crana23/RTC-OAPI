package com.deviceApp.services;

import java.util.List;

import com.deviceApp.model.DeviceDetails;



public interface DeviceServices {

	public boolean addEntity(DeviceDetails devicedetails) throws Exception;
	public DeviceDetails getEntityById(long id) throws Exception;
	public List<DeviceDetails> getEntityList() throws Exception;
	
}
