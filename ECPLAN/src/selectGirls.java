import java.util.Scanner;

public class selectGirls {
	private int mnGirls;
	
	public void setGirls(int value) {
		mnGirls = value;
	}
	
	public int getGirls() {
		return mnGirls;
	}
	
	public void fProcess() {
		int nAnswer;
		String sText;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("======================");
		sText = "Girls = " + mnGirls;
		System.out.println(sText);
		System.out.println("======================");
		System.out.printf("Enter new number ");
		nAnswer=input.nextInt();
		mnGirls = nAnswer;
	}
}


