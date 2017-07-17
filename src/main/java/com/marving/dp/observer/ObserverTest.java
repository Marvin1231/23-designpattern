package com.marving.dp.observer;


import org.junit.Test;

/**
 * Created by mercop on 2017/6/19.
 */
public class ObserverTest {

	@Test
	public void test() {
		Subject s  = new ConcreteSubject();
		//ConcreteObserver
		Observer o = new ConcreteObserver("LiSi");
		Observer o2 = new ConcreteObserver("ZhangSan");
		//ConcreteObserver2
        Observer o3 = new ConcreteObserver2("WangWu");
		s.attach(o2);
		s.attach(o);
		s.attach(o3);

		s.notifyOberver();
		//取消订阅消息
		s.delete(o);
        System.out.println();
        s.notifyOberver();
	}

}
