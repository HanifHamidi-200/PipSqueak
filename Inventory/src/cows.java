
public class cows {
private int _amount;
	
	public cows(int value) {
		_amount = value;
	}
	
	public void setAmount(int value) {
		_amount = _amount-value;
	}
	
	public int getAmount() {
		return _amount;
	}
	
	public void Saying() {
		System.out.printf("cows = %s\n", getAmount());
	}
}
