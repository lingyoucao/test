package com.proxy.proxy2;

public class Source implements Sourceable{

	public int add() {
		System.out.println("add method");
		return 1;
	}

	public void delete() {
		System.out.println("delelte method");		
	}
	
}
