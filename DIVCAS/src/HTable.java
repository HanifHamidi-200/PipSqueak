import java.util.Random;
import java.util.Scanner;

public class HTable {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		Random rnd1=new Random();
		storeName myname = new storeName("Hanif");
		classMENU mymenu = new classMENU();
				
		startTest1 test1 = new startTest1();
		startTest2 test2 = new startTest2();
		startTest3 test3 = new startTest3();
		options1 opt1 = new options1();
		options2 opt2 = new options2();
		
		boolean bFound = false;
		int nAnswer;
		
		boolean _shootUp = false;
		int _bitmode = 1;
		
		myname.Saying();
		do {
			mymenu.fDisplay();
			nAnswer=mymenu.fProcess();
			switch(nAnswer) {
			case 1:
				int nAnswer2, nAnswer3;
			
				mymenu.fSubDisplay1();
				nAnswer2=mymenu.fProcess();
				switch(nAnswer2) {
				case 1:
					opt1.setShootup(_shootUp);
					opt1.fDisplay();
					nAnswer3=opt1.fProcess();
					switch(nAnswer3) {
					case 1:
						_shootUp = true;
						break;
					case 2:
						_shootUp = false;
						break;
					default:
						break;
					}
				case 2:
					test1.fReset();
					test1.setShootup(_shootUp);
					test1.fStart();
					test1.fWronglist();
					break;				
				case 3:
					opt2.setBitmode(_bitmode);
					opt2.fDisplay();
					nAnswer3=opt2.fProcess();
					switch(nAnswer3) {
					case 1:
						_bitmode = 1;
						break;
					case 2:
						_bitmode = 2;
						break;
					case 3:
						_bitmode = 3;
						break;
					default:
						break;
					}
				case 4:
					test2.fReset();
					test2.setShootup(_shootUp);
					test2.setBitmode(_bitmode);
					test2.fWronglist();
					break;
				case 5:
					test3.fReset();
					test3.setShootup(_shootUp);
					test3.fStart();
					test3.fWronglist();
					break;
				default:
					break;
				}
				break;
			default:
				bFound = true;
				break;
			}
		} while (bFound==false);
	}
}
