package com.marving.dp.testing;

import org.junit.Test;

import com.marving.dp.composite.Component;
import com.marving.dp.composite.Composite;
import com.marving.dp.composite.Leaf;

public class CompositeTest {

	@Test
	public void test() {
		Composite root = new Composite("Root");
		Component leaf1 = new Leaf("L1");
		Composite composite1 = new Composite("C1");
		Component leaf21 = new Leaf("L21");
		Component leaf22 = new Leaf("L22");
		
		composite1.add(leaf21);
		composite1.add(leaf22);
		
		root.add(leaf1);
		root.add(composite1);
		display(root);
	}
	//递归显示节点
	public void display(Composite root){
		for(Component c: root.getChild()){
			if(c instanceof Composite){
				c.operation();
				display((Composite)c);
			} else {
				c.operation();
			}
			
		}
	}
}
