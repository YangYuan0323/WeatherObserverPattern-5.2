package com.johnyang;

public class ConcreteWeatherSubject extends WeatherSubject {

	private String weatherContent;

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			if ("下雨".equals(this.getWeatherContent())) {
				if ("黄明的女朋友".equals(observer.getObserverName())) {
					observer.update(this);
				}
				
				if ("黄明的老妈".equals(observer.getObserverName())) {
					observer.update(this);
				}
			}
			
			if("下雪".equals(this.getWeatherContent())) {
				if("黄明的老妈".equals(observer.getObserverName())) {
					observer.update(this);
				}
			}

		}

	}

	public String getWeatherContent() {
		return weatherContent;
	}

	public void setWeatherContent(String weatherContent) {
		this.weatherContent = weatherContent;
		this.notifyObservers();
	}

}
