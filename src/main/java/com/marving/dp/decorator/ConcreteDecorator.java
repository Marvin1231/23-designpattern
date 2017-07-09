package com.marving.dp.decorator;

//具体装饰角色
public class ConcreteDecorator extends Decorator{

	public ConcreteDecorator(Component component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void operation(){
		method();
		super.operation();
	}
	
	public void method(){
		System.out.println("decorator method invoked");
	}

}
