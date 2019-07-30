import java.io.FileInputStream;
import java.util.Random;
import java.util.Scanner;

public class test10 {
	private String a[]=new String[200];
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
	private int[] _wrongsA = new int[10];
	private int[] _wrongsB = new int[10];
	private int[] _wrongsGiven = new int[10];
	private int mnParts;
	private int mnWrongs;
	private boolean mbLow;
	
	public test10() {
		fGetNumbers();
	}
	
	public void fReset() {
		Random rnd1 = new Random();
		int nThrow = rnd1.nextInt(10)+1;
		
		fVoidfill();
		for(int i=1;i<=10;i++) {
			_wrongsA[i-1] = 0;
			_wrongsB[i-1] = 0;
			_wrongsGiven[i-1] = 0;
		}
		mnParts = rnd1.nextInt(10)+1;
		mnWrongs = 0;
		if (nThrow<=5) {
			mbLow = true;
		}
		else {
			mbLow = false;
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
	
	public void fStart() {
		int nAnswer;
		int nWrong=0;
		String sText;
		int nA, nB;
		Random rnd1 = new Random();
		Scanner input = new Scanner(System.in);
		
		System.out.println("======================");
		System.out.println("Subtraction");
		sText = "STEPS = " + mnParts;
		System.out.println(sText);
		System.out.println("======================");
		for (int i=1;i<=mnParts;i++) {
			sText = "STEP" + i;
			System.out.println(sText);
			if (mbLow) {
				nA = rnd1.nextInt(18)+3;
				nB = rnd1.nextInt(nA)+1;	
				sText = nA + " - " + nB;
				System.out.println(sText);
			}
			else {
				nA = rnd1.nextInt(900)+100;
				nB = rnd1.nextInt(nA-99)+100;
				System.out.println(nA);
				System.out.println("-"+nB);
			}
			nAnswer = input.nextInt();
			if (nAnswer!=(nA-nB)) {
				nWrong++;
				fRecordWrong(nWrong, nA, nB, nAnswer);
			}
		}
		mnWrongs = nWrong;
	}
	
	private int fNumber(String sText) {
		for (int i=1;i<=100;i++) {
			if (sText.equals(a[i-1])) {
				return i;
			}
		}
		
		return 0;
	}
	private void fRecordWrong(int nNumber, int nA, int nB, int nGiven) {
		_wrongsA[nNumber-1] = nA;
		_wrongsB[nNumber-1] = nB;
		_wrongsGiven[nNumber-1] = nGiven;
	}
	
	public void fWronglist() {
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
	
	private void fGetNumbers() {
		String sFilename="C:/A_OldPowersourceServer/numbers.txt";
		  try{    
	          FileInputStream fin=new FileInputStream(sFilename);    
	     	  int r=0,l=0,s=0;    
	      	 String sLine=null;
       	  while((r=fin.read())!=13){
       		 sLine=sLine+(char)r;  	        		  			
       	  }
	          for(int i=1;i<=200;i++) {
	        	  sLine=null;
	        	  while((r=fin.read())!=13){
	        		 sLine=sLine+(char)r;  	        		  			
	        	  }
	        	  l=sLine.length();
	        	  s=5;
	        	  sLine=sLine.substring(s, l);
	        	  a[i-1]=sLine;
	          }
	          fin.close();    
	        }catch(Exception e){System.out.println(e);}    
	          

			
	}


}


