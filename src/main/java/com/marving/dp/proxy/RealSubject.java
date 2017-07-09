package com.marving.dp.proxy;

//真实主题
public class RealSubject implements Subject{

	@Override
	public void request() {
		System.out.println("Real Subject request");	
	}

}
