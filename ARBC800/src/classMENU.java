import java.util.Scanner;

public class classMENU {
	boolean _TransliterationOn = false;
	boolean _LongVersion = false;
	int _TestType = 1;
	
	public boolean getTransliterationOn() {
		return _TransliterationOn;
	}
	
	public boolean getLongVersion() {
		return _LongVersion;
	}
	
	public int getTestType() {
		return _TestType;
	}

	public void setTransliterationOn(boolean value) {
		_TransliterationOn = value;
	}
	
	public void setLongVersion(boolean value) {
		_LongVersion = value;	
	}

	public void setTestType(int value) {
		_TestType = value;	
	}

	public void fDisplay() {
		String sText;
		
		System.out.println("======================");
		System.out.println("[1] Teston Japanese");
		System.out.println("[2] Teston Korean");
		System.out.println("[3] Teston Russian");
		System.out.println("[4] Teston Arabic");
		System.out.println("[5] Teston Greek");
		System.out.println("[6] Teston Canadian");
		System.out.println("[7] Teston Austrian");
		System.out.println("[8] View test");
		System.out.println("[9] Change TestType");
		System.out.println("[10] STARTTEST");
		System.out.println("[11] View results");
		sText="[12] [option] TransliterationOn";
		if(_TransliterationOn==false) {
			sText = sText + " = OFF";
		}
		else {
			sText = sText + " = ON";
		}
		System.out.println(sText);
		sText="[13] [option] LongVersion";
		if(_LongVersion==false) {
			sText = sText + " = OFF";
		}
		else {
			sText = sText + " = ON";
		}
		System.out.println(sText);
		System.out.println("[14] EXIT");
		System.out.println("======================");
	}
	public void fDisplay2() {
		String sText;
		
		System.out.println("======================");
		sText="TESTTYPE = " + _TestType;
		System.out.println(sText);
		System.out.println("======================");
		System.out.println("[1] TypedTest");
		System.out.println("[2] MultipleChoice4");
		System.out.println("[3] GuessLetters");
		System.out.println("[4] Hangman");
		System.out.println("[5] MemorySwap");
		System.out.println("[6] ColumnSwap");
		System.out.println("[7] CANCEL");
		System.out.println("======================");
	}
	
	public int fProcess() {
		int nAnswer;
		Scanner input = new Scanner(System.in);
		
		nAnswer=input.nextInt();
		
		return nAnswer;
	}
}