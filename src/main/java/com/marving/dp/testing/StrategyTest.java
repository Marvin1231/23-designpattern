package com.marving.dp.testing;


import org.junit.Test;

import com.marving.dp.strategy.ConcreteStrategy;
import com.marving.dp.strategy.Context;

public class StrategyTest {

	@Test
	public void test() {
		Context context = new Context(new ConcreteStrategy());
		context.contextStrategy();
	}

}
