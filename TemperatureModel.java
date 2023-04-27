package bt2;

import java.util.ArrayList;
import java.util.List;

public class TemperatureModel {
	private double celsius = 15.0;
	private List<Observer> observers = new ArrayList<Observer>();
	public void setCelsius(double temp) {
		celsius = temp;
		notifyObs();
	}
	
	private void notifyObs() {
		for (Observer obs : observers) {
			obs.update();
		}
	}
	public void setFahrenheit(double temp) {
	   celsius = (temp - 32) * 5 / 9;
	   notifyObs();
	}
	public double getCelcius() {
		return celsius;
	}
	public double getFahrenheit() {
		return   celsius * 9 / 5 + 32;
	}
	public void addObs(Observer o) {
		observers.add(o);
	}
	public void removeObs(Observer o) {
		observers.remove(o);
	}
	
	
 }
