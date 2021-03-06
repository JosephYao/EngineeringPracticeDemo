#Step 1

Here is what we initially have before we start the demo:

*	final pom.xml
* 	final test.properties
*	final JBehaveStories.java
*	final Pages.java
*	final WeatherPage.java
*	final index.jsp with body commented out
*	final web.xml
*	final new_orleans_weather.xml

Here are steps:

*	explain all we have at step 1
*	mvn verify
*	show current page (blank page)

#Step 2

Here is what we will add in step 2:

* i_can_get_weather_by_zip.story
* WeatherTest.java

Here are steps:

*	update test.properties to use firefox
*	Explain and copy i_can_get_weather_by_zip.story
*	Explain and copy WeatherTest.java
*	mvn verify
*	git add src
*	git commit and git push and CI should pass

#Step 3

Here is what we will add in step 3:

*	TestWeatherRetriever.java
*	WeatherRetriever.java

Here are steps:

*	Discuss about the design on the whiteboard - WeatherRetriever and WeatherParser
*	Show Yahoo XML at http://weather.yahooapis.com/forecastrss?p=70112
*	Explain and copy TestWeatherRetriever.java
*	Make compile pass by adding empty WeatherRetriever class (creating the src/main/java folder). Run UT and fail.
*	Copy code of WeatherRetriever and run UT and pass.
*	mvn verify
*	git add src
*	git commit and git push and CI should pass

#Step 4

Here is what we will add in step 4:

*	TestWeatherParser.java
*	WeatherParser.java
*	Weather.java

Here are steps:

*	Explain and copy TestWeatherParser.java
*	Make compile pass by adding empty WeatherParser and Weather class. Need to manually add missing methods. Run UT and fail.
*	Copy code of WeatherParser and Weather and run UT and pass.
*	mvn verify
*	git add src
*	git commit and git push and CI should pass

#Step 5

Here is what we will add or update in step 5:

*	index.jsp
*	WeatherPage.java
*	WeatherTest.java

Here are steps:

*	uncomment JSP code
*	mvn test jetty:run, manual test
*	Explain and copy WeatherTest.java
*	mvn verify
*	git add src
*	git commit and git push and CI run and pass

#Step 6

Here is what we will add or update in step 6:

*	i_can_get_wearing_advice.story
*	TestWearingAdvice.java
*	Weather.java

Here are steps:

*	Explain and copy i_can_get_wearing_advice.story
*	mvn verify and BDD case fail
*	TDD Weather.getWearingAdvice()
*	update index.jsp to add wearing advice display
*	mvn verify
*	git add src
*	git commit
*	git push and CI run and pass