package com.marving.dp.testing;

import org.junit.Test;

import com.marving.dp.flyweight.Flyweight;
import com.marving.dp.flyweight.FlyweightFactory;

public class FlyweightTest {

	@Test
	public void test() {
		Flyweight f1 = FlyweightFactory.getFlyweight("1");
		Flyweight f2 = FlyweightFactory.getFlyweight("1");
		Flyweight f3 = FlyweightFactory.getFlyweight("2");
		f1.operation("1");
		f2.operation("2");
		f3.operation("2");
	}

}
