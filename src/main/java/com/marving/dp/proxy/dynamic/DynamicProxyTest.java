package com.marving.dp.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.marving.dp.proxy.RealSubject;
import com.marving.dp.proxy.Subject;

/**
 * 	
 * @title: 动态代理类
 * @author: Marvin Guo
 * @create time: 2016年12月21日
 */
public class DynamicProxyTest {
	
	public static void main(String[] args){
		Subject subject = new RealSubject();
		Handler h = new Handler(subject);
		//类加载器、类继承的接口集合，代理处理类
		Subject proxy = (Subject) Proxy.newProxyInstance(subject.getClass().getClassLoader(), 
				subject.getClass().getInterfaces(),h);
		proxy.request();
	}
	
	
}

class Handler implements InvocationHandler{
	Object obj;
	public Handler(Object obj){
		this.obj = obj;
	}
	@Override
	public Object invoke(Object obj1, Method method, Object[] args) throws Throwable {
		doBefore();
		Object o = method.invoke(obj, args);
		doAfter();
		return o;
	}
	
	public void doBefore(){
		System.out.println("Before");
	}
	
	public void doAfter(){
		System.out.println("After");
	}
	
}
