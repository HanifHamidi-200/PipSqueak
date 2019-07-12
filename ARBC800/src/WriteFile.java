import java.io.FileInputStream;
import java.io.FileOutputStream;

public class WriteFile {
	private String path;
	private int _mode;
	private String a[]=new String[100];
	private String b[]=new String[14];
	private String _countshort;
	private String _countlong;
	private String col4[] = new String[1000];
	private boolean _TransliterationOn = false;
	private boolean _LongVersion = false;
	private String _STRAT_;
	private String _STRAT2_;
	
	public void setSTRAT(String value) {
		_STRAT_ = value;
	}
	
	public void setSTRAT2(String value) {
		_STRAT2_ = value;
	}
	public void setMode(int value) {
		_mode = value;
	}
	
	public WriteFile(String file_path) {
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

	public void setCol4(int nPos, String value) {
		col4[nPos] = value;
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

	public void fOpen() {
		String sText;
		String _count;
		
		if(!_LongVersion) {
			_count = _countshort;
		}
		else {
			_count = _countlong;
		}
		
		try{    
            FileOutputStream fout=new FileOutputStream(path);    
            fout.write(67); 
            fout.write(13); 
            boolean bMatch = false;
            int i = 0;
            int l,s;
            do {
            	i++;
            	sText = _STRAT_+col4[i-1];
            	l=sText.length();
    			s=3;
    			sText=sText.substring(s, l);
    	        System.out.println(sText);
            	byte b[] = sText.getBytes();
            	fout.write(b);
                fout.write(13);       	
            	bMatch = a[i-1].equals(_count);
            }while (!bMatch);
            fout.close();    
            System.out.println("Success...");    
         }catch(Exception e){System.out.println(e);}    
         	
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
