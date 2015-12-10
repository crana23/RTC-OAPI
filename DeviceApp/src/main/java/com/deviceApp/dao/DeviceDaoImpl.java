package com.deviceApp.dao;




import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import com.deviceApp.model.DeviceDetails;

public class DeviceDaoImpl implements DeviceDao{

	@Autowired
	SessionFactory sessionFactory;

	Session session = null;
	Transaction tx = null;


	public boolean addDevice(DeviceDetails devicedetails) throws Exception {
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		session.save(devicedetails);
		tx.commit();
		session.close();

		return false;
	}


	public DeviceDetails getDeviceById(long id) throws Exception {
		session = sessionFactory.openSession();
		DeviceDetails devicedetails = (DeviceDetails) session.load(DeviceDetails.class,
				new Long(id));
		tx = session.getTransaction();
		session.beginTransaction();
		tx.commit();
		return devicedetails;
	}

	@SuppressWarnings("unchecked")
	public List<DeviceDetails> getDeviceList() throws Exception {
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		List<DeviceDetails> employeeList = session.createCriteria(DeviceDetails.class)
				.list();
		tx.commit();
		session.close();
		return employeeList;
	}
}
