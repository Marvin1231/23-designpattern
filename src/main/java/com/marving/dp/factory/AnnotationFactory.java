package com.marving.dp.factory;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by mercop on 2017/7/31.
 * Annotation 实现静态工厂
 */
@MyAnnotation(target = Apple.class)
public class AnnotationFactory {
    public static <T> T getInstance() throws Exception {
        MyAnnotation myAnnotation = AnnotationFactory.class.getAnnotation(MyAnnotation.class);
        return (T) myAnnotation.target().newInstance();
    }

    public static void main(String[] args) throws Exception{
        IFruit iFruit = AnnotationFactory.getInstance();
        iFruit.eat();
    }
}


interface IFruit{
    void eat();
}

class Apple implements IFruit{

    @Override
    public void eat() {
        System.out.println("eat apple");
    }
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface MyAnnotation{
    public Class<?> target();
}