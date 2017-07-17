package com.marving.dp.factory.Demo;

/**
 * Created by mercop on 2017/7/17.
 */
class AbstractFactoryDemo {
    public static void main(String[] args){
        AbstractFactory factory = new DefaultFactory();
        factory.createProduct1().show();
        factory.createProduct2().show();
    }
}

interface IProduct1 {
    public void show();
}
interface IProduct2 {
    public void show();
}

class Product1 implements IProduct1 {
    public void show() {
        System.out.println("这是1型产品");
    }
}
class Product2 implements IProduct2 {
    public void show() {
        System.out.println("这是2型产品");
    }
}

//抽象工厂类
interface AbstractFactory {
    public IProduct1 createProduct1();
    public IProduct2 createProduct2();
}
class DefaultFactory implements AbstractFactory{
    public IProduct1 createProduct1() {
        return new Product1();
    }
    public IProduct2 createProduct2() {
        return new Product2();
    }
}


