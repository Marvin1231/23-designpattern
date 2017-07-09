package com.marving.dp.chainOfResponsibility;

//抽象处理者角色
public abstract class Handler {
	
	private Handler successor;
	
	public abstract void handleRequest();
	public Handler getSuccessor(){
		return this.successor;
	}
	public void setSuccessor(Handler successor){
		this.successor = successor;
	}
}
