import java.util.Random;
import java.util.Scanner;

public class startTest1 {
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
	
	public void fReset() {
		fVoidfill();
		for(int i=1;i<=10;i++) {
			_wrongs[i-1] = 0;
		}
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
				
			if(_shootUp) {
				_div = b;
			}
			else {
				_div = a;
			}
			_realAnswer[i-1] = nTotal/_div;
			
			System.out.printf("(%s/%s) ",nTotal,_div);
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
}
