package com.adapt.adapt2;

public class Adaptor implements TargetInterface {
	private Source source;
	
	public Adaptor(Source source){
		this.source = source;
	}
	
	
	public void method1(){
		source.method1();
	}

	@Override
	public void method2() {
		System.out.println("this id method2");
	}
	
}
