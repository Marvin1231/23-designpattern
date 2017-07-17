package com.marving.dp.singleton;

import org.junit.Test;

/**
 * 饿汉模式
 * Created by mercop on 2017/7/15.
 */
public class Singleton1 {
	private static Singleton1 instance = new Singleton1();
	private Singleton1(){

	}
	public static Singleton1 getInstance(){
		return instance;
	}
}
