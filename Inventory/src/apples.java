import java.util.Scanner;
import java.util.Random;

public class apples {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		Random rnd1=new Random();
		tuna myname = new tuna("Hanif");
		chickens mychickens = new chickens(rnd1.nextInt(201));
		cows mycows = new cows(rnd1.nextInt(201));
		sheep mysheep = new sheep(rnd1.nextInt(201));
		goats mygoats = new goats(rnd1.nextInt(201));
		cMenu mymenu = new cMenu();
		int nAnswer;
		String sReply;
		int sReply2;
		boolean bFound=false;
		
		myname.Saying();
		mychickens.Saying();
		mycows.Saying();
		mysheep.Saying();
		mygoats.Saying();
		
		do {
			nAnswer=mymenu.fAsk();
			switch(nAnswer) {
			case 1:
				sReply=input.nextLine();
				myname.setName(sReply);
				break;
			case 2:
				sReply2=input.nextInt();
				mychickens.setAmount(sReply2);
				break;
			case 3:
				sReply2=input.nextInt();
				mycows.setAmount(sReply2);
				break;
			case 4:
				sReply2=input.nextInt();
				mysheep.setAmount(sReply2);
				break;
			case 5:
				sReply2=input.nextInt();
				mygoats.setAmount(sReply2);
				break;
			case 6:
				myname.Saying();
				mychickens.Saying();
				mycows.Saying();
				mysheep.Saying();
				mygoats.Saying();
				break;
			default:
				bFound=true;
				break;
			}
			} while (bFound==false);
	}
}
