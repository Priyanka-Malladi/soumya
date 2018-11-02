package com.cg.soumya.dao;

import java.util.Map;

import com.cg.soumya.bean.TransportBean;
import com.cg.soumya.exception.TransportException;
import com.cg.soumya.util.DataBase;

public class TransportDaoImpl implements ITransportDao {

	@Override
	public Map<String, String> getTransportDetails() throws TransportException{
		return DataBase.getTransportDetails();
	}

	@Override
	public void addTransport(TransportBean bean) throws TransportException {
		DataBase.addTransport(bean);
	}

}
