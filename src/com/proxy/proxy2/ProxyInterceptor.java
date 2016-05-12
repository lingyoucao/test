package com.proxy.proxy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyInterceptor implements InvocationHandler {
	private Object target;
	
	public ProxyInterceptor(Object target){
		this.target = target;
	}
	
	public void before(Method method){
		System.out.println("before "+method.getName());
	}
	
	public void after(Method method){
		System.out.println("after "+method.getName());
	}
	
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		before(method);
		Object object = method.invoke(target, args);
		after(method);
		return object;
	}

}
