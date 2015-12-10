package com.deviceApp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Entity
@Table(name = "device")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

public class DeviceDetails {
	
	@Id
	@Column(name = "id")
	private long id;
	
	@Column(name = "pin")
	private String pin;
	
	@Column(name = "topology")
	private String topology;
	
	@Column(name = "model")
	private String model;
	
	@Column(name = "location")
	private String location;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public String getTopology() {
		return topology;
	}
	public void setTopology(String topology) {
		this.topology = topology;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

}
