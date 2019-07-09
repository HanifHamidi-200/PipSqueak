
public class storeResult {
private int _right,_wrong;
	
	public storeResult(int value1,int value2) {
		_right = value1;
		_wrong = value2;
	}
	
	public void setRight(int value) {
		_right = value;
	}
	
	public int getRight() {
		return _right;
	}

	public void setWrong(int value) {
		_wrong = value;
	}
	
	public int getWrong() {
		return _wrong;
	}

	public void View() {
		System.out.printf("Correct = %s\n", getRight());
		System.out.printf("Wrong = %s\n", getWrong());
	}

}
