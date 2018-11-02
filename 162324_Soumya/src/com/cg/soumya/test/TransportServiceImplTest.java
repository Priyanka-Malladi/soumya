package com.cg.soumya.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cg.soumya.bean.TransportBean;
import com.cg.soumya.service.ITransportService;
import com.cg.soumya.service.TransportServiceImpl;

public class TransportServiceImplTest {
	private static ITransportService service = null;
	private static TransportBean Bean = null;

	@BeforeClass
	public static void creatInstance() {

		service = new TransportServiceImpl();
		Bean = new TransportBean();

	}

	@Test
	public void test() {
		
	}

}
