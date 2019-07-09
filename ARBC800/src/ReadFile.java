import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileInputStream;

public class ReadFile {
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

	public ReadFile(String file_path) {
		path = file_path;
		fGetNumbers();
	}
	
	public String[] OpenFile() throws IOException{
		FileReader fr = new FileReader(path);
		BufferedReader textreader = new BufferedReader(fr);
		
		String nLines=readLines(true);
		_countshort=nLines;
		nLines=readLines(false);
		_countlong=nLines;
		String textData[] = new String[100];
		
		int i=0;
		boolean bMatch=false;
		String sLine;

		sLine=textreader.readLine();
		sLine=textreader.readLine();
		sLine=textreader.readLine();
		sLine=textreader.readLine();
		
		nLines=_countshort;
		do {
			i++;
			textData[i-1]=textreader.readLine();
			System.out.printf("%s %s \n",i,textData[i-1]);
			bMatch = a[i-1].equals(nLines);
			if(bMatch) {
				System.out.println("FOUND");
			}
			col1[i-1]=textData[i-1];
		} while (!bMatch);
		
		i=0;
		bMatch=false;

		do {
			i++;
			textData[i-1]=textreader.readLine();
			System.out.printf("%s %s \n",i,textData[i-1]);
			bMatch = a[i-1].equals(nLines);
			if(bMatch) {
				System.out.println("FOUND");
			}
			col2[i-1]=textData[i-1];
		} while (!bMatch);
		
		i=0;
		bMatch=false;

		do {
			i++;
			textData[i-1]=textreader.readLine();
			System.out.printf("%s %s \n",i,textData[i-1]);
			bMatch = a[i-1].equals(nLines);
			if(bMatch) {
				System.out.println("FOUND");
			}
			col3[i-1]=textData[i-1];
		} while (!bMatch);

		if(_LongVersion) {
			i=0;
			bMatch=false;
			do {
				i++;
				bMatch = a[i-1].equals(nLines);
			}while(!bMatch);
			nLines=_countlong;
			do {
				i++;
				textData[i-1]=textreader.readLine();
				System.out.printf("%s %s \n",i,textData[i-1]);
				bMatch = a[i-1].equals(nLines);
				if(bMatch) {
					System.out.println("FOUND");
				}
				col1[i-1]=textData[i-1];
			} while (!bMatch);
			
			i=0;
			bMatch=false;
			do {
				i++;
				bMatch = a[i-1].equals(nLines);
			}while(!bMatch);
			nLines=_countlong;
			do {
				i++;
				textData[i-1]=textreader.readLine();
				System.out.printf("%s %s \n",i,textData[i-1]);
				bMatch = a[i-1].equals(nLines);
				if(bMatch) {
					System.out.println("FOUND");
				}
				col2[i-1]=textData[i-1];
			} while (!bMatch);
	
			i=0;
			bMatch=false;
			do {
				i++;
				bMatch = a[i-1].equals(nLines);
			}while(!bMatch);
			nLines=_countlong;
			do {
				i++;
				textData[i-1]=textreader.readLine();
				System.out.printf("%s %s \n",i,textData[i-1]);
				bMatch = a[i-1].equals(nLines);
				if(bMatch) {
					System.out.println("FOUND");
				}
				col3[i-1]=textData[i-1];
			} while (!bMatch);
	}
		textreader.close();
		
		return textData;
	}

	String readLines(boolean bShort){
	
		String sFilename="C:/A_OldPowersourceServer/numbers2.txt";
		boolean bDone=false;
		  try{    
	          FileInputStream fin=new FileInputStream(sFilename);    
	     	  int r=0,l=0,s=0;    
	      	 String sLine=null;
	       	  while((r=fin.read())!=13){
	       		 sLine=sLine+(char)r;  	        		  			
	       	  }
	          for(int i=1;i<=10;i++) {
	        	  sLine=null;
	        	  while((r=fin.read())!=13){
	        		 sLine=sLine+(char)r;  	        		  			
	        	  }
	        	  l=sLine.length();
	        	  s=5;
	        	  sLine=sLine.substring(s, l);
	        	      bDone=true;
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