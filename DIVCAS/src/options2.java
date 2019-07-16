import java.util.Scanner;

public class options2 {
	private int _bitmode;
	
	public void setBitmode(int value) {
		_bitmode = value;
	}
	
	public int getBitmode() {
		return _bitmode;
	}
	
	public void fDisplay() {
		String sText;
		
		System.out.println("======================");
		System.out.println("Options2");
		System.out.println("======================");
		switch(_bitmode) {
		case 1:
			System.out.println("[1] LeftBit = ENABLED");
			System.out.println("[2] RightBit");			
			System.out.println("[3] Both");			
			break;
		case 2:
			System.out.println("[1] LeftBit");
			System.out.println("[2] RightBit = ENABLED");			
			System.out.println("[3] Both");			
			break;
		case 3:
			System.out.println("[1] LeftBit");
			System.out.println("[2] RightBit");			
			System.out.println("[3] Both = ENABLED");			
			break;
		}
		System.out.println("[4] EXIT");
		System.out.println("======================");
	}
	
	public int fProcess() {
		int nAnswer;
		Scanner input = new Scanner(System.in);
		
		nAnswer=input.nextInt();
		
		return nAnswer;
	}
}

