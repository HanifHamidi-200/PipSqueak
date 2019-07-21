import java.util.Scanner;

public class classMENU {
	private int _1VaseH;
	private int _CWSHEP;
	private int _ConstM;
	private int _EDEAL;
	private int _CWOOL;
	private int mnCount;
	
	public void setAll(int value1, int value2, int value3, int value4, int value5) {
		_1VaseH = value1;
		_CWSHEP = value2;
		_ConstM = value3;
		_EDEAL = value4;
		_CWOOL = value5;
	}
	
	public int getCount() {
		return mnCount;
	}
	
	public void fDisplay() {
		String sText;
		int i = 0;
		
		System.out.println("======================");
		System.out.println("MainMenu");
		System.out.println("======================");
		if(_1VaseH!=0) {
			i++;
			sText = "[" + i + "] 1VaseH = " + _1VaseH;
			System.out.println(sText);			
		}
		if(_CWSHEP!=0) {
			i++;
			sText = "[" + i + "] CWSHEP = " + _CWSHEP;
			System.out.println(sText);			
		}
		if(_ConstM!=0) {
			i++;
			sText = "[" + i + "] ConstM = " + _ConstM;
			System.out.println(sText);			
		}
		if(_EDEAL!=0) {
			i++;
			sText = "[" + i + "] EDEAL = " + _EDEAL;
			System.out.println(sText);			
		}
		if(_CWOOL!=0) {
			i++;
			sText = "[" + i + "] CWOOL = " + _CWOOL;
			System.out.println(sText);			
		}
		mnCount = i;
		i++;
		sText = "[" + i +"] farshelf";
		System.out.println(sText);
		i++;
		sText = "[" + i +"] doorway1";
		System.out.println(sText);
		i++;
		sText = "[" + i +"] doorway2";
		System.out.println(sText);
		i++;
		sText = "[" + i +"] backhutch";
		System.out.println(sText);
		System.out.println("[10] DisplayInventory");
		System.out.println("[11] NextQuestion");
		System.out.println("[12] EXIT");
		System.out.println("======================");
	}
	
	public int fProcess() {
		int nAnswer;
		Scanner input = new Scanner(System.in);
		
		nAnswer=input.nextInt();
		
		return nAnswer;
	}
}
