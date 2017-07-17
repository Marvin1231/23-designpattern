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
		
	}

	//非线程安全懒汉模式
	public static Singleton2 getInstance1(){
		if(instance == null){
			instance = new Singleton2();
		}
		return instance;
	}

	//方法同步
	synchronized public static Singleton2 getInstance2(){
		if(instance == null){
			instance = new Singleton2();
		}
		return instance;
	}

	//双重校验锁

    public static Singleton2 getInstance3(){
        if(instance == null){
            synchronized (Singleton2.class){
                if(instance == null)
                    instance = new Singleton2();
            }
        }
        return instance;
    }
}