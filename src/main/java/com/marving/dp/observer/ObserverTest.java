package com.marving.dp.observer;


import org.junit.Test;

public class ObserverTest {

	@Test
	public void test() {
		Subject s  = new ConcreteSubject();
		Observer o = new ConcreteObserver("Zhang");
		s.attach(new ConcreteObserver("Guo bin "));
		s.attach(o);
		s.notifyOberver();
		s.delete(o);
		s.notifyOberver();
	}

}
