import java.util.Random;
import java.util.Scanner;

public class HTable {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		Random rnd1=new Random();
		storeName myname = new storeName("Hanif");
		classMENU mymenu = new classMENU();
		
		process1 _process1 = new process1();
		process2 _process2 = new process2();
		int _1VaseH;
		int _CWSHEP;
		int _ConstM;
		int _EDEAL;
		int _CWOOL;
		int _1VaseH_T = 0;
		int _CWSHEP_T = 0;
		int _ConstM_T = 0;
		int _EDEAL_T = 0;
		int _CWOOL_T = 0;
		int[] farshelf = new int[5];
		int[] doorway1 = new int[5];
		int[] doorway2 = new int[5];
		int[] backhutch = new int[5];
		int mnCount;
		
		classINVENTORY myinventory = new classINVENTORY();
		
		boolean bFound = false;
		int nAnswer;
		int nTaken;
		
		_process1.fStart();
		_1VaseH = _process1.get1();
		_CWSHEP = _process1.get2();
		_ConstM = _process1.get3();
		_EDEAL = _process1.get4();
		_CWOOL = _process1.get5();
		
		myname.Saying();
		do {
			mymenu.setAll(_1VaseH, _CWSHEP, _ConstM, _EDEAL, _CWOOL);
			mymenu.fDisplay();
			mnCount = mymenu.getCount();
			nAnswer=mymenu.fProcess();
			if(nAnswer<=mnCount) {
				_process2.setAll(_1VaseH, _CWSHEP, _ConstM, _EDEAL, _CWOOL);
				
				nTaken = _process2.takeN(nAnswer);
				if(nTaken>0) {
					switch(nTaken) {
					case 1:
						_1VaseH_T = _1VaseH;
						_1VaseH = 0;
						break;
					case 2:
						_CWSHEP_T = _CWSHEP;
						_CWSHEP = 0;
						break;
					case 3:
						_ConstM_T = _ConstM;
						_ConstM =  0;
						break;
					case 4:
						_EDEAL_T = _EDEAL;
						_EDEAL = 0;
						break;
					default:
						_CWOOL_T = _CWOOL;
						_CWOOL = 0;
						break;
					}
					System.out.println("=PLACED=");
					System.out.println(_1VaseH);
					System.out.println(_CWSHEP);
					System.out.println(_ConstM);
					System.out.println(_EDEAL);
					System.out.println(_CWOOL);
					System.out.println("====");
					System.out.println("=TAKEN=");
					System.out.println(_1VaseH_T);
					System.out.println(_CWSHEP_T);
					System.out.println(_ConstM_T);
					System.out.println(_EDEAL_T);
					System.out.println(_CWOOL_T);
					System.out.println("====");
			
				}
			}
			else if(nAnswer==mnCount+1) {
				if(_1VaseH_T>0) {
					farshelf[0] += _1VaseH_T;
					_1VaseH_T = 0;
				}
				if(_CWSHEP_T>0) {
					farshelf[1] += _CWSHEP_T;
					_CWSHEP_T = 0;
				}
				if(_ConstM_T>0) {
					farshelf[2] += _ConstM_T;
					_ConstM_T = 0;
				}
				if(_EDEAL_T>0) {
					farshelf[3] += _EDEAL_T;
					_EDEAL_T = 0;
				}
				if(_CWOOL_T>0) {
					farshelf[4] += _CWOOL_T;
					_CWOOL_T = 0;
				}
			}
			else if(nAnswer==mnCount+2) {
				if(_1VaseH_T>0) {
					doorway1[0] += _1VaseH_T;
					_1VaseH_T = 0;
				}
				if(_CWSHEP_T>0) {
					doorway1[1] += _CWSHEP_T;
					_CWSHEP_T = 0;
				}
				if(_ConstM_T>0) {
					doorway1[2] += _ConstM_T;
					_ConstM_T = 0;
				}
				if(_EDEAL_T>0) {
					doorway1[3] += _EDEAL_T;
					_EDEAL_T = 0;
				}
				if(_CWOOL_T>0) {
					doorway1[4] += _CWOOL_T;
					_CWOOL_T = 0;
				}
			}
			else if(nAnswer==mnCount+3) {
				if(_1VaseH_T>0) {
					doorway2[0] += _1VaseH_T;
					_1VaseH_T = 0;
				}
				if(_CWSHEP_T>0) {
					doorway2[1] += _CWSHEP_T;
					_CWSHEP_T = 0;
				}
				if(_ConstM_T>0) {
					doorway2[2] += _ConstM_T;
					_ConstM_T = 0;
				}
				if(_EDEAL_T>0) {
					doorway2[3] += _EDEAL_T;
					_EDEAL_T = 0;
				}
				if(_CWOOL_T>0) {
					doorway2[4] += _CWOOL_T;
					_CWOOL_T = 0;
				}
			}
			else if(nAnswer==mnCount+4) {
				if(_1VaseH_T>0) {
					backhutch[0] += _1VaseH_T;
					_1VaseH_T = 0;
				}
				if(_CWSHEP_T>0) {
					backhutch[1] += _CWSHEP_T;
					_CWSHEP_T = 0;
				}
				if(_ConstM_T>0) {
					backhutch[2] += _ConstM_T;
					_ConstM_T = 0;
				}
				if(_EDEAL_T>0) {
					backhutch[3] += _EDEAL_T;
					_EDEAL_T = 0;
				}
				if(_CWOOL_T>0) {
					backhutch[4] += _CWOOL_T;
					_CWOOL_T = 0;
				}
			}
			else {
				switch(nAnswer) {
				case 10:
					myinventory.setAll(1, farshelf[0], farshelf[1], farshelf[2], farshelf[3], farshelf[4]);
					myinventory.setAll(2, doorway1[0], doorway1[1], doorway1[2], doorway1[3], doorway1[4]);
					myinventory.setAll(3, doorway2[0], doorway2[1], doorway2[2], doorway2[3], doorway2[4]);
					myinventory.setAll(4, backhutch[0], backhutch[1], backhutch[2], backhutch[3], backhutch[4]);					
					myinventory.fDisplay();
					break;
				case 11:
					_process1.fStart();
					_1VaseH = _process1.get1();
					_CWSHEP = _process1.get2();
					_ConstM = _process1.get3();
					_EDEAL = _process1.get4();
					_CWOOL = _process1.get5();
					break;
				default:
					bFound = true;
					break;
				}				
			}
		}while (bFound==false);
	}
}
