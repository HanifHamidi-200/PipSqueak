
public class food {
private int _amount;
private String _text;
private cWriteFile2 _file = new cWriteFile2();

	public food(int value) {
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
		_text="Food = "+getAmount();
		if(!bFirst) {
			_file.writeFile(_text);			
		}
		System.out.printf("Food = %s\n", getAmount());
	}
}
