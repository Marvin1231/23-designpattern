package com.marving.dp.visitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


//结构对象角色
public class ObjectStructure {
	private List<Element> elements = new ArrayList<Element>();
	
	public void action(Visitor v){
		for(Element element:elements)
			element.accept(v);
	}
	
	public void add(Element e){
		elements.add(e);
	}
	
	public void createElements(){
		Random ra = new Random();
		for(int i =0; i < 10;i++){
			if(ra.nextInt(100)>50){
				add(new ConcreteElement1());
			} else{
				add(new ConcreteElement2());
			}
		}
	}
}
