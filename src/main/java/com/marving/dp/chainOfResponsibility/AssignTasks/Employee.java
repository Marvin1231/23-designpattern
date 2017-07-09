package com.marving.dp.chainOfResponsibility.AssignTasks;

public abstract class Employee {
	
	private String name;
	//假设所有员工都有可能指派任务给其他员工
	private Employee subEmp;
	
	public Employee(String name){
		this.name = name;
	}
	
	public abstract void doWork();
	
	@Override
	public String toString(){
		return this.name +" "+ this.getClass().getSimpleName();
	}
	
	public Employee getSubEmp() {
		return subEmp;
	}
	public void setSubEmp(Employee subEmp) {
		this.subEmp = subEmp;
	}
}
