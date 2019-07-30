import java.util.Random;
import java.util.Scanner;

public class HTable {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		Random rnd1=new Random();
		storeName myname = new storeName("Hanif");
		int _factor = 4;
		classMENU mymenu = new classMENU(_factor);
		
		testStart test1 = new testStart();
		testCorrection test2 = new testCorrection();
		test7 _test7 = new test7();
		test8 _test8 = new test8();
		test9 _test9 = new test9();
		test10 _test10 = new test10();
			
		boolean bFound = false;
		int nAnswer;
		
		myname.Saying();
		do {
			mymenu.fDisplay();
			nAnswer=mymenu.fProcess();
			switch(nAnswer) {
			case 1:
				int nAnswer2;
				
				nAnswer2=input.nextInt();
				if(nAnswer2>=1 && nAnswer2<=12) {
					_factor = nAnswer2;
					mymenu.setFactor(_factor);
				}
				break;
			case 2:
				for(int i=1;i<=12;i++) {
					System.out.printf("%sx%s = %s\n",i,_factor,i*_factor);
				}
				break;
			case 3:
				for(int i=1;i<=12;i++) {
					System.out.printf("%sx%s = %s\n",_factor,i,_factor*i);
				}
				break;
			case 4:
				test1.fReset();
				test1.setDown(true);
				test1.setFactor(_factor);
				test1.fStart();
				test1.fWronglist();
				break;
			case 5:
				test1.fReset();
				test1.setDown(false);
				test1.setFactor(_factor);
				test1.fStart();
				test1.fWronglist();
				break;
			case 6:
				test2.fReset();
				test2.fPrepareQuestions();
				test2.fStart();
				test2.fWronglist();
				break;
			case 7:
				_test7.fReset();
				_test7.fStart();
				_test7.fWronglist();
				break;
			case 8:
				_test8.fReset();
				_test8.fStart();
				_test8.fWronglist();
				break;
			case 9:
				_test9.fReset();
				_test9.fStart();
				_test9.fWronglist();
				break;
			case 10:
				_test10.fReset();
				_test10.fStart();
				_test10.fWronglist();
				break;
			default:
				bFound = true;
				break;
				
			
			}
		}while (bFound==false);
	}
}
