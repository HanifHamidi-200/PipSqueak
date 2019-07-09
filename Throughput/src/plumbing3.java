
public class plumbing3 {
private int _amount;
private String _text;
private cWriteFile2 _file = new cWriteFile2();
	
	public plumbing3(int value) {
		_amount = value;		
	}
	
	public int setAmount(int value) {
		_amount = value;
		return _amount;
	}
	
	public int takeAmount(int value) {
		_amount = _amount-value;
		Saying(false);
		return _amount;
	}
	
	public int getAmount() {
		return _amount;
	}
	
	public String getText() {
		return _text;
	}
	
	public void Saying(boolean bFirst) {
		_text="CrossPlumbing = "+getAmount();
		if(!bFirst) {
			_file.writeFile(_text);			
		}
		System.out.printf("CrossPlumbing = %s\n", getAmount());
	}
}
