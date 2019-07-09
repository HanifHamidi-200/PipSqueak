
public class column {
private String[] _letter = new String[10];
	
	public column(String value,int index) {
		_letter[index-1] = value;
	}
	
	public void setLetter(String text,int index) {
		_letter[index-1] = text;
	}
	
	public String getLetter(int index) {
		return _letter[index-1];
	}

	public void fView(String sTitle) {
		System.out.println(sTitle);
		System.out.println("=====");
		for(int i=1;i<=10;i++) {
			System.out.println("["+i+"] "+_letter[i-1]);		
		}
	}
}
