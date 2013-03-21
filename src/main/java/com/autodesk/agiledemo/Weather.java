package com.autodesk.agiledemo;

import java.util.HashMap;
import java.util.Map;

public class Weather {
	private String city;
	private String region;
	private String country;
	private double temperature;
	private String condition;
	private String humidity;
	private String windSpeed;
	
	private static final Map<String, String> WEARING_ADVICES_MAPPING = new HashMap<>();
	
	static {
		WEARING_ADVICES_MAPPING.put("Sunny"+true, "T-shirt");
		WEARING_ADVICES_MAPPING.put("Sunny"+false, "Shirts");
		WEARING_ADVICES_MAPPING.put("Raining"+true, "Umbrella, T-shirt");
		WEARING_ADVICES_MAPPING.put("Raining"+false, "Raincoat");
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public double getTemperature() {
		return temperature;
	}
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	public String getHumidity() {
		return humidity;
	}
	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}
	public String getWindSpeed() {
		return windSpeed;
	}
	public void setWindSpeed(String windSpeed) {
		this.windSpeed = windSpeed;
	}
	public String getWearingAdvice() {
		if (isNotInTempRangeOrAnyOtherCondition())
			return "No Advice";
		else
			return WEARING_ADVICES_MAPPING.get(condition+isHotAndInTempRange());
	}
	private boolean isNotInTempRangeOrAnyOtherCondition() {
		return temperature >= 80 || temperature <= 59 || !(condition.equals("Sunny") || condition.equals("Raining"));
	}
	private boolean isHotAndInTempRange() {
		return temperature >= 70;
	}	
}