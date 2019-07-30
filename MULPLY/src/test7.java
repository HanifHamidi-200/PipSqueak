import java.util.Random;
import java.util.Scanner;

public class test7 {
	private int col1[] = new int[12];
	private int col2[] = new int[12];
	private int col3[] = new int[12];
	private int col4[] = new int[12];
	private int col5[] = new int[12];
	private int col6[] = new int[12];
	private int col7[] = new int[12];
	private int col8[] = new int[12];
	private int col9[] = new int[12];
	private int col10[] = new int[12];
	private int col11[] = new int[12];
	private int col12[] = new int[12];
	private int[] _wrongsA = new int[180];
	private int[] _wrongsB = new int[180];
	private int[] _wrongsGiven = new int[180];
	private int mnParts;
	private int mnWrongs;
	
	public void fReset() {
		Random rnd1 = new Random();
		
		fVoidfill();
		for(int i=1;i<=180;i++) {
			_wrongsA[i-1] = 0;
			_wrongsB[i-1] = 0;
			_wrongsGiven[i-1] = 0;
		}
		mnParts = rnd1.nextInt(59)+1;
		mnWrongs = 0;
	}
	
	private void fVoidfill() {
		for(int i=1;i<=12;i++) {
			col1[i-1]=1*i;
			col2[i-1]=2*i;
			col3[i-1]=3*i;
			col4[i-1]=4*i;
			col5[i-1]=5*i;
			col6[i-1]=6*i;
			col7[i-1]=7*i;
			col8[i-1]=8*i;
			col9[i-1]=9*i;
			col10[i-1]=10*i;
			col11[i-1]=11*i;
			col12[i-1]=12*i;
		}
	}
	
	public void fStart() {
		int nAnswer;
		boolean bFound=false;
		int nSubpart, nSubparts=0;
		int nStep;
		int nInjection;
		int nWrong=0;
		String sText;
		int nA, nB;
		
		Random rnd1 = new Random();
		Scanner input = new Scanner(System.in);
		
		System.out.println("======================");
		System.out.println("SteppedDiscussion");
		sText = "STEPS = " + mnParts;
		System.out.println(sText);
		System.out.println("======================");
		nSubpart = 0;
		nSubparts = rnd1.nextInt(3)+1;
		nInjection = rnd1.nextInt(12)+1;
		nStep = 1;
		System.out.println("STEP1");
		nA = rnd1.nextInt(11)+1;
		nB = nInjection;
		do {
			nSubpart++;
			nA++;
			if (nSubpart==nSubparts+1) {
				nSubparts = rnd1.nextInt(3)+1;
				nSubpart = 1;
				nStep++;
				sText = "STEP" + nStep;
				System.out.println(sText);
			}
			if (nA>12) {
				nA = 1;
				nInjection = rnd1.nextInt(12)+1;
				nB = nInjection;
			}
			System.out.printf("%sx%s = ",nA,nB);
			nAnswer = input.nextInt();
			if (nAnswer!=nA*nB) {
				nWrong++;
				fRecordWrong(nWrong, nA, nB, nAnswer);
			}
			if (nStep==mnParts) {
				bFound = true;
			}
		} while (!bFound);
		mnWrongs = nWrong;
	}
	
	private void fRecordWrong(int nNumber, int nA, int nB, int nGiven) {
		_wrongsA[nNumber-1] = nA;
		_wrongsB[nNumber-1] = nB;
		_wrongsGiven[nNumber-1] = nGiven;
	}
	
	public void fWronglist() {
		int nCount = 0;
		
		System.out.println("======================");
		System.out.println("Wronglist");
		System.out.println("======================");
		for(int i=1;i<=mnWrongs;i++) {
			System.out.printf("%sx%s\n",_wrongsA[i-1],_wrongsB[i-1]);
			System.out.printf("NOT %s\n",_wrongsGiven[i-1]);
			System.out.printf("BUT %s\n",_wrongsA[i-1]*_wrongsB[i-1]);				
		}
		System.out.println("Count = " + mnWrongs);
	}
}


