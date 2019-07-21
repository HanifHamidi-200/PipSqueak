import java.util.Random;
import java.util.Scanner;

public class HTable {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		Random rnd1=new Random();
		storeName myname = new storeName("Hanif");
		classMENU mymenu = new classMENU();
		
		classMATRIX mymatrix = new classMATRIX();
		selectPrediction _prediction = new selectPrediction();
		selectGirls _mygirls = new selectGirls();
		selectBoys _myboys = new selectBoys();
		
		classRUN myrun = new classRUN();
		
		boolean bFound = false;
		int nAnswer;
		int mnGirls = 6;
		int mnBoys = 6;
		
		int[] _col1 = new int[12];
		int[] _col2 = new int[12];
		int[] _col3 = new int[12];
		int[] _col4 = new int[12];
		int[] _col5 = new int[12];
		int[] _col6 = new int[12];
		int[] _col7 = new int[12];
		int[] _col8 = new int[12];
		int[] _col9 = new int[12];
		int[] _col10 = new int[12];
		int[] _col11 = new int[12];
		int[] _col12 = new int[12];
		int[] _predictionvalues = new int[12];

		myname.Saying();
		mymatrix.fFill();
		mymatrix.fLogupScenario();
		mymatrix.fDisplay();
		do {
			mymenu.setGirls(mnGirls);
			mymenu.setBoys(mnBoys);
			mymenu.fDisplay();
			nAnswer=mymenu.fProcess();
			switch(nAnswer) {
			case 1:
				mymatrix.fFill();
				mymatrix.fLogupScenario();
				mymatrix.fDisplay();
				break;
			case 2:
				for(int i=1;i<=12;i++) {
					_col1[i-1] = mymatrix.fGetValue(1,i);
					_col2[i-1] = mymatrix.fGetValue(2,i);
					_col3[i-1] = mymatrix.fGetValue(3,i);
					_col4[i-1] = mymatrix.fGetValue(4,i);
					_col5[i-1] = mymatrix.fGetValue(5,i);
					_col6[i-1] = mymatrix.fGetValue(6,i);
					_col7[i-1] = mymatrix.fGetValue(7,i);
					_col8[i-1] = mymatrix.fGetValue(8,i);
					_col9[i-1] = mymatrix.fGetValue(9,i);
					_col10[i-1] = mymatrix.fGetValue(10,i);
					_col11[i-1] = mymatrix.fGetValue(11,i);
					_col12[i-1] = mymatrix.fGetValue(12,i);
				}
				for(int i=1;i<=12;i++) {
					_prediction.fSetValue(1,i,_col1[i-1]);
					_prediction.fSetValue(2,i,_col2[i-1]);
					_prediction.fSetValue(3,i,_col3[i-1]);
					_prediction.fSetValue(4,i,_col4[i-1]);
					_prediction.fSetValue(5,i,_col5[i-1]);
					_prediction.fSetValue(6,i,_col6[i-1]);
					_prediction.fSetValue(7,i,_col7[i-1]);
					_prediction.fSetValue(8,i,_col8[i-1]);
					_prediction.fSetValue(9,i,_col9[i-1]);
					_prediction.fSetValue(10,i,_col10[i-1]);
					_prediction.fSetValue(11,i,_col11[i-1]);
					_prediction.fSetValue(12,i,_col12[i-1]);
				}
				_prediction.fProcess();
				break;
			case 3:
				_mygirls.setGirls(mnGirls);
				_mygirls.fProcess();
				mnGirls = _mygirls.getGirls();
				break;
			case 4:
				_myboys.setBoys(mnBoys);
				_myboys.fProcess();
				mnBoys = _myboys.getBoys();
				break;		
			case 5:
				for(int i=1;i<=12;i++) {
					_predictionvalues[i-1] = _prediction.getPrediction(i);
				}
				for(int i=1;i<=12;i++) {
					myrun.setPrediction(i, _predictionvalues[i-1]);
				}
				myrun.setGirls(mnGirls);
				myrun.setBoys(mnBoys);
				myrun.fStart();
				myrun.fDisplay();
				break;
			default:
				bFound = true;
				break;
			}
		} while (bFound==false);
	}
}