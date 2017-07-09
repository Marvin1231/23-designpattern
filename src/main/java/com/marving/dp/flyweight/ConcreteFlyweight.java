package com.marving.dp.flyweight;

public class ConcreteFlyweight implements Flyweight{
	private String intrinsicState;
	public ConcreteFlyweight(String intrinsicState){
		this.intrinsicState = intrinsicState;
	}
	@Override
	public void operation(String extraState) {
		// TODO Auto-generated method stub
		System.out.println("extra:" + extraState + "inner:"+ this.intrinsicState);
	}

}
