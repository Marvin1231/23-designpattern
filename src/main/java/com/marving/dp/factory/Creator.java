package com.marving.dp.factory;

public interface Creator {
	public <T extends Product> T factory(Class<T> c);
}
