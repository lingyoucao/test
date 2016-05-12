package com.proxy.proxy2;

import java.lang.reflect.Proxy;

public class Test {
	
	public static void main(String[] args) {
		 
		Sourceable source = new Source();
		ProxyInterceptor proxy = new ProxyInterceptor(source);
		
		Sourceable sourceProxy = (Sourceable) Proxy.newProxyInstance(source.getClass().getClassLoader(), source.getClass().getInterfaces(), proxy);
		int a = sourceProxy.add();
		
		System.out.println("========return value:["+a+"]======");
		
		sourceProxy.delete();
		
	}
	
}
