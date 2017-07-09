package com.marving.dp.observer;

public interface Subject {
	public void attach(Observer obs);
	public void delete(Observer obs);
	public void notifyOberver();
}
