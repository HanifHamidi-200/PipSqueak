
public class storeColumn {
private String[] _letter = new String[100];
private int _count=0;

	public storeColumn(String value,int index) {
		_letter[index-1] = value;
	}
	
	public void setLetter(String text,int index) {
		_letter[index-1] = text;
	}
	
	public String getLetter(int index) {
		return _letter[index-1];
	}
	
	public void setCount(int count) {
		_count = count;
	}
	
	public int getCount() {
		return _count;
	}

	public void fView(String sTitle) {
		System.out.println(sTitle);
		System.out.println("=====");
		for(int i=1;i<=_count;i++) {
			System.out.println("["+i+"] "+_letter[i-1]);		
		}
	}
}