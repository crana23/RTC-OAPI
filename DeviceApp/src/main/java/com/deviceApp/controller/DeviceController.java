package com.deviceApp.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.deviceApp.model.DeviceDetails;
import com.deviceApp.model.Status;
import com.deviceApp.services.DeviceServices;


@Controller
@RequestMapping("/device")
public class DeviceController {
	
	@Autowired
	DeviceServices deviceServices;
	
	static final Logger logger = Logger.getLogger(DeviceController.class);
	
	@RequestMapping(value = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody
	Status addDevice(@RequestBody DeviceDetails devicedetails) {
		try {
			deviceServices.addEntity(devicedetails);
			return new Status(1, "Device added Successfully !");
		} catch (Exception e) {
			// e.printStackTrace();
			return new Status(0, e.toString());
		}

	}
	
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public @ResponseBody
	DeviceDetails getDevice(@PathVariable("id") long id) {
		DeviceDetails devicedetails = null;
		try {
			devicedetails = deviceServices.getEntityById(id);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return devicedetails;
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public @ResponseBody
	List<DeviceDetails> getEmployee() {

		List<DeviceDetails> deviceList = null;
		try {
			deviceList = deviceServices.getEntityList();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return deviceList;
	}

}

