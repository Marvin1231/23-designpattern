package com.marving.dp.testing;

import org.junit.Test;

import com.marving.dp.iterator.Aggregate;
import com.marving.dp.iterator.ConcreteAggregate;
import com.marving.dp.iterator.Iterator;

public class IteratorTest {

	@Test
	public void test() {
		Aggregate agg = new ConcreteAggregate();
		agg.add("Guo bin");
		agg.add("Zhang");
		Iterator iterator = agg.createIterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}

}
