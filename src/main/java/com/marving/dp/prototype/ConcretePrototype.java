package com.marving.dp.prototype;

public class ConcretePrototype implements Prototype{
	public Prototype clone(){
		try {
			return (Prototype)super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}

