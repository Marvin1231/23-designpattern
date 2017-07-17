package com.marving.dp.factory.simple;

import com.marving.dp.factory.abstractF.Product;

public interface Creator {
	public <T extends Product> T factory(Class<T> c);
}
