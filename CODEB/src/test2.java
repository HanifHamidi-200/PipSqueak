import java.io.FileInputStream;
import java.util.Random;
import java.util.Scanner;

public class test2 {
	private String a[]=new String[200];
	private boolean mbRandomOrder;
	private String LHS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private int[] RHS = new int[26];
	private String msTeststring;
	private int mnLength, mnWordlength;
	private String msDisplay, msSofar, msReverse;
	private String msDisplayCode, msReverseCode;
	
	public test2() {
		fGetNumbers();
	}
	
	public void setRandomOrder(boolean value) {
		mbRandomOrder = value;
	}
	
	public boolean getRandomOrder() {
		return mbRandomOrder;
	}
	
	public void fStart() {
		Random rnd1 = new Random();
		int nPos;
		String sText, sText2;

		for(int i=1;i<=26;i++) {
			RHS[i-1] = i-1;
		}
		
		if(mbRandomOrder) {
			fJumble();
		}
		
		fScreen();		
		
		msTeststring="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		mnLength=msTeststring.length();
		
		sText = null;
		sText2 = null;
		mnWordlength = rnd1.nextInt(8)+2;
		for(int i=1;i<=mnWordlength;i++) {
			nPos = rnd1.nextInt(mnLength)+1;
			sText = sText + msTeststring.substring(nPos-1,nPos);
			sText2 = sText2 + a[RHS[nPos-1]];			
		}
		msDisplay = sText;
		int s,l;
		s = 4;
		l = msDisplay.length();
		msDisplay = msDisplay.substring(s, l);
		msSofar = null;
		msReverse = sText2;
		s = 4;
		l = msReverse.length();
		msReverse = msReverse.substring(s, l);
	}

	public void fProcess() {
		String sText;
		String sAnswer;
		
		Scanner input = new Scanner(System.in);		

		System.out.println("======================");
		System.out.println("TEST2");
		System.out.println("======================");
		sText = "DISPLAY = " + msDisplay;
		System.out.println(sText);
		System.out.println("ENTER CODESTRING");		
		sAnswer=input.nextLine();
		
		if(sAnswer.trim().equals(msReverse)) {
			System.out.println("CORRECT!");
		}
		else {
			sText = "NOT = " + sAnswer;
			System.out.println(sText);
			sText = "BUT = " + msReverse;
			System.out.println(sText);
		}

	}

	private void fScreen() {
		String sText;
		
		for(int i=1;i<=26;i++) {
			sText = LHS.substring(i-1,i)+" "+a[RHS[i-1]];
			System.out.println(sText);
		}
	}
	
	private void fJumble(){
		Random rnd1=new Random();
		int[] RHS2 = new int[26];
		int[] RHS3 = new int[26];
		int nPos;
		boolean bFound;
		
		for(int i=1;i<=26;i++) {
			RHS2[i-1] = RHS[i-1];
		}
		
		for(int i=1;i<=25;i++) {
			nPos = rnd1.nextInt(25)+1;
			if (RHS2[nPos-1]!=0) {
				RHS3[i-1] = RHS2[nPos-1];
				RHS2[nPos-1]=0;
			}
			else {
				bFound = false;
				do {
					nPos++;
					if(nPos>26) {
						nPos = 1;
					}
					if (RHS2[nPos-1]!=0) {
						bFound = true;
					}
				}while (bFound==false);
				RHS3[i-1] = RHS2[nPos-1];
				RHS2[nPos-1]=0;
			}
		}
	
		for(int i=1;i<=26;i++) {
			if (RHS2[i-1]!=0) {
				RHS3[25] = RHS2[i-1];
				System.out.printf("%s = %s\n",26,RHS3[25]);
			}
		}
		
		for(int i=1;i<=26;i++) {
			RHS[i-1] = RHS3[i-1];
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
