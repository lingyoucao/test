package com.decorator.decorator1;

public class Test {
	public static void main(String[] args) {
		Sourceable sourceable = new Decorator();
		sourceable.method1();
	}
}
