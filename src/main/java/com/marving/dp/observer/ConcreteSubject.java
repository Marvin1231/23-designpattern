package com.marving.dp.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject{
	
	private List<Observer> observers = new ArrayList<Observer>();
	@Override
	public void attach(Observer obs) {
		this.observers.add(obs);
	}

	@Override
	public void delete(Observer obs) {
		this.observers.remove(obs);
	}

	@Override
	public void notifyOberver() {
		for(Observer obs:observers)
			obs.update();
	}

}
