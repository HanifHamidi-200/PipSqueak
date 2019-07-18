import java.util.Scanner;

public class classMENU {
public void fDisplay() {
		
		System.out.println("======================");
		System.out.println("MainMenu");
		System.out.println("======================");
		System.out.println("[1] ReverseNumbers");
		System.out.println("[2] NumbersToLetters");
		System.out.println("[3] LettersToNumbers");
		System.out.println("[4] CODEBMeteor");
		System.out.println("[5] CODEBCards");
		System.out.println("[6] EXIT");
		System.out.println("======================");
	}
	
	public int fProcess() {
		int nAnswer;
		Scanner input = new Scanner(System.in);
		
		nAnswer=input.nextInt();
		
		return nAnswer;
	}
}
