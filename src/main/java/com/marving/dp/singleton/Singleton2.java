package com.marving.dp.singleton;
/**
 * 
 * @title: 懒汉版单例模式
 * @author: Marvin Guo
 * @create time: 2016年11月18日
 */
public class Singleton2 {
	private static Singleton2 instance;
	private Singleton2(){
		
	};
	//方法同步
	synchronized public static Singleton2 getInstance(){
		if(instance == null){
			instance = new Singleton2();
		}
		return instance;
	}
}
