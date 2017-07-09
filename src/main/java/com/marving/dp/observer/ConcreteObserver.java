package com.marving.dp.observer;

public class ConcreteObserver implements Observer{
	private String name;
	public ConcreteObserver(String name){
		this.name= name;
	}
	@Override
	public void update() {
		System.out.println(this.name + "收到通知！");
	}

}
