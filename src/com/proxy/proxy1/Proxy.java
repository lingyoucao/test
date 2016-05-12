package com.proxy.proxy1;

public class Proxy implements Sourceable {
	private Source source;
	
	public Proxy(){
		this.source = new Source();
	}
	
	public void method(){
		before();
		source.method();
		after();
	}
	public void before(){
		System.out.println("before");
	}
	public void after(){
		System.out.println("after");
	}
}
