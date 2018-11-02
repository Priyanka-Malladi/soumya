package com.cg.soumya.service;

import java.util.Map;

import com.cg.soumya.bean.TransportBean;
import com.cg.soumya.exception.TransportException;

public interface ITransportService {

	Map<String, String> getTtansportDetails() throws TransportException;

	void addTransport(TransportBean bean) throws TransportException;

}
