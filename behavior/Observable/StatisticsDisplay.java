package Observable;

import Observer.interfaces.Display;
import Observer.interfaces.Subject;
import Observer.interfaces.Observer;

public class StatisticsDisplay implements Display, Observer {
	private float temperature;
	private float humidity=0.0f;
	private float pressure=0.0f;
	private float tempSum=0.0f;
	private float humiditySum=0.0f;
	private float pressureSum=0.0f;
	private Subject weather;
	private int numOfReadings;
	private float minTemp=200;
	private float maxTemp=0;
	
	public StatisticsDisplay(Subject weather){
		this.weather = weather;
		weather.registerObserver(this);
	}
	
	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		numOfReadings++;
		this.temperature = temp;
		
//		this.minTemp=temp;
//		this.maxTemp=temp;
		
		this.humidity = humidity;
		this.pressure = pressure;
		
		
		this.minTemp= minTemp(temp);
		this.maxTemp=maxTemp(temp);
		tempSum += temp;
		humiditySum += humidity;
		pressureSum += pressure;
		display();
	}

	private float maxTemp(float temp) {
		// TODO Auto-generated method stub
		if(temp>this.maxTemp){
			this.maxTemp=temp;
		}
		return this.maxTemp;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Average temperature is: "+avgTemperature()+"and the max/min temps are:"+
		this.maxTemp+"/"+this.minTemp);
	}
	public float avgTemperature(){
		return tempSum/numOfReadings;
	}
	
	public float avgHumidity(){
		return humidity/numOfReadings;
	}
	
	public float avgPressure(){
		return pressure/numOfReadings;
	}
	
	public float minTemp(float temp){
		if(temp<this.minTemp){
			this.minTemp=temp;
		}
		return this.minTemp;
	}
}
