import java.util.Scanner;

public class cMenu {
	public int fAsk() {
		System.out.println("[1] Enter name");
		System.out.println("[2] Take Plumbing");
		System.out.println("[3] Take Food");
		System.out.println("[4] Take Boiler");
		System.out.println("[5] Take Cart");
		System.out.println("[6] Print listsofar");
		System.out.println("[7] Print startmessage");
		System.out.println("[8] Exit");
		
		int nAnswer;
		Scanner input = new Scanner(System.in);
		
		nAnswer=input.nextInt();
		return nAnswer;
		
		
	}
}
