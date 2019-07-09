import java.util.Scanner;

public class cMenu2 {
	public int fAsk() {
		System.out.println("[1] Straight");
		System.out.println("[2] Corner");
		System.out.println("[3] Cross");
		System.out.println("[4] cancel");
			
		int nAnswer;
		Scanner input = new Scanner(System.in);
		
		nAnswer=input.nextInt();
		return nAnswer;
		
		
	}
}
