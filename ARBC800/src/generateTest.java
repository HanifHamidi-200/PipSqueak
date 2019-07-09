import java.io.FileInputStream;
import java.util.Random;

public class generateTest {
	private String path;
	private int _mode;
	private String a[]=new String[100];
	private String b[]=new String[14];
	private String _countshort;
	private String _countlong;
	private String col1[] = new String[1000];
	private String col2[] = new String[1000];
	private String col3[] = new String[1000];
	private boolean _TransliterationOn = false;
	private boolean _LongVersion = false;
	private int numbers[] = new int[10];
	private int numbers2[] = new int[10];
	private boolean usefirst[] = new boolean[10];
	
	public int getNumbers(int nPos) {
		return numbers[nPos-1];
	}

	public boolean getFirst(int nPos) {
		return usefirst[nPos-1];
	}

	public void fRandom() {
		Random rnd1=new Random();
		int nPos, nThrow;
		String _count;
		boolean bMatch=false;
		
		if(_LongVersion==false) {
			_count = _countlong;
		}
		else {
			_count = _countshort;
		}
		
		int i=0;
		for(int t=1;t<=10;t++) {
			i=0;
			do {
				i++;
				bMatch = a[i-1].equals(_count);		
			}while(!bMatch);		
			nPos=rnd1.nextInt(i+1);
			numbers[t-1]=nPos+1;
			nThrow=rnd1.nextInt(10);
			if(nThrow<=5) {
				usefirst[t-1] = true;
			}
			else {
				usefirst[t-1] = false;
			}
		}
				
		sortNumbers();
		for(int t=1;t<=10;t++) {
			System.out.printf("[%s] %s\n",numbers[t-1],usefirst[t-1]);
		}
	}
	
	private void sortNumbers() {
		numbersSort num1 = new numbersSort();
		for(int i=1;i<=10;i++) {
			num1.fSetNumbers(i-1,numbers[i-1]);
		}
		num1.fPalindrome();
		for(int i=1;i<=10;i++) {
			numbers2[i-1]=num1.fGetNumbers(i-1);
		}
		for(int i=1;i<=10;i++) {
			numbers[i-1]=numbers2[i-1];
		}
	}
	public generateTest(String file_path) {
		path = file_path;
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
	
	public void setCol1(int nPos, String value) {
		col1[nPos] = value;
	}
	
	public void setCol2(int nPos, String value) {
		col2[nPos] = value;
	}
	
	public void setCol3(int nPos, String value) {
		col3[nPos] = value;
	}
	private void fGetNumbers() {
		String sFilename="C:/A_OldPowersourceServer/numbers.txt";
		boolean bDone=false;
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
	        	      bDone=true;
	        	  a[i-1]=sLine;
	          }
	          fin.close();    
	        }catch(Exception e){System.out.println(e);}    
	          

			
	}

}