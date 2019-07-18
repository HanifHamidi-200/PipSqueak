import java.io.FileInputStream;
import java.util.Random;
import java.util.Scanner;

public class altMeteor {
	private String a[]=new String[200];
	private boolean mbRandomOrder;
	private String LHS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private int[] RHS = new int[26];
	private String msTeststring;
	private int mnLength, mnWordlength;
	private String msDisplay, msSofar, msReverse;
	private String msDisplayCode, msReverseCode;
	private String[] pinpoint1 = new String[] {"2S","AT","B","B","BK","C","Co","CS","D","Dg","Dm","Dv","F","FC","Fm","G","HK","K","L","Lm","Q","S","Sh","Sn","W","Z"};
	private String[] pinpoint2 = new String[] {"2Suns","AdvancedTables","TheBaby","Bookshop","TheBunkers","Calculate","Encourage","ChuckStott","Delilahs","Dosage","Demeraras","Divrent","Fancy","ForcepsAndCallipers","Familiars","Ginkers","HousingKit","Knockers","Ladders","Leamington","Quintessants","Senners","Shunts","Snowman","TheWolf","Zookeepers"};
	private boolean[] _visible = new boolean[26];
	private int[] _clue = new int[26];
	
	public altMeteor() {
		fGetNumbers();
	}
	
	public void setRandomOrder(boolean value) {
		mbRandomOrder = value;
	}
	
	public boolean getRandomOrder() {
		return mbRandomOrder;
	}
	
	private void fScreen2() {
		// Above=1, Below=2, Between=3, Any=4
		Random rnd1 = new Random();
		int nClue;
		String sText;
		int nPos2;
		int nThrow = rnd1.nextInt(10);
		
		for(int i=1;i<=26;i++) {
			if(!_visible[i-1]) {
				nClue = _clue[i-1];
				switch(nClue) {
				case 1:
					nPos2=i-1;
					if(nPos2==0) {
						nPos2 = 26;
					}
					sText = pinpoint2[i-1] + "Above=" + pinpoint2[nPos2-1];
					break;
				case 2:
					nPos2=i+1;
					if(nPos2==27) {
						nPos2 = 1;
					}
					sText = pinpoint2[i-1] + "Below=" + pinpoint2[nPos2-1];
					break;
				case 3:
					nPos2=i-1;
					if(nPos2==0) {
						nPos2 = 26;
					}
					sText = pinpoint2[i-1] + "Between=" + pinpoint2[nPos2-1];
					nPos2=i+1;
					if(nPos2==27) {
						nPos2 = 1;
					}
					sText = sText + "=" + pinpoint2[nPos2-1];
					break;
				default:
					if(nThrow<=5) {
						nPos2=i-1;
						if(nPos2==0) {
							nPos2 = 26;
						}
						sText = pinpoint2[i-1] + "Any=" + pinpoint2[nPos2-1];	
					}
					else {
						nPos2=i+1;
						if(nPos2==27) {
							nPos2 = 1;
						}
						sText = pinpoint2[i-1] + "Any=" + pinpoint2[nPos2-1];
					}
					break;
					
				}
				System.out.println(sText);
			}
		}
		System.out.println("======================");
	}
	
	public void fStart() {
		Random rnd1 = new Random();
		int nPos;
		String sText, sText2;

		for(int i=1;i<=26;i++) {
			RHS[i-1] = i-1;
			_visible[i-1] = true;
			_clue[i-1] = 0;
		}
		
		for(int i=1;i<=6;i++) {
			nPos = rnd1.nextInt(25)+1;
			_visible[nPos-1] = false;
			_clue[i-1] = rnd1.nextInt(3)+1;
		}
		
		if(mbRandomOrder) {
			fJumble();
		}
		
		fScreen();	
		fScreen2();
		
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
		System.out.println("altMETEOR");
		System.out.println("======================");
		

	}

	private void fScreen() {
		String sText;
		String sMargin;
		
		for(int i=1;i<=26;i++) {
			if(_visible[i-1]) {
				sText = LHS.substring(i-1,i)+" "+pinpoint1[RHS[i-1]];				
			}
			else {
				sText = LHS.substring(i-1,i)+" ???";
			}
			System.out.println(sText);
		}
		System.out.println("======================");
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
