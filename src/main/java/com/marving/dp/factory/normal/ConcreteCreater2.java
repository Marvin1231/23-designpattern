package com.marving.dp.factory.normal;

import com.marving.dp.factory.abstractF.ConcreteProduct2;
import com.marving.dp.factory.abstractF.Product;

/**
 * Created by mercop on 2017/7/17.
 */
public class ConcreteCreater2 implements Creater{

    @Override
    public Product factory() {
        return new ConcreteProduct2();
    }
}
