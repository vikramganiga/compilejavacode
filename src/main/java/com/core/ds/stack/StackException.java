package com.core.ds.stack;

public class StackException extends Exception {
	
	private static final long serialVersionUID = 1L;
	private String error;
		
	public StackException(String error) {
		super();
		this.error = error;
	}
	
	public String getError() {
		return error;
	}

}
