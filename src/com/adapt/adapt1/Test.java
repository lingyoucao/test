package com.adapt.adapt1;

public class Test {

	public static void main(String[] args) {
		TargetInterface targetInterface = new Adaptor();
		targetInterface.method1();
		targetInterface.method2();
	}

}
