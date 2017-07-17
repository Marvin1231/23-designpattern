package com.marving.dp.factory.abstractF;

/**
 * Created by mercop on 2017/7/17.
 */
public class ConcreteFactory2 extends AbstractFactory{
    @Override
    void createProduct1() {
        System.out.print("ConcreteFactory2 ");
        new ConcreteProduct1();
    }

    @Override
    void createProduct2() {
        System.out.print("ConcreteFactory2 ");
        new ConcreteProduct2();
    }
}
