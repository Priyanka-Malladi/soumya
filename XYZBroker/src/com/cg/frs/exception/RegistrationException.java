package com.cg.frs.exception;

public class RegistrationException extends Exception {
	public RegistrationException() {
		// TODO Auto-generated constructor stub
		System.out.println("wallet exception raised");
	}

	public RegistrationException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}

}
