package com.cg.soumya.ui;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.Scanner;

import com.cg.soumya.bean.TransportBean;
import com.cg.soumya.exception.TransportException;
import com.cg.soumya.service.ITransportService;
import com.cg.soumya.service.TransportServiceImpl;

public class Client {
	public static void main(String[] args) {
		try{
		TransportBean bean = new TransportBean();
		ITransportService service = new TransportServiceImpl();
		Map<String, String> transportDetails = service.getTtansportDetails();
		System.out.println(" Mode of transport ");
		int count=1;
		for (Map.Entry<String, String> entrySet:transportDetails.entrySet()) {
			System.out.println(count + "." + entrySet.getValue());
			count++;
		}
		System.out.println(" Enter option");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		//Set TransportCatigoryId
		int count1=1;
		for (Map.Entry<String, String> entrySet:transportDetails.entrySet()) {
			if (choice == count1) {
				bean.setTransportCatigoryId(entrySet.getKey());
			}
			count1++;
		}
		//set id
		int id = (int) (Math.random()*10000);
		bean.setId(id);
		//set reason
		System.out.println(" Enter Reason ");
		scanner.nextLine();
		String reason = scanner.nextLine();
		bean.setReason(reason);
		System.out.println("When: \n 1. This Week \n2. Next Week\n 3. Next Month");
		int whenChoice = scanner.nextInt();
		if (whenChoice == 1) {
			bean.setWhen("This Week");
		} else if (whenChoice == 2) {
			bean.setWhen("Next Week");
		} else if (whenChoice == 3) {
			bean.setWhen("Next Month");
		} 
		service.addTransport(bean);
		LocalDateTime dateTime = LocalDateTime.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd MMMM yyyy hh:mm a");
		System.out.println("Booked With ID: " + id + " on " + dateTime.format(format));
		}catch (TransportException transportException) {
			System.out.println("Error");
		} catch (Exception  e) {
			System.out.println("Error");		}
	}
}
