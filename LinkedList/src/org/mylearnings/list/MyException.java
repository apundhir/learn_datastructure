package org.mylearnings.list;

public class MyException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String message;
	
	public MyException(String msg) {
		this.message = msg;
	}
	
	public String getMessage(){
		return message;
	}
	
}
