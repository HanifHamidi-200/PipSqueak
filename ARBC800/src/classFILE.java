import java.io.FileInputStream;  

public class classFILE {
private int _mode;
private String _count;
private String a[]=new String[1000];

	public void setMode(int value) {
		_mode = value;
		fGetNumbers();
	}

	public int getMode() {
		return _mode;
	}
	
	private void fGetNumbers() {
		String sFilename="C:/A_OldPowersourceServer/numbers.txt";
		boolean bDone=false;
		  try{    
	          FileInputStream fin=new FileInputStream(sFilename);    
	     	  int r=0,l=0,s=0;    
	      	 String sLine=null;
	          for(int i=1;i<=100;i++) {
	        	  sLine=null;
	        	  while((r=fin.read())!=13){
	        		 sLine=sLine+(char)r;  	        		  			
	        	  }
	        	  l=sLine.length();
	        	  s=6;
	        	  sLine=sLine.substring(s, l);
	        	      bDone=true;
	        	  a[i-1]=sLine;
	          }
	          fin.close();    
	        }catch(Exception e){System.out.println(e);}    
	          

			
	}
	public void fDisplay() {
		String sFilename="C:/A_OldPowersourceServer/file"+_mode+".rtf";
		boolean bFound=false;
		boolean bLine=false;
		String sLine;
		String sFirst;
		
        try{    
          FileInputStream fin=new FileInputStream(sFilename);    
    	  int r=0,nPos=0,l=0;    
	        sLine=null;
    	  for(int i=1;i<=4;i++) {
              while((r=fin.read())!=13){
      		    sLine=sLine+(char)r;                  			  
            }
    		  
    	  }
    	  l=sLine.length();
    	  System.out.println(sLine.length());
      	  byte[] barr=sLine.getBytes();  
    	  for(int i=1;i<barr.length-1;i++){
    		  if(barr[i-1]==10) {
    			  nPos=i;
    		  }
     	  }  
    	  sLine=sLine.substring(nPos, l-4);
    	  setCount(sLine);
          System.out.printf("Count=%s\n",_count);
          int i=1,c=1;
	      do {
	     	  if(a[i-1]!=" 1 1 ") {
	     		  System.out.println(a[i-1]);
	    		  i++;
	    	  }  	  
	    	  else {
	    		  i=1;
	    		  c++;
	    	  }
	    	  sLine=null;
	    	  while((r=fin.read())!=13){
	    		  sLine=sLine+(char)r;                  			  
	    	 }
	    		  System.out.printf("[%s,%s] = %s\n",a[c-1],a[i-1],sLine);
	      }while (a[c-1]!="3");
             
          fin.close();    
        }catch(Exception e){System.out.println(e);}    
          

	}
	
	private void setCount(String value) {
		_count=value;
	}
	
	private String fShort(String value) {
		int l=0,nPos=0;
		
		l=value.length();
   	  System.out.println(value.length());
     	  byte[] barr=value.getBytes();  
   	  for(int i=1;i<barr.length-1;i++){
   		  if(barr[i-1]==10) {
   			  nPos=i;
   		  }
    	  }  
   	value=value.substring(nPos, l);
   		return value;
	}
}
	