import java.util.Scanner;

public class classSELECT {
	private int _originalmass;
	private int _metal;
	private int _gas;
	private int mnCount1 = 900;
	private int mnCount2 = 184;
	private int mnCount3 = 31;
	
	public void setOriginalmass(int value) {
		_originalmass = value;
	}
	
	public int getOriginalmass() {
		return _originalmass;
	}

	public void setMetal(int value) {
		_metal = value;
	}
	
	public int getMetal() {
		return _metal;
	}

	public void setGas(int value) {
		_gas = value;
	}
	
	public int getGas() {
		return _gas;
	}
	
	public void fDisplay1() {
		System.out.println("======================");
		System.out.println("Enter Originalmass [max900]");
	}
	
	public void fDisplay2() {
		System.out.println("======================");
		System.out.println("Enter Metal [max184]");
	}

	public void fDisplay3() {
		System.out.println("======================");
		System.out.println("Enter Gas [max31]");
	}

	public int fProcess() {
		int nAnswer;
		Scanner input = new Scanner(System.in);
		
		nAnswer=input.nextInt();
		
		return nAnswer;
	}

}
