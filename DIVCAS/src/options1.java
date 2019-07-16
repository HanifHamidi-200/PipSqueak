import java.util.Scanner;

public class options1 {
	private boolean _shootUp;
	
	public void setShootup(boolean value) {
		_shootUp = value;
	}
	
	public boolean getShootup() {
		return _shootUp;
	}
	
	public void fDisplay() {
		String sText;
		
		System.out.println("======================");
		System.out.println("Options1");
		System.out.println("======================");
		if(_shootUp) {
			System.out.println("[1] shootUp = ENABLED");
			System.out.println("[2] shootAcross");			
		}
		else {
			System.out.println("[1] shootUp");
			System.out.println("[2] shootAcross = ENABLED");			
		}
		System.out.println("[3] EXIT");
		System.out.println("======================");
	}
	
	public int fProcess() {
		int nAnswer;
		Scanner input = new Scanner(System.in);
		
		nAnswer=input.nextInt();
		
		return nAnswer;
	}
}
