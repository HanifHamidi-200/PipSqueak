
public class soap {
	private String _date;
	
	public soap(String text) {
		_date=text;
	}
	
	public void setDate(String text) {
		_date=text;
	}
	
	public String getDate() {
		return _date;
	}
	
	public void Saying() {
		System.out.printf("The date is %s\n", getDate());
	}
}
