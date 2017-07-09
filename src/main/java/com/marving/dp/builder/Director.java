package com.marving.dp.builder;

// 导演类：复杂类如何组装然后生成
public class Director {
	private Builder builder = new ConcreteBuilder();
	public Product build(){
		builder.setPart1();
		builder.setPart2();
		return builder.builderProduct();	
	}
}
