import java.util.Scanner;

public class classMENU {
	public void fDisplay() {
		
		System.out.println("======================");
		System.out.println("MainMenu");
		System.out.println("======================");
		System.out.println("[1] WethersOriginal");
		System.out.println("[2] InheritanceParts");
		System.out.println("[3] CorrectionBasis");
		System.out.println("[4] EXIT");
		System.out.println("======================");
	}
	
	public void fSubDisplay1() {
		
		System.out.println("======================");
		System.out.println("WethersOriginal");
		System.out.println("======================");
		System.out.println("[1] startTestNormal_Options");
		System.out.println("[2] startTestNormal");
		System.out.println("[3] MisogynyStructures_Options");
		System.out.println("[4] MisogynyStructures");
		System.out.println("[5] LongDivision");
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
