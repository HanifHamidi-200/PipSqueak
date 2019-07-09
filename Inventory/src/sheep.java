
public class sheep {
private int _amount;
	
	public sheep(int value) {
		_amount = value;
	}
	
	public void setAmount(int value) {
		_amount = _amount-value;
	}
	
	public int getAmount() {
		return _amount;
	}
	
	public void Saying() {
		System.out.printf("sheep = %s\n", getAmount());
	}
}
