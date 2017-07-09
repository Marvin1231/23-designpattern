package com.marving.dp.testing;

import org.junit.Test;

import com.marving.dp.factory.ConcreteCreator;
import com.marving.dp.factory.ConcreteProduct;
import com.marving.dp.factory.Creator;
import com.marving.dp.factory.Product;

public class FacoryTest {

	@Test
	public void test() {
		Creator creator = new ConcreteCreator();
		Product product = creator.factory(ConcreteProduct.class);
		product.method();
	}

}
