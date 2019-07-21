import java.util.Scanner;

public class classMENU {
	private int mnGirls, mnBoys;
	
	public void setGirls(int value) {
		mnGirls = value;
	}
	
	public void setBoys(int value) {
		mnBoys = value;
	}
	
	public void fDisplay() {
		String sText;
		
		System.out.println("======================");
		System.out.println("MainMenu");
		System.out.println("======================");
		System.out.println("[1] Rerun_Matrix");
		System.out.println("[2] Enter_Predictions");
		sText = "[3] Enter_NumberofGirls = " + mnGirls;
		System.out.println(sText);
		sText = "[4] Enter_NumberofBoys = " + mnBoys;
		System.out.println(sText);
		System.out.println("[5] RUN_InheritanceParts");
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