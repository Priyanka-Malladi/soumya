package com.cg.frs.ui;

import java.util.ArrayList;
import java.util.Scanner;

import javax.sound.midi.Synthesizer;

import com.cg.frs.dto.FlatRegistrationDTO;
import com.cg.frs.exception.RegistrationException;
import com.cg.frs.exception.RegistrationExceptionMessage;
import com.cg.frs.service.FlatRegistrationServiceImpl;
import com.cg.frs.service.IFlatRegistrationService;

public class Client {
	public static void main(String[] args) throws RegistrationException {
		Scanner scanner = new Scanner(System.in);
		IFlatRegistrationService service = new FlatRegistrationServiceImpl();
		FlatRegistrationDTO bean = new FlatRegistrationDTO();
		System.out.println("-----XYZ Broker-----");
		System.out.println("1. Register Flat");
		System.out.println("2. Exit");
		int option = scanner.nextInt();
		if (option == 1) {
			ArrayList<Integer> ownerDetails = service.getAllOwnerDetails();
			System.out.println("Existing Owner Ids are:" + ownerDetails);
			System.out.println(" Please Enter your Owner Ids from above list");
			int choice = scanner.nextInt();
			boolean isValid = false ;
			for (Integer c : ownerDetails) {
				if (c == choice) {
					isValid = true;
				} 
			}
			if (isValid == false) {
				throw new RegistrationException(RegistrationExceptionMessage.ERROR1);
			}
			// set ownerId
			bean.setOwnerId(choice);
			//set flatId
			int flatId = (int) (Math.random()*10000);
			bean.setFlatId(flatId);
			//set Flat type
			System.out.println("Select Flat Type (1-1BHK, 2-2BHK):");
			int choice1 = scanner.nextInt();
			String s1="1-BHK";
			String s2="2-BHK";
			
			if (choice1 == 1) {
				bean.setFlatType(s1);
			}else if (choice1 == 2) {
				bean.setFlatType(s2);
			}else {
				throw new RegistrationException(RegistrationExceptionMessage.ERROR4);
			}
			//set flat area
			System.out.println("Enter Flat area in sq. ft.:");
			int flatArea = scanner.nextInt();
			bean.setFlatArea(flatArea);
			//set flat rent
			System.out.println("Enter desired rent amount Rs: ");
			Double rent =scanner.nextDouble();
			bean.setRent(rent);
			//set flat deposit
			System.out.println("Enter desired deposit amount Rs: ");
			Double deposit = scanner.nextDouble();
			if (deposit > rent) {
				bean.setDeposit(deposit);
			}else {
				throw new RegistrationException(RegistrationExceptionMessage.ERROR2);
			}
			service.flatRegistrationDTO(bean);
			System.out.println("Flat successfully registered. Registration id:" + bean.getFlatId());
			 if(option == 2){
			System.exit(0);
		} else {
			throw new RegistrationException(RegistrationExceptionMessage.ERROR5);
		}

	}
	}
}
