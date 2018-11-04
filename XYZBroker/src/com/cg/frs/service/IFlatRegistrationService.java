package com.cg.frs.service;

import java.util.ArrayList;

import com.cg.frs.dto.FlatRegistrationDTO;
import com.cg.frs.exception.RegistrationException;

public interface IFlatRegistrationService {

	ArrayList<Integer> getAllOwnerDetails();

	boolean flatRegistrationDTO(FlatRegistrationDTO bean) throws RegistrationException;



}
