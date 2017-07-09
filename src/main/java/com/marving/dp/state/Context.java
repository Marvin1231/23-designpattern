package com.marving.dp.state;

public class Context {
	
	public static State STATE1 = new ConcreteState1();
	public static State STATE2 = new ConcreteState2();
	private State currentState;
	public State getCurrentState() {
		return currentState;
	}
	public void setCurrentState(State currentState) {
		this.currentState = currentState;
		currentState.setContext(this);
	}
	
	public void handle1(){
		this.setCurrentState(STATE1);
		this.currentState.handle();
	}
	
	public void handle2(){
		this.setCurrentState(STATE2);
		this.currentState.handle();
	}
	
}
