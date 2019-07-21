import java.util.Scanner;

public class selectBoys {
	private int mnBoys;
	
	public void setBoys(int value) {
		mnBoys = value;
	}
	
	public int getBoys() {
		return mnBoys;
	}
	
	public void fProcess() {
		int nAnswer;
		String sText;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("======================");
		sText = "Boys = " + mnBoys;
		System.out.println(sText);
		System.out.println("======================");
		System.out.printf("Enter new number ");
		nAnswer=input.nextInt();
		mnBoys = nAnswer;
	}
}


