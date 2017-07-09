package com.marving.dp.chainOfResponsibility.AssignTasks;

public class Assignment {
	public static void main(String[] args){
		
		Employee Yang = new Leader("Yang yan");
		Employee Chen = new Leader("Chen jian bo");
		Employee Guo = new Worker("Guo bin");
		((Leader)Yang).setSubEmp(Chen);//向下转型
		Chen.setSubEmp(Guo);
		Yang.doWork();
	}
}
