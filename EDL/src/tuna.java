
public class tuna {
	private String _name;

	public tuna(String text) {
		_name = text;
	}
	
	public void setName(String text) {
		_name = text;
	}
	
	public String getName() {
		return _name;
	}
	
	public void Saying() {
		System.out.printf("Your name is %s\n", getName());
	}
	
}
