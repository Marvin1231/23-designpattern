package com.marving.dp.singleton;

/**
 * 静态内部类实现单例模式
 * Created by mercop on 2017/7/17.
 */
public class StaticInnerSingleton {

    private StaticInnerSingleton(){

    }
    public static final StaticInnerSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final StaticInnerSingleton INSTANCE = new StaticInnerSingleton();
    }
}
