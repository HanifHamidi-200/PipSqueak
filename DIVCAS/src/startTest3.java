import java.util.Random;
import java.util.Scanner;

public class startTest3 {
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
	private boolean _shootUp;	
	private int[] _wrongs = new int[10];
	private int[] _realAnswer = new int[10];
	private int a, b;
	private int _row, _remainder;
	
	public void fReset() {
		fVoidfill();
		for(int i=1;i<=10;i++) {
			_wrongs[i-1] = 0;
		}
	}
	
	private int getRow() {
		return _row;
	}
	
	private int getRemainder() {
		return _remainder;
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
	
	public void setShootup(boolean value) {
		_shootUp = value;
	}
	
	public boolean getShootup() {
		return _shootUp;
	}
	
	public void fStart() {
		int nTotal, _div, nAnswer;
		String sText;
		
		Scanner input = new Scanner(System.in);
		Random rnd1=new Random();
		
		
		System.out.println("======================");
		System.out.println("StartTest");
		System.out.println("======================");
		for(int i=1;i<=10;i++) {
			a = rnd1.nextInt(11)+1;
			b = rnd1.nextInt(11)+1;
			nTotal = a*b;
			nTotal = newtotal2(nTotal, a, b);
			nTotal = newtotal(nTotal, a, b);
						
			if(_shootUp) {
				_div = b;
			}
			else {
				_div = a;
			}
			
			_realAnswer[i-1] = fGrandCalculation(nTotal, _div);
			System.out.printf("(%s/%s) ",nTotal*1000,_div);
			nAnswer = input.nextInt();
			if (nAnswer!=_realAnswer[i-1]){
				_wrongs[i-1] = nAnswer;				
			}
		}
	}
	
	public void fWronglist() {
		int nCount = 0;
		int a, b;
		
		System.out.println("======================");
		System.out.println("Wronglist");
		System.out.println("======================");
		for(int i=1;i<=10;i++) {
			if(_wrongs[i-1]!=0) {
				nCount++;
				System.out.printf("[%s]\n",i);
				System.out.printf("NOT %s\n",_wrongs[i-1]);
				System.out.printf("BUT %s\n",_realAnswer[i-1]);				
			}
		}
		System.out.println("Count = " + nCount);
	}
	
	private int newtotal(int total, int a, int b) {
		int _div;
		
		if(_shootUp) {
			_div = b;
		}
		else {
			_div = a;
		}
		fCalculate(total, _div);
		return getRemainder();		
	}
	
	private int fGrandCalculation(int total, int _div) {
		int nH=0, nT=0, nU=0;
		int nMunicipal = total*10;
		int nTotal;
		
		fCalculate(nMunicipal, _div);
		nH = getRow();
		nMunicipal = getRemainder() * 10;
		fCalculate(nMunicipal, _div);
		nT = getRow();
		nMunicipal = getRemainder() * 10;
		fCalculate(nMunicipal, _div);
		nU = getRow();
		
		nTotal = (nH*100)+(nT*10)+(nU);
		return nTotal;
	}
	
	private void fCalculate(int total, int _div) {
		_row = 0;
		_remainder = 0;
		
		if(total>=_div) {
			do {
				total -= _div;
				_row++;
			}while (total>=_div);
			_remainder = total;
		}
	}
	
	private int newtotal2(int total, int a, int b) {
		Random rnd1 = new Random();
		int _div, _prior, _gap;
		int takegap;
		
		if(_shootUp) {
			_div = b;
		}
		else {
			_div = a;
		}
		
		if(_div==b) {
			_prior = (a-1)*b;
		}
		else {
			_prior = (b-1)*a;
		}
		_gap = total-_prior;
		if(_gap<=1) {
			takegap = _gap;
		}
		else {
			takegap = rnd1.nextInt(_gap-1);			
		}
		
		return total-takegap;
	}
	
}


