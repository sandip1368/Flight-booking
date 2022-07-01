package com.flight.exception;


public class RecordAlreadyPresentException extends RuntimeException {
	
	private static final long serialVersionUID =1l;
	 
	public RecordAlreadyPresentException(String msg)
	{
		super(msg);
	}
	

}
