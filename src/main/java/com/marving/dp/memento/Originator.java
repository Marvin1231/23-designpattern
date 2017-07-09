package com.marving.dp.memento;


//发起人角色
public class Originator {
	private String state = "";

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public Memento createMemento(){
		return new Memento(this.state);
	}
	public void restoreMemento(Memento m){
		this.setState(m.getState());
	}
}
