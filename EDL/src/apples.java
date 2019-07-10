import java.util.Random;
import java.util.Scanner;

public class apples {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		Random rnd1=new Random();
		tuna myname = new tuna("Hanif");
		cMenu mymenu =  new cMenu();
		String sReply;
		boolean bFound = false;
		int mnView,mnItem;
		int nAnswer;
		
		myname.Saying();
		mnItem=rnd1.nextInt(4);
		do {
			nAnswer=mymenu.fAsk();
			switch(nAnswer) {
			case 1:
				mnView=1;
				System.out.println("mnView = "+mnView);
				break;
			case 2:
				mnView=2;
				System.out.println("mnView = "+mnView);
				break;
			case 3:
				mnView=3;
				System.out.println("mnView = "+mnView);
				break;
			default:
				bFound=true;
				break;
			}
		} while (bFound==false);
	}
}

