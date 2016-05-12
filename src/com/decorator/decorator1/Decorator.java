package com.decorator.decorator1;

public class Decorator extends Source implements Sourceable{
	@Override
	public void method1() {
		System.out.println("begin decorator");
		super.method1();
		System.out.println("end decorator");
	}

}
