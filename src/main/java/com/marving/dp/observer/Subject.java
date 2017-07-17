package com.marving.dp.observer;


/**
 * Created by mercop on 2017/6/19.
 */
public interface Subject {
	public void attach(Observer obs);
	public void delete(Observer obs);
	public void notifyOberver();
}
