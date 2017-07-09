package com.marving.dp.builder;

//抽象建造者
public interface Builder {
	
	public void setPart1();
	public void setPart2();
	public Product builderProduct();
}
