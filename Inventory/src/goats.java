
public class goats {
private int _amount;
	
	public goats(int value) {
		_amount = value;
	}
	
	public void setAmount(int value) {
		_amount = _amount-value;
	}
	
	public int getAmount() {
		return _amount;
	}
	
	public void Saying() {
		System.out.printf("goats = %s\n", getAmount());
	}
}
