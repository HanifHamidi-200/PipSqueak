
public class chickens {
	private int _amount;
	
	public chickens(int value) {
		_amount = value;
	}
	
	public void setAmount(int value) {
		_amount = _amount-value;
	}
	
	public int getAmount() {
		return _amount;
	}
	
	public void Saying() {
		System.out.printf("chickens = %s\n", getAmount());
	}
	
}
