package com.bridge;

public class Test {
	public static void main(String[] args) {
		Sourceable source1 = new SourceSub1();
		Bridge bridge = new Bridge();
		bridge.setSource(source1);
		bridge.method();
		
		System.out.println("=====================");

		Sourceable source2 = new SourceSub2();
		
		bridge.setSource(source2);
		bridge.method();
	}
}
