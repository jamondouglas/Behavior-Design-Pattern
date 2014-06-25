package Observable;

import java.util.Observable;
import java.util.Observer;

import Observer.interfaces.Display;

public class ForecastDisplay implements Observer, Display {
	private Observable obs;
	private float currentPressure = 29.92f;
	private float lastPressure;

	public ForecastDisplay(Observable observable){
		this.obs = observable;
		obs.addObserver(this);
	}
	
	@Override
	public void display() {
		System.out.print("Forecast: ");
		if (currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (currentPressure == lastPressure) {
			System.out.println("More of the same");
		} else if (currentPressure < lastPressure) {
			System.out.println("Watch out for cooler, rainy weather");
		}
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData){
			WeatherData wd = (WeatherData) o;
			lastPressure = currentPressure;
			currentPressure = wd.getPressure();
		}
		display();
	}
}
