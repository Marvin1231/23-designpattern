package com.marving.dp.chainOfResponsibility.AssignTasks;

public class Leader extends Employee{
	public Leader(String name){
		super(name);
	}
	
	@Override
	public void doWork() {
		if(getSubEmp() != null){
			System.out.println(this + " 安排工作给" +super.getSubEmp());
			getSubEmp().doWork();
		} else {
			System.out.println(this + "正在处理");
		}
	}
	
	
}
