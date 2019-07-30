import java.util.Scanner;

public class classMENU {
	private int _factor;
	
	public classMENU(int value) {
		_factor = value;
	}

	public void setFactor(int value) {
		_factor = value;		
	}
	
	public int getFacotor() {
		return _factor;
	}
	
	public void fDisplay() {
	
		System.out.println("======================");
		System.out.println("MainMenu");
		System.out.println("======================");
		System.out.println("[1] ChangeFactor = "+_factor);
		System.out.println("[2] ListDown");
		System.out.println("[3] ListAcross");
		System.out.println("[4] TestDown");
		System.out.println("[5] TestAcross");
		System.out.println("[6] CorrectionInjection");
		System.out.println("[7] SteppedDiscussion");
		System.out.println("[8] LongMultiplication");
		System.out.println("[9] Addition");
		System.out.println("[10] Subtraction");
		System.out.println("[11] EXIT");
		System.out.println("======================");
	}
	
	public int fProcess() {
		int nAnswer;
		Scanner input = new Scanner(System.in);
		
		nAnswer=input.nextInt();
		
		return nAnswer;
	}
}