package Observable;

import java.util.Observable;
import java.util.Observer;

import Observer.interfaces.Display;

public class CurrentConditionDisplay implements Observer, Display {
	
	private Observable observable;
	private float temp;
	private float humidity;
	
	public CurrentConditionDisplay(Observable observable){
		this.observable = observable;
		observable.addObserver(this);
	}
	

	@Override
	public void update(Observable obs, Object arg) {
		// TODO Auto-generated method stub
		if(obs instanceof WeatherData){
			WeatherData wd = (WeatherData)obs;
			this.temp = wd.getTemperature();
			this.humidity = wd.getHumidity();
			display();
		}
	}
	
	public void display(){
		System.out.println("Current conditions: "+temp +"F degrees and "
	+ humidity+"% humidity");
	}

}
