package com.marving.dp.builder;

//具体建造者
public class ConcreteBuilder implements Builder{
	private Product product = new Product();
	@Override
	public void setPart1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPart2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Product builderProduct() {
		
		return product;
	}
	
	
}
