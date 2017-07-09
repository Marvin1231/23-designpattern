package com.marving.dp.testing;


import org.junit.Test;

import com.marving.dp.visitor.ConcreteVisitor;
import com.marving.dp.visitor.ObjectStructure;
import com.marving.dp.visitor.Visitor;

public class VisitorTest {

	@Test
	public void test() {
		ObjectStructure os = new ObjectStructure();
		os.createElements();
		Visitor v = new ConcreteVisitor();
		os.action(v);
	}

}
