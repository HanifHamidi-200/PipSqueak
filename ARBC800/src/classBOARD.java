import java.io.FileInputStream;

public class classBOARD {

	private String a[]=new String[100];
	
	public classBOARD() {
		fGetNumbers();
	}
	
	public void fDisplay(String _count,String[] col1,String[] col2) {
		int i=0;
		boolean bMatch=false;
			
		do {
			i++;
			System.out.printf("[%s] %s = %s\n",i,col1[i-1],col2[i-1]);
			bMatch = a[i-1].equals(_count);
			if(bMatch) {
				System.out.println("FOUND");
			}
		}while (!bMatch);
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
}
