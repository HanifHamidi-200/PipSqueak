import java.util.Random;
import java.util.Scanner;

public class HTable {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		Random rnd1=new Random();
		storeName myname = new storeName("Hanif");
		classMENU mymenu = new classMENU();
				
		test1 _test1 = new test1();
		test2 _test2 = new test2();
		test3 _test3 = new test3();
		altMeteor _meteor = new altMeteor();
		altCards _cards = new altCards();
		
		boolean bFound = false;
		int nAnswer;
		String sAnswer;
		
		myname.Saying();
		do {
			mymenu.fDisplay();
			nAnswer=mymenu.fProcess();
			switch(nAnswer) {
			case 1:
				System.out.println("UseLettersInstead TRUE/FALSE");
				sAnswer=input.nextLine();
				if(sAnswer.equals("TRUE")) {
					_test1.setUseLetters(true);					
				}
				else {
					_test1.setUseLetters(false);
				}
				_test1.fStart();
				_test1.fProcess();
				break;
			case 2:
				System.out.println("RandomOrder TRUE/FALSE");
				sAnswer=input.nextLine();
				if(sAnswer.equals("TRUE")) {
					_test2.setRandomOrder(true);					
				}
				else {
					_test2.setRandomOrder(false);
				}
				_test2.fStart();
				_test2.fProcess();
				break;
			case 3:
				System.out.println("RandomOrder TRUE/FALSE");
				sAnswer=input.nextLine();
				if(sAnswer.equals("TRUE")) {
					_test3.setRandomOrder(true);					
				}
				else {
					_test3.setRandomOrder(false);
				}
				_test3.fStart();
				_test3.fProcess();
				break;
			case 4:
				System.out.println("RandomOrder TRUE/FALSE");
				sAnswer=input.nextLine();
				if(sAnswer.equals("TRUE")) {
					_meteor.setRandomOrder(true);					
				}
				else {
					_meteor.setRandomOrder(false);
				}
				_meteor.fStart();
				_meteor.fProcess();
				break;
			case 5:
				_cards.fStart();
				break;
			default:
				bFound = true;
				break;
			}
		} while (bFound==false);
	}
}
