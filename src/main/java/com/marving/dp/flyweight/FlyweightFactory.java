package com.marving.dp.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
	private static Map<String,Flyweight> pool = new HashMap<String,Flyweight>();
	
	public static Flyweight getFlyweight(String intrinsicState){
		Flyweight instance = pool.get(intrinsicState);
		if(instance == null){
			instance = new ConcreteFlyweight(intrinsicState);
			pool.put(intrinsicState, instance);
		}
		return instance;
	}
}
