package com.deviceApp.dao;


import java.util.List;

import com.deviceApp.model.DeviceDetails;

public interface DeviceDao {
	public boolean addDevice(DeviceDetails devicedetails) throws Exception;
	public DeviceDetails getDeviceById(long id) throws Exception;
	public List<DeviceDetails> getDeviceList() throws Exception;

}
