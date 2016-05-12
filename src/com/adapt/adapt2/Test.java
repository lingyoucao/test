package com.adapt.adapt2;

public class Test {

	public static void main(String[] args) {
		Source source = new Source();
		Adaptor adaptor = new Adaptor(source);
		adaptor.method1();
		adaptor.method2();
		
	}

}
