import java.util.Scanner;
import java.util.Random;

public class apples {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		Random rnd1=new Random();
		tuna myname = new tuna("Hanif");
		column col1 =  new column("A",1);
		column col2 =  new column("A",1);
		column col3 =  new column("A",1);
		column col4 =  new column("A",1);
		cMenu mymenu =  new cMenu();
		int nLetter;
		String sLetter;
		int nAnswer;
		String sReply;
		boolean bFound = false;
		int mnView,mnItem;
		
		myname.Saying();
		for(int i=1;i<=10;i++) {
			nLetter=rnd1.nextInt(4);
			switch(nLetter) {
			case 1:
				sLetter="A";
				break;
			case 2:
				sLetter="B";
				break;
			case 3:
				sLetter="C";
				break;
			default:
				sLetter="D";
				break;
			}
			col1.setLetter(sLetter,i);
		}
		for(int i=1;i<=10;i++) {
			nLetter=rnd1.nextInt(4);
			switch(nLetter) {
			case 1:
				sLetter="A";
				break;
			case 2:
				sLetter="B";
				break;
			case 3:
				sLetter="C";
				break;
			default:
				sLetter="D";
				break;
			}
			col2.setLetter(sLetter,i);
		}
		for(int i=1;i<=10;i++) {
			nLetter=rnd1.nextInt(4);
			switch(nLetter) {
			case 1:
				sLetter="A";
				break;
			case 2:
				sLetter="B";
				break;
			case 3:
				sLetter="C";
				break;
			default:
				sLetter="D";
				break;
			}
			col3.setLetter(sLetter,i);
		}
		for(int i=1;i<=10;i++) {
			nLetter=rnd1.nextInt(4);
			switch(nLetter) {
			case 1:
				sLetter="A";
				break;
			case 2:
				sLetter="B";
				break;
			case 3:
				sLetter="C";
				break;
			default:
				sLetter="D";
				break;
			}
			col4.setLetter(sLetter,i);
		}
		
		mnItem=rnd1.nextInt(10);
		do {
			nAnswer=mymenu.fAsk();
			switch(nAnswer) {
			case 1:
				mnView=1;
				col1.fView("VIEW1");
				System.out.println("mnItem = "+mnItem);
				break;
			case 2:
				mnView=2;
				col2.fView("VIEW2");
				System.out.println("mnItem = "+mnItem);
				break;
			case 3:
				mnView=3;
				col3.fView("VIEW3");
				System.out.println("mnItem = "+mnItem);
				break;
			case 4:
				mnView=4;
				col4.fView("VIEW4");
				System.out.println("mnItem = "+mnItem);
				break;
			default:
				bFound=true;
				break;
			}
		} while (bFound==false);
	}
}