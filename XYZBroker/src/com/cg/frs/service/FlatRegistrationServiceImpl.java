package com.cg.frs.service;

import java.util.ArrayList;

import com.cg.frs.dao.FlatRegistrationDaoImpl;
import com.cg.frs.dao.IFaltRegistrationDao;
import com.cg.frs.dto.FlatRegistrationDTO;
import com.cg.frs.exception.RegistrationException;
import com.cg.frs.exception.RegistrationExceptionMessage;

public class FlatRegistrationServiceImpl implements IFlatRegistrationService {
	IFaltRegistrationDao dao = new FlatRegistrationDaoImpl();
	@Override
	public ArrayList<Integer> getAllOwnerDetails() {
		// TODO Auto-generated method stub
		return dao.getAllOwnerDetails();
	}
	@Override
	public boolean flatRegistrationDTO(FlatRegistrationDTO bean) throws RegistrationException {
		boolean isvalid = false;
		if (validate(bean)) {
			isvalid = dao.flatRegistrationDTO(bean);
		} 
		return isvalid;
	}
	private boolean validate(FlatRegistrationDTO bean) throws RegistrationException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				boolean isValid = true;
				if((bean.getRent()== 0.0 )) {
					throw new RegistrationException(RegistrationExceptionMessage.ERROR3);
				}
				if(bean.getDeposit()== 0.0 && bean.getDeposit() > bean.getRent()) {
					throw new RegistrationException(RegistrationExceptionMessage.ERROR2);
				}
				if(!(bean.getFlatType() == "1-BHK" || bean.getFlatType() == "2-BHK")) {
					throw new RegistrationException(RegistrationExceptionMessage.ERROR4);
				}
				return isValid;
	}
	

}
