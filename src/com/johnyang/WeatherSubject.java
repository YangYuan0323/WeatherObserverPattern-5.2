package com.johnyang;

import java.util.ArrayList;
import java.util.List;

public abstract class WeatherSubject {
	public List<Observer> observers = new ArrayList<Observer>();
	
	public void attach(Observer observer) {
		observers.add(observer);
	}
	
	public void dettach(Observer observer) {
		observers.remove(observer);
	}
	
	public abstract void notifyObservers();
	
	
}
