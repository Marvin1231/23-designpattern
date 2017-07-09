package com.marving.dp.singleton;

public class GlobalNum {
	
	private static GlobalNum gn = new GlobalNum();
	private int num = 0;
	private GlobalNum(){
		
	}
	public static GlobalNum getInstance(){
		return gn;
	}
	synchronized public int getNum(){
		return ++num;
	}
}
