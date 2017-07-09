package com.marving.dp.iterator;

public class ConcreteIterator implements Iterator{
	private Aggregate agg;
	private int index = 0;
	private int size = 0;
	
	public ConcreteIterator(Aggregate agg){
		this.agg = agg;
		this.size = agg.size();
		index = 0;
	}
	@Override
	public Object next() {
		if(index < size){
			return agg.getElement(index++);
		} else{
			return null;
		}
	}

	@Override
	public boolean hasNext() {
		return index < size;
	}

}
