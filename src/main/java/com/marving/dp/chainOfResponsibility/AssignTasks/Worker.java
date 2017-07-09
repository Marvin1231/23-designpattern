package com.marving.dp.chainOfResponsibility.AssignTasks;

import java.util.Date;

public class Worker extends Employee{
	public Worker(String name){
		super(name);
	}
	@Override
	public void doWork() {
		System.out.println(new Date().toString()+ " " + this + " 正在处理！");
		
	}

}
