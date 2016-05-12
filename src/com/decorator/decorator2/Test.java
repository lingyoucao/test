package com.decorator.decorator2;

public class Test {
	public static void main(String[] args) {
		Sourceable source = new Source();
		Sourceable decorator = new Decorator(source);
		decorator.method1();
	}
}
