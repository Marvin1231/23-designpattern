package com.marving.dp.factory.normal;

import com.marving.dp.factory.abstractF.ConcreteProduct1;
import com.marving.dp.factory.abstractF.Product;

/**
 * Created by mercop on 2017/7/17.
 */
public class ConcreteCreater1 implements Creater{

    @Override
    public Product factory() {
        return new ConcreteProduct1();
    }
}
