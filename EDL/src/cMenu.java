import java.util.Scanner;

public class cMenu {
	public int fAsk() {
		System.out.println("[1] BootesBelong");
		System.out.println("[2] AssimiliationTechnology_lists");
		System.out.println("[3] ElectronicsDealNegotiations");
		System.out.println("[4] Exit");
		
		int nAnswer;
		Scanner input = new Scanner(System.in);
		
		nAnswer=input.nextInt();
		return nAnswer;
		
		
	}
}
