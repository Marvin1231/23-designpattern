package com.marving.dp.strategy;

//具体策略角色
public class ConcreteStrategy extends Strategy{

	@Override
	public void strategyInterface() {
		System.out.println("Strategy Invoked!");
	}

}
