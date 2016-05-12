package com.decorator.decorator2;

public class Decorator implements Sourceable{
	
	private Sourceable source;

	public Decorator(Sourceable source){
		this.source = source;
	}
	
	@Override
	public void method1() {
		System.out.println("begin decorator");
		source.method1();
		System.out.println("end decorator");
	}

}
