package com.marving.dp.singleton;

/**
 * 使用枚举实现线程安全的单例
 * Created by mercop on 2017/7/17.
 */
public enum EnumSingleton {
    INSTANCE;


    public void doSomething(){
        System.out.println("EnumSingleton Object created");
    }
}




