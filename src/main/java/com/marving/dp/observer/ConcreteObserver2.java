package com.marving.dp.observer;

/**
 * Created by mercop on 2017/6/19.
 */
public class ConcreteObserver2 implements Observer{
	private String name;
	public ConcreteObserver2(String name){
		this.name= name;
	}
	@Override
	public void update() {
		System.out.println(this.getClass().getSimpleName() + " "+ this.name + "收到通知！");
	}

}
