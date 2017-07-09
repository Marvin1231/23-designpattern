package com.marving.dp.iterator;

public interface Aggregate {
	
	public void add(Object obj);
	public Iterator createIterator();
	public int size();
	public Object getElement(int i);
}
