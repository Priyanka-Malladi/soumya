package com.cg.frs.dao;

import java.util.ArrayList;

import com.cg.frs.dto.FlatRegistrationDTO;

public interface IFaltRegistrationDao {

	ArrayList<Integer> getAllOwnerDetails();

	boolean flatRegistrationDTO(FlatRegistrationDTO bean);

}
