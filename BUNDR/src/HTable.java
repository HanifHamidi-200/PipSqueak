import java.util.Random;
import java.util.Scanner;

public class HTable {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		Random rnd1=new Random();
		storeName myname = new storeName("Hanif");
		classMENU mymenu = new classMENU();
			
		storeData mydata = new storeData();
		
		boolean bFound = false;
		int nAnswer, nAnswer2;
		String sAnswer;
		int _mode1 = rnd1.nextInt(4)+1;
		int _mode2 = rnd1.nextInt(9)+1;
		
		boolean _sent1, _sent2, _sent3;
		String _llast;
		
		mydata.fReset();
		myname.Saying();
		do {
			mymenu.setMode1(_mode1);
			mymenu.setMode2(_mode2);
			_sent1 = mydata.getSenta(_mode1, _mode2);
			_sent2 = mydata.getSentb(_mode1, _mode2);
			_sent3 = mydata.getSentc(_mode1, _mode2);
			mymenu.fSetSent(_sent1, _sent2, _sent3);
			_llast = mydata.getllast(_mode1, _mode2);
			mymenu.fSetLlast(_llast);
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
			case 4:
				System.out.println("[4] TRUE/FALSE");
				sAnswer=input.nextLine();
				if(sAnswer.trim().equals("TRUE")) {
					mydata.setSenta(_mode1, _mode2, true);					
				}
				else {
					mydata.setSenta(_mode1, _mode2, false);
				}
				break;
			case 5:
				System.out.println("[5] TRUE/FALSE");
				sAnswer=input.nextLine();
				if(sAnswer.trim().equals("TRUE")) {
					mydata.setSentb(_mode1, _mode2, true);					
				}
				else {
					mydata.setSentb(_mode1, _mode2, false);
				}
				break;
			case 6:
				System.out.println("[6] TRUE/FALSE");
				sAnswer=input.nextLine();
				if(sAnswer.trim().equals("TRUE")) {
					mydata.setSentc(_mode1, _mode2, true);					
				}
				else {
					mydata.setSentc(_mode1, _mode2, false);
				}
				break;
			case 7:
				System.out.println("[7] TYPE AS REQUIRED");
				sAnswer=input.nextLine();
				mydata.setpFIBON(_mode1, _mode2, sAnswer);
				break;
			case 8:
				System.out.println("[8] TYPE AS REQUIRED");
				sAnswer=input.nextLine();
				mydata.setpDIJKSR(_mode1, _mode2, sAnswer);
				break;
			case 9:
				System.out.println("[9] TYPE AS REQUIRED");
				sAnswer=input.nextLine();
				mydata.setllast(_mode1, _mode2, sAnswer);
				System.out.printf("%s = %s = %s\n",_mode1,_mode2,sAnswer);
				break;
			default:
				bFound = true;
				break;
			}
		}while (bFound==false);
	}
}
