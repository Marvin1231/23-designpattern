package com.marving.dp.composite;

import java.util.ArrayList;

//树枝构件角色
public class Composite implements Component{
	
	//名称标识
	private String name;
	
	public Composite(String name){
		this.name = name;
	}
	
	private ArrayList<Component> ComponentList = new ArrayList<Component>();
	@Override
	public void operation() {
		
		System.out.println("Composite： " + this.name);
	}
	
	//集合方法
	public void add(Component component){
		this.ComponentList.add(component);
	}
	
	public void remove(Component component){
		this.ComponentList.remove(component);
	}
	
	public ArrayList<Component> getChild(){
		return this.ComponentList;
	}

}
