package com.marving.dp.composite;

//叶子构件角色
public class Leaf implements Component{
	private String name;
	
	public Leaf(String name){
		this.name = name;
	} 
	@Override
	public void operation() {
		// TODO Auto-generated method stub
		System.out.println("Leaf:" + this.name);
	}

}
