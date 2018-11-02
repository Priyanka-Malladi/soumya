package com.cg.soumya.util;

import java.util.HashMap;
import java.util.Map;

import com.cg.soumya.bean.TransportBean;

public class DataBase {
	private static Map<String, String> transportDetails = new HashMap<>();
	private static Map<Integer, TransportBean> bookTransport = new HashMap<>();
	public static Map<String, String> getTransportDetails() {
		transportDetails.put("f-1","Flight");
		transportDetails.put("t-2","Train");
		transportDetails.put("t-1","Taxi");
		return transportDetails;
	}
	public static void addTransport(TransportBean bean) {
		bookTransport.put(bean.getId(), bean);
	}
	
}
