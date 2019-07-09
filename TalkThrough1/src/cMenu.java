import java.util.Scanner;

public class cMenu {
	public int fAsk() {
		System.out.println("[1] Enter name");
		System.out.println("[2] Enter date");
		System.out.println("[3] Enter weather");
		System.out.println("[4] Enter scores10");
		System.out.println("[5] Print startmessage");
		System.out.println("[6] Exit");
		
		int nAnswer;
		Scanner input = new Scanner(System.in);
		
		nAnswer=input.nextInt();
		return nAnswer;
	}
	
	
}
