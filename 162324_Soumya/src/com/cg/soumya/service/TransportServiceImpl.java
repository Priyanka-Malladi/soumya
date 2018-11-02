package com.cg.soumya.service;

import java.util.Map;

import com.cg.soumya.bean.TransportBean;
import com.cg.soumya.dao.ITransportDao;
import com.cg.soumya.dao.TransportDaoImpl;
import com.cg.soumya.exception.TransportException;

public class TransportServiceImpl implements ITransportService {
	ITransportDao dao = new TransportDaoImpl();
	@Override
	public Map<String, String> getTtansportDetails() throws TransportException {
		// TODO Auto-generated method stub
		return dao.getTransportDetails();
	}
	@Override
	public void addTransport(TransportBean bean) throws TransportException {
		// TODO Auto-generated method stub
		dao.addTransport(bean);
	}

}
