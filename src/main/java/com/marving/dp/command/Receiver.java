package com.marving.dp.command;

//接收者
public class Receiver {
	private String name;
	public Receiver(String name){
		this.name = name;
	}
	public void action(){
		System.out.println("Reciver "+name+" Action executed!");
	}
}
