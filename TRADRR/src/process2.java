
public class process2 {
	private int _1VaseH;
	private int _CWSHEP;
	private int _ConstM;
	private int _EDEAL;
	private int _CWOOL;

	public void setAll(int value1, int value2, int value3, int value4, int value5) {
		_1VaseH = value1;
		_CWSHEP = value2;
		_ConstM = value3;
		_EDEAL = value4;
		_CWOOL = value5;	
	}
	
	public int takeN(int pos) {
		int i = 0;
		boolean bFound = false;
		int nExamine=0;
		int nCount = 0;
		
		do {
			i++;
			switch(i) {
			case 1:
				nExamine = _1VaseH;
				break;
			case 2:
				nExamine = _CWSHEP;
				break;
			case 3:
				nExamine = _ConstM;
				break;
			case 4:
				nExamine = _EDEAL;
				break;
			case 5:
				nExamine = _CWOOL;
				break;
			default:
				bFound = true;
				break;
			}
			if(!bFound) {
				if(nExamine>0) {
					nCount++;
				}
				if(pos==nCount) {
					pos = i;
					bFound = true;
				}
			}
		}while (bFound==false);
		switch(pos) {
		case 1:
			if(_1VaseH>0) {
				return 1;
			}
			else {
				return 0;
			}
		case 2:
			if(_CWSHEP>0) {
				return 2;
			}
			else {
				return 0;
			}
		case 3:
			if(_ConstM>0) {
				return 3;
			}
			else {
				return 0;
			}
		case 4:
			if(_EDEAL>0) {
				return 4;
			}
			else {
				return 0;
			}
		default:
			if(_CWOOL>0) {
				return 5;
			}
			else {
				return 0;
			}
	}
	}
}
