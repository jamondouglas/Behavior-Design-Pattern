package Observer;

import Observer.interfaces.Observer;
import Observer.interfaces.Display;
import Observer.interfaces.Subject;

public class CurrentConditionsDisplay implements Display, Observer {
	private float temperature;
	private float humidity;
	//private float pressure;
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherData){
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Current conditions: "+ temperature + "F degrees and "+humidity+"% humidity");
	}


	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		this.temperature = temp;
		this.humidity = humidity;
		display();
	}
}
