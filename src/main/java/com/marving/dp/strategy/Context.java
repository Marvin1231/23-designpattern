package com.marving.dp.strategy;

//环境角色
public class Context {
	
	private Strategy strategy;
	public Context(Strategy strategy){
		this.strategy = strategy;
	}
	
	public void contextStrategy(){
		this.strategy.strategyInterface();
	}
}
