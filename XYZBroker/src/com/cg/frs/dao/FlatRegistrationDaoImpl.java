package com.cg.frs.dao;

import java.util.ArrayList;

import com.cg.frs.dto.FlatRegistrationDTO;
import com.cg.frs.util.DataBase;

public class FlatRegistrationDaoImpl implements IFaltRegistrationDao {
	
	@Override
	public ArrayList<Integer> getAllOwnerDetails() {
		// TODO Auto-generated method stub
		return DataBase.getAllOwnerDetails();
	}

	@Override
	public boolean flatRegistrationDTO(FlatRegistrationDTO bean) {
		// TODO Auto-generated method stub
		return DataBase.flatRegistrationDTO(bean);
	}

}
