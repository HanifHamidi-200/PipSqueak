import java.util.Random;
import java.util.Scanner;

public class testCorrection {
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
	private int a[] = new int[10];
	private int b[] = new int[10];
	private boolean tryAnswer[] = new boolean[10];
	private int realAnswer[] = new int[10];
	private int givenAnswer[] = new int[10];
	private boolean correct[] = new boolean[10];
	Random rnd1=new Random();
	private String[] _wrongs = new String[12];

	public void fReset() {
		fVoidfill();
		for(int i=1;i<=12;i++) {
			_wrongs[i-1] = null;
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
	
	public void fPrepareQuestions() {
		int nThrow;
		int nVariance;
		
		for(int i=1;i<=10;i++) {
			a[i-1] = rnd1.nextInt(11)+1;
			b[i-1] = rnd1.nextInt(11)+1;
			tryAnswer[i-1] = false;
			realAnswer[i-1] = a[i-1]*b[i-1];
			nThrow = rnd1.nextInt(10);
			if(nThrow<=5) {
				correct[i-1] = true;
				givenAnswer[i-1] = realAnswer[i-1];
			}
			else {
				correct[i-1] = false;
				nVariance = rnd1.nextInt(9)+1;
				givenAnswer[i-1] = realAnswer[i-1] + nVariance;		
			}
		}
	}
	
	public void fStart() {
		String sAnswer;
			
		Scanner input = new Scanner(System.in);
		
		System.out.println("======================");
		System.out.println("StartTest2");
		System.out.println("======================");
		for(int i=1;i<=10;i++) {
			System.out.printf("[%sx%s] = %s ",a[i-1],b[i-1],givenAnswer[i-1]);
			sAnswer = input.nextLine();
			if(sAnswer.trim().equals("TRUE") && correct[i-1]==false) {
				_wrongs[i-1] = "TRUE";
			}
			else if(sAnswer.trim().equals("TRUE")==false && correct[i-1]==true) {
				_wrongs[i-1] = "FALSE";
			}
		}
	}
	
	public void fWronglist() {
		int nCount = 0;
		
		System.out.println("======================");
		System.out.println("Wronglist");
		System.out.println("======================");
		for(int i=1;i<=10;i++) {
			if(_wrongs[i-1]!=null) {
				nCount++;
				System.out.printf("%sx%s = %s\n",a[i-1],b[i-1],givenAnswer[i-1]);
				System.out.printf("NOT %s\n",_wrongs[i-1]);
				System.out.printf("BUT %s\n",realAnswer[i-1]);				
			}
		}
		System.out.println("Count = " + nCount);
	}
}


