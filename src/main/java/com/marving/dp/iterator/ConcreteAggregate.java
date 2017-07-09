package com.marving.dp.iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate implements Aggregate{
	List<Object> list = new ArrayList<Object>();
	@Override
	public void add(Object obj) {
		list.add(obj);
	}

	@Override
	public Iterator createIterator() {
		
		return new ConcreteIterator(this );
	}

	@Override
	public int size() {
		return list.size();
	}

	@Override
	public Object getElement(int i) {
		if(i < list.size()){
			return list.get(i);
		} else {
			return null;
		}
	}

}
