package com.cg.frs.util;

import java.util.ArrayList;

import com.cg.frs.dto.FlatRegistrationDTO;

public class DataBase {
	private static ArrayList<Integer> ownerDetails = new ArrayList<>();
	private static ArrayList<FlatRegistrationDTO> flat_Registrations = new ArrayList<>();
	public static ArrayList<Integer> getAllOwnerDetails() {
		ownerDetails.add(1);
		ownerDetails.add(2);
		ownerDetails.add(3);
		return ownerDetails;
	}
	public static boolean flatRegistrationDTO(FlatRegistrationDTO bean) {
		boolean isValid = false;
				if (flat_Registrations.add(bean)) {
					isValid = true;
				}
		return isValid;
		// TODO Auto-generated method stub
		
	}

}
