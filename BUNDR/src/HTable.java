import java.util.Random;
import java.util.Scanner;

public class HTable {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		Random rnd1=new Random();
		storeName myname = new storeName("Hanif");
		classMENU mymenu = new classMENU();
				
		boolean bFound = false;
		int nAnswer, nAnswer2;
		String sAnswer;
		int _mode1 = rnd1.nextInt(4)+1;
		int _mode2 = rnd1.nextInt(9)+1;
		
		myname.Saying();
		do {
			mymenu.setMode1(_mode1);
			mymenu.setMode2(_mode2);
			mymenu.fDisplay();
			nAnswer=mymenu.fProcess();
			switch(nAnswer) {
			case 1:
				System.out.printf("SELECT [1-5] ");
				nAnswer2=input.nextInt();
				if(nAnswer2>=1 && nAnswer2<=5) {
					_mode1 = nAnswer2;
				}
				break;
			case 2:
				System.out.printf("SELECT [1-10] ");
				nAnswer2=input.nextInt();
				if(nAnswer2>=1 && nAnswer2<=10) {
					_mode2 = nAnswer2;
				}
				break;
			case 3:
				_mode1 = rnd1.nextInt(4)+1;
				_mode2 = rnd1.nextInt(9)+1;
				break;
			case 9:
				System.out.println("TYPE AS REQUIRED");
				sAnswer=input.nextLine();
				break;
			default:
				bFound = true;
				break;
			}
		}while (bFound==false);
	}
}
