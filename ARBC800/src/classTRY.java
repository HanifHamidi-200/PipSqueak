import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class classTRY {
	private String path;
	private int _mode;
	private String a[]=new String[100];
	private String b[]=new String[14];
	private String _countshort;
	private String _countlong;
	private boolean _TransliterationOn = false;
	private boolean _LongVersion = false;
	private String col4[] = new String[1000];
	private String _STRAT_;
	private String _STRAT2_;
	
	public String getSTRAT() {
		return _STRAT_;
	}
	public String getSTRAT2() {
		return _STRAT2_;
	}
		
	public void setMode(int value) {
		_mode = value;
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

	public classTRY(String file_path) {
		path = file_path;
		fGetNumbers();
	}
	
	public void fStart(String file_path) {
		path = file_path;		
	}
	
	public void OpenFile() {
		
		String nLines=readLines(true);
		_countshort=nLines;
		nLines=readLines(false);
		_countlong=nLines;
		
		boolean bFirst = true;
		
		  try{    
	          FileInputStream fin=new FileInputStream(path);    
	     	  int r=0,l=0,s=0;    
	      	 String sLine=null;
	       	  while((r=fin.read())!=13){
	       		 sLine=sLine+(char)r;  	        		  			
	       	  }

	       	  System.out.println(sLine);
	       	  boolean bMatch = false;
	       	  int i = 0;
	       	  
	          if(!_LongVersion) {
	        	  do {
	        		  i++;
	  	        	  sLine=null;
	  	        	  while((r=fin.read())!=13){
	  	        		 sLine=sLine+(char)r;  	        		  			
	  	        	  }
		  	      	  l=sLine.length();
	  	        	  s=3;
	  	        	  sLine=sLine.substring(s, l);
	  	        	  if(bFirst) {
	  	        		  _STRAT_ = sLine.substring(0,s-1);
	  	        		  _STRAT2_ = sLine.substring(s-2,s-1);
	  	        		  System.out.println(_STRAT2_);
	  	        		  bFirst = false;
	  	        	  }
	  	        	 
	  	        	  bMatch = a[i-1].equals(_countshort);	  	        		  
	  	        	  col4[i-1]=sLine;
	  	        	  System.out.printf("[%s-A] %s\n",i,col4[i-1]);
	        	  } while (!bMatch);
	          }
	          else {
		          do {
		        	  i++;
	  	        	  sLine=null;
	  	        	  while((r=fin.read())!=13){
	  	        		 sLine=sLine+(char)r;  	        		  			
	  	        	  }
		  	      	  l=sLine.length();
	  	        	  s=3;
	  	        	  sLine=sLine.substring(s, l);
	  	        	  if(bFirst) {
	  	        		  _STRAT_ = sLine.substring(0,s-1);
	  	        		  _STRAT2_ = sLine.substring(s-2,s-1);
	  	        		  System.out.println(_STRAT2_);
	  	        		  bFirst = false;
	  	        	  }
	  	        	 
	  	        	  bMatch = a[i-1].equals(_countlong);	  	        		  
	  	        	  col4[i-1]=sLine;
	  	        	  System.out.printf("[%s-A] %s\n",i,col4[i-1]);
	        	 } while (!bMatch);
	        	  
	          }
	          fin.close();    
	        }catch(Exception e){System.out.println(e);}    
	 }

	public String getCol4(int nPos) {
		return col4[nPos-1];
	}

	String readLines(boolean bShort){
	
		String sFilename="C:/A_OldPowersourceServer/numbers2.txt";
		  try{    
	          FileInputStream fin=new FileInputStream(sFilename);    
	     	  int r=0,l=0,s=0;    
	      	 String sLine=null;
	       	  while((r=fin.read())!=13){
	       		 sLine=sLine+(char)r;  	        		  			
	       	  }
	          for(int i=1;i<=14;i++) {
	        	  sLine=null;
	        	  while((r=fin.read())!=13){
	        		 sLine=sLine+(char)r;  	        		  			
	        	  }
	        	  l=sLine.length();
	        	  s=5;
	        	  sLine=sLine.substring(s, l);
	        	  b[i-1]=sLine;
	          }
	          fin.close();    
	        }catch(Exception e){System.out.println(e);}    
	        
		if(bShort) {
			return b[_mode-1];			
		}
		else {
			return b[_mode+7-1];
		}
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
	
	public void fView() {
		String sText;
		System.out.println("======================");
		System.out.println("classTRY");
		
		boolean bMatch = false;
		int i = 0;
		
		if(!_LongVersion) {
			do {
				i++;
				sText="[" + (i-1) + "] = " + col4[i-1];
				System.out.println(sText);
	      	  	bMatch = a[i-1].equals(_countshort);
			}while (!bMatch);			
		}
		else {
			do {
				i++;
				sText="[" + (i-1) + "] = " + col4[i-1];
				System.out.println(sText);
	      	  	bMatch = a[i-1].equals(_countlong);
			}while (!bMatch);
		}
		System.out.println("======================");
			
	}

	public void fDisplay() {
		System.out.println("======================");
		System.out.println("[1] ResetScores");
		System.out.println("[2] PipClass 20");
		System.out.println("[3] PipClass 1");
		System.out.println("[4] BACK");
		System.out.println("======================");
	}
}
