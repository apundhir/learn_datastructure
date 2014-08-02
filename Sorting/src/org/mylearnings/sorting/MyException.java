package org.mylearnings.sorting;

@SuppressWarnings("serial")
public class MyException extends Exception {
	@SuppressWarnings("unused")
	private String message;

	public MyException(String msg){
		message = msg;
	}
}
