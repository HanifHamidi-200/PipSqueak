import java.util.Random;
import java.util.Scanner;

public class HTable {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		Random rnd1=new Random();
		storeName myname = new storeName("Hanif");
		classMENU mymenu = new classMENU();
				
		classSELECT myselect = new classSELECT();
		int _originalmass = 100;
		int _metal = 3;
		int _gas = 3;
		int _metalvalence = 1;
		int _gasvalence = 1;
		int _HCF;
		int mnCount1 = 900;
		int mnCount2 = 184;
		int mnCount3 = 31;

		mymenu.setOriginalmass(_originalmass);
		HCFProgram _hcf = new HCFProgram();
		CalculationsList _calc = new CalculationsList();
		
		storeElement _element = new storeElement();
		boolean bFound = false;
		int nAnswer, nAnswer2;
		String sAnswer;
		
		searchElement _search = new searchElement();
		classRUN myrun = new classRUN();
		
		storeHCF myHCF = new storeHCF();
		
		myname.Saying();
		do {
			mymenu.setOriginalmass(_originalmass);
			mymenu.setMetal(_metal);
			mymenu.setGas(_gas);
			myHCF.setMetal(_metal);
			myHCF.setGas(_gas);
			_metalvalence = mymenu.getMetalvalence();
			_gasvalence = mymenu.getGasvalence();
			myHCF.setMetalvalence(_metalvalence);
			myHCF.setGasvalence(_gasvalence);
			myrun.setMetalvalence(_metalvalence);
			myrun.setGasvalence(_gasvalence);
			myHCF.fProcess();
			_HCF = myHCF.getHCF();
			myrun.setHCF(_HCF);
		
			mymenu.fDisplay();
			nAnswer=mymenu.fProcess();
			switch(nAnswer) {
			case 1:
				_hcf.fStart();
				_hcf.fProcess();
				_hcf.fDisplay();
				break;
			case 2:
				_calc.fDisplay();
				break;
			case 3:
				myselect.setOriginalmass(_originalmass);
				myselect.fDisplay1();
				nAnswer2 = myselect.fProcess();
				if (nAnswer2>=1 && nAnswer2 <= mnCount1) {
					_originalmass = nAnswer2;
					mymenu.setOriginalmass(_originalmass);
				}
				break;
			case 4:
				_element.fDisplay();
				break;
			case 5:
				_search.fStart();
				_search.fDisplay1();
				nAnswer2 = _search.fProcess();
				if (nAnswer2>=1 && nAnswer2 <= 10) {
					_search.setAnswer(nAnswer2);
					System.out.println("ENTER SEARCHSTRING");
					sAnswer=input.nextLine();
					_search.setSearchstring(sAnswer.trim());
					System.out.println(sAnswer.trim());
					_search.fCheck();
					_search.fDisplay2();
				}
				break;
			case 6:
				myselect.setOriginalmass(_metal);
				myselect.fDisplay2();
				nAnswer2 = myselect.fProcess();
				if (nAnswer2>=1 && nAnswer2 <= mnCount2) {
					_metal = nAnswer2;
				}
				break;
			case 7:
				myselect.setOriginalmass(_gas);
				myselect.fDisplay3();
				nAnswer2 = myselect.fProcess();
				if (nAnswer2>=1 && nAnswer2 <= mnCount3) {
					_gas = nAnswer2;
				}
				break;
			case 8:
				myrun.setOriginalmass(_originalmass);
				myrun.setMetal(_metal);
				myrun.setGas(_gas);
				myrun.fDisplay();
				myrun.fProcess();
				break;
			default:
				bFound = true;
				break;
			}
		} while (bFound==false);
	}
}
