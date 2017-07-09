package com.marving.dp.decorator;

//装饰角色
public class Decorator implements Component{

	Component component;
	public Decorator(Component component){
		this.component = component;
	}
	@Override
	public void operation() {
		// TODO Auto-generated method stub
		component.operation();
	}

}
