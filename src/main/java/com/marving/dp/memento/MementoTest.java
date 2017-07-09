package com.marving.dp.memento;


import org.junit.Test;

public class MementoTest {

	@Test
	public void test() {
		Originator o = new Originator();
		Caretaker c = new Caretaker();
		//创建副本
		c.setMemento(o.createMemento());
		//恢复副本
		o.restoreMemento(c.getMemento());
	}

}
