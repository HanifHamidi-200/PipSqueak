import java.util.Random;
import java.util.Scanner;

public class HTable {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		Random rnd1=new Random();
		storeName myname = new storeName("Hanif");
		classMENU mymenu = new classMENU();
		
		ownershipManual _owner = new ownershipManual();
		
		int nAnswer;
		boolean bFound = false;
		String sAnswer;
		
		myname.Saying();
		do {
			mymenu.fDisplay();
			nAnswer=mymenu.fProcess();
			if(nAnswer<=8) {
				_owner.fDisplay(nAnswer);
				sAnswer = _owner.fProcess(nAnswer);
			}
			else {
				bFound = true;
			}
		} while (bFound==false);
	}
}