import java.util.Scanner;

public class cMenu {
	public int fAsk() {
		System.out.println("[1] View Col1");
		System.out.println("[2] View Col2");
		System.out.println("[3] View Col3");
		System.out.println("[4] View Col4");
		System.out.println("[5] mnItem UP");
		System.out.println("[6] mnItem DOWN");
		System.out.println("[7] Edit mnItem");
		System.out.println("[8] PushToBack mnItem");
		System.out.println("[9] PullUpTo mnItem");
		System.out.println("[10] Exit");
		
		int nAnswer;
		Scanner input = new Scanner(System.in);
		
		nAnswer=input.nextInt();
		return nAnswer;
		
		
	}
}