package com.cg.soumya.dao;

import java.util.Map;

import com.cg.soumya.bean.TransportBean;
import com.cg.soumya.exception.TransportException;

public interface ITransportDao {

	Map<String, String> getTransportDetails() throws TransportException;

	void addTransport(TransportBean bean)throws TransportException;

}
