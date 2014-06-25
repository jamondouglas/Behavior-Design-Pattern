package Observable;

import Observer.CurrentConditionsDisplay;
import Observer.ForecastDisplay;
import Observer.HeatIndexDisplay;
import Observer.StatisticsDisplay;
import Observer.WeatherData;

public class WeatherStation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeatherData wd= new WeatherData();
		
		CurrentConditionsDisplay ccd = new CurrentConditionsDisplay(wd);
		StatisticsDisplay sd = new StatisticsDisplay(wd);
		ForecastDisplay fd = new ForecastDisplay(wd);
		//HeatIndexDisplay hd = new HeatIndexDisplay(wd);
		wd.setMeasurements(80, 65, 30.4f);
		wd.setMeasurements(82, 70, 29.2f);
		wd.setMeasurements(78, 90, 29.2f);
	}
}


