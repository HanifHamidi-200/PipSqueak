import java.io.FileInputStream;
import java.util.Random;
import java.util.Scanner;

public class startTest {
	private String path;
	private int _mode;
	private String a[]=new String[100];
	private String b[]=new String[14];
	private String _countshort;
	private String _countlong;
	private String col1[] = new String[1000];
	private String col2[] = new String[1000];
	private String col3[] = new String[1000];
	private String col4[] = new String[1000];
	private boolean _TransliterationOn = false;
	private boolean _LongVersion = false;
	private int numbers[] = new int[10];
	private boolean correct[] = new boolean[10];
	private boolean usefirst[] = new boolean[10];
	private int PipLength[] = new int[10];
	private int nTestNumber=1;
	private int nTestType=1;
	private String tryAnswer, realAnswer;
	private String _STRAT_;
	private String _STRAT2_;
	
	public void setSTRAT(String value) {
		_STRAT_ = value;
	}

	public void setSTRAT2(String value) {
		_STRAT2_ = value;
	}
	
	public startTest(String file_path) {
		path = file_path;
		for(int i=1;i<=10;i++) {
			correct[i-1] = false;
		}
		for(int i=1;i<=10;i++) {
			PipLength[i-1] = 0;
		}
		fGetNumbers();
	}

	public void fStart(String file_path) {
		path = file_path;
	}
	
	public boolean getTransliterationOn() {
		return _TransliterationOn;
	}
	
	public boolean getLongVersion() {
		return _LongVersion;
	}
	
	public void setTransliterationOn(boolean value) {
		_TransliterationOn = value;
	}
	
	public void setLongVersion(boolean value) {
		_LongVersion = value;	
	}
	
	public String getCount1() {
		return _countshort;
	}
	public String getCount2() {
		return _countlong;
	}
	
	public void setCount1(String value) {
		_countshort = value;
	}
	
	public void setCount2(String value) {
		_countlong = value;
	}
	
	public void setMode(int value) {
		_mode = value;
	}

	public String getCol1(int nPos) {
		return col1[nPos-1];
	}

	public String getCol2(int nPos) {
		return col2[nPos-1];
	}
	
	public String getCol3(int nPos) {
		return col3[nPos-1];
	}
	
	public String getCol4(int nPos) {
		return col4[nPos-1];
	}

	public void setCol1(int nPos, String value) {
		col1[nPos] = value;
	}
	
	public void setCol2(int nPos, String value) {
		col2[nPos] = value;
	}
	
	public void setCol3(int nPos, String value) {
		col3[nPos] = value;
	}

	public void setCol4(int nPos, String value) {
		col4[nPos] = value;
	}

	public void setNumbers(int nPos, int value1, boolean value2) {
		numbers[nPos-1] = value1;
		usefirst[nPos-1] = value2;
	}

	public void setTestnumber(int value) {
		nTestNumber = value;
	}
	
	public int getTestnumber() {
		return nTestNumber;
	}
	
	public void increaseTestnumber() {
		boolean bFound=false;
		nTestNumber++;
		if(nTestNumber==11) {
			nTestNumber=1;
		}
		if(correct[nTestNumber-1]) {
			do {
				nTestNumber++;
				if(nTestNumber==11) {
					nTestNumber=1;
				}
			}while (correct[nTestNumber-1]==false);
		}
	}
		
	void decreaseTestnumber() {
		boolean bFound=false;
		nTestNumber--;
		if(nTestNumber==0) {
			nTestNumber=10;
		}
		if(correct[nTestNumber-1]) {
			do {
				nTestNumber--;
				if(nTestNumber==0) {
					nTestNumber=10;
				}
			}while (correct[nTestNumber-1]==false);
		}
	}

	public void fPipSqueak5() {
		PipLength[nTestNumber-1] += 6;
		if(PipLength[nTestNumber-1]>realAnswer.length()) {
			PipLength[nTestNumber-1] = realAnswer.length();
		}
	}
	
	public void fPipSqueak1() {
		PipLength[nTestNumber-1] += 2;
		if(PipLength[nTestNumber-1]>realAnswer.length()) {
			PipLength[nTestNumber-1] = realAnswer.length();
		}
	}

	public void setTestType(int value) {
		nTestType = value;
	}
	
	public int getTestType() {
		return nTestType;
	}

	public void fDisplay() {
		int nPos = numbers[nTestNumber-1];
		boolean first = usefirst[nTestNumber-1];
		String sText, sTesttext1, sTesttext2;
		
		if(first) {
			if(_TransliterationOn==false) {
				sTesttext1=col1[nPos-1];			
			}
			else {
				sTesttext1=col2[nPos-1];
			}			
			sTesttext2=col3[nPos-1];
		}
		else {
			sTesttext1=col3[nPos-1];
			if(_TransliterationOn==false) {
				sTesttext2=col1[nPos-1];			
			}
			else {
				sTesttext2=col2[nPos-1];
			}			
		}
		realAnswer=sTesttext2;
		
		System.out.println("======================");
		sText = "TESTTYPE = " + nTestType;
		System.out.println(sText);
		sText = "QUESTION = " + nTestNumber + " OF 10";
		System.out.println(sText);
		sText = sTesttext1;
		System.out.println(sText);
		if(PipLength[nTestNumber-1]>0) {
			sText = "PIPANSWER = " + realAnswer.substring(0,PipLength[nTestNumber-1]-1);
			System.out.println(sText);
		}
		System.out.println("======================");
		System.out.println("[1] NextQuestion");
		System.out.println("[2] PreviousQuestion");
		System.out.println("[3] AttemptAnswer");
		System.out.println("[4] PipSqueak5");
		System.out.println("[5] PipSqueak1");
		System.out.println("[6] QuitTest/CheckScore");
		System.out.println("======================");
		
	}
	
	public int fProcess() {
		int nAnswer;
		Scanner input = new Scanner(System.in);
		
		nAnswer=input.nextInt();
		
		return nAnswer;
	}
	
	private boolean fTry(String value) {
		tryAnswer = value.trim();
		
		if(tryAnswer.equals(realAnswer.trim())) {
			correct[nTestNumber-1] = true;
			return true;
		}
		else {
			System.out.printf("NOT -> %s\n",tryAnswer);
			return false;
		}
	}

	public boolean fProcessAnswer() {
		
		System.out.println("======================");
		System.out.println("GIVE_ANSWER");
		String sAnswer;
		Scanner input = new Scanner(System.in);
		
		sAnswer=input.nextLine();
		
		boolean bCorrect = fTry(sAnswer);

		if(bCorrect) {
			boolean bMatch = false;
			int i = 0;
			int nPos = numbers[nTestNumber-1];
			
			System.out.printf("%s = %s = %s\n",nPos,nTestNumber,col4[nPos-1]);
			String sLine = _STRAT_ + col4[nPos];
			int l,s;
			l=sLine.length();
			s=3;
	        sLine=sLine.substring(s, l);
	        	
	        do {
				i++;
				bMatch = a[i-1].equals(sLine.trim());
			}while (!bMatch);
			i++;
			String sNew = _STRAT2_ + a[i-1];
			col4[nPos] = sNew;
			System.out.println("CORRECT!");
			System.out.println("======================");			
		}
		else {
			System.out.println(realAnswer);
			System.out.println("======================");						
		}
		
		return bCorrect;
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
	          for(int i=1;i<=100;i++) {
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