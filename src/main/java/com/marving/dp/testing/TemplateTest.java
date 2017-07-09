package com.marving.dp.testing;

import org.junit.Test;

import com.marving.dp.template.ConcreteClass;

public class TemplateTest {

	@Test
	public void test() {
		ConcreteClass cc = new ConcreteClass();
		cc.templateMethod();
	}

}
