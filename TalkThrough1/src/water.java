
public class water {
	private String _weather;
	
	public water(String text) {
		_weather=text;
	}
	
	public void setWeather(String text) {
		_weather=text;
	}
	
	public String getWeather() {
		return _weather;
	}
	
	public void Saying() {
		System.out.printf("The weather is %s\n", getWeather());
	}
}
