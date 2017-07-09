package com.marving.dp.proxy;

//代理主题
public class ProxySubject implements Subject{
	
	private Subject subject;
	public ProxySubject(Subject subject){
		this.subject = subject;
	}
	@Override
	public void request() {
		this.beforeRequest();
		subject.request();
		this.afterRequest();
	}
	public void beforeRequest(){
		System.out.println("Proxy before request");
	}

	public void afterRequest(){
		System.out.println("Proxy after request");
	}
}
