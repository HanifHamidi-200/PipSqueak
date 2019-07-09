import java.util.Scanner;

public class cMenu {
	public int fAsk() {
		System.out.println("[1] Enter name");
		System.out.println("[2] Take chickens");
		System.out.println("[3] Take cows");
		System.out.println("[4] Take sheep");
		System.out.println("[5] Take goats");
		System.out.println("[6] Print startmessage");
		System.out.println("[7] Exit");
		
		int nAnswer;
		Scanner input = new Scanner(System.in);
		
		nAnswer=input.nextInt();
		return nAnswer;
		
		
	}
}
