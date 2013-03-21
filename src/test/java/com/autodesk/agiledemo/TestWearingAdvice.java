package com.autodesk.agiledemo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestWearingAdvice {

	private static final String ANY_OTHER_CONDITION = "Cloudy";
	private static final double UPPER_BOUNDRY_OF_HOT = 79d;
	private static final double LOWER_BOUNDRY_OF_HOT = 70d;
	private static final double UPPER_BOUNDRY_OF_COOL = 69d;
	private static final double LOWER_BOUNDRY_OF_COOL = 60d;

	@Test public void shirts_wearing_advice() {
		assertWearingAdviceEquals("Shirts", LOWER_BOUNDRY_OF_COOL, "Sunny");
		assertWearingAdviceEquals("Shirts", UPPER_BOUNDRY_OF_COOL, "Sunny");
	}

	@Test public void raincoat_wearing_advice() {
		assertWearingAdviceEquals("Raincoat", LOWER_BOUNDRY_OF_COOL, "Raining");
		assertWearingAdviceEquals("Raincoat", UPPER_BOUNDRY_OF_COOL, "Raining");
	}
	
	@Test public void tshirt_wearing_advice() {
		assertWearingAdviceEquals("T-shirt", LOWER_BOUNDRY_OF_HOT, "Sunny");
		assertWearingAdviceEquals("T-shirt", UPPER_BOUNDRY_OF_HOT, "Sunny");
	}
	
	@Test public void umbrella_tshirt_wearing_advice() {
		assertWearingAdviceEquals("Umbrella, T-shirt", LOWER_BOUNDRY_OF_HOT, "Raining");
		assertWearingAdviceEquals("Umbrella, T-shirt", UPPER_BOUNDRY_OF_HOT, "Raining");
	}
	
	@Test public void no_advice() {
		assertWearingAdviceEquals("No Advice", UPPER_BOUNDRY_OF_HOT + 1, "Sunny");
		assertWearingAdviceEquals("No Advice", UPPER_BOUNDRY_OF_HOT + 1, "Raining");
		assertWearingAdviceEquals("No Advice", LOWER_BOUNDRY_OF_COOL - 1, "Sunny");
		assertWearingAdviceEquals("No Advice", LOWER_BOUNDRY_OF_COOL - 1, "Raining");
		assertWearingAdviceEquals("No Advice", LOWER_BOUNDRY_OF_COOL, ANY_OTHER_CONDITION);
		assertWearingAdviceEquals("No Advice", UPPER_BOUNDRY_OF_HOT, ANY_OTHER_CONDITION);
	}
	
	private void assertWearingAdviceEquals(String expectedWearingAdvice, double temperature, String condition) {
		Weather weather = new Weather();
		weather.setTemperature(temperature);
		weather.setCondition(condition);
		
		String actualWearingAdvice = weather.getWearingAdvice();
		
		assertEquals(expectedWearingAdvice, actualWearingAdvice);
	}
	
}
