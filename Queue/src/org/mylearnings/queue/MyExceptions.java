package org.mylearnings.queue;


@SuppressWarnings("serial")
public class MyExceptions extends Exception{
	@SuppressWarnings("unused")
	private String message;
	
	public MyExceptions(String msg){
		this.message = msg;
	}
}
