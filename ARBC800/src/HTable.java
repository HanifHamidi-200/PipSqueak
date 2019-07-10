import java.util.Scanner;
import java.util.Random;
import java.io.FileInputStream;
import java.io.IOException;

public class HTable {
		
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		Random rnd1=new Random();
		storeName myname = new storeName("Hanif");
		storeFile file1 =  new storeFile("data.txt");
		storeResult result1 =  new storeResult(0,0);
		classMENU mymenu =  new classMENU();
		String a[]=new String[100];

		int _mode=1;
		String file_name="C:/A_OldPowersourceServer/file"+_mode+".rtf";
		classBOARD myboard =  new classBOARD();
		storeColumn column1 =  new storeColumn("A",1);
			
		generateTest atest =  new generateTest(file_name);
		startTest btest =  new startTest(file_name);
		int nTestType = 1;
		int numbers[] = new int[10];
		boolean usefirst[] = new boolean[10];

		String _countshort="1";
		String _countlong="1";
		String col1[] = new String[100];
		String col2[] = new String[100];
		String col3[] = new String[100];
		boolean _TransliterationOn = false;
		boolean _LongVersion = false;
		
		int nLetter;
		String sLetter;
		int nAnswer, nAnswer2;
		String sReply;
		boolean bFound = false;
		int mnTest,mnItem;
		
		//GetNumbers
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
	          
		  // ---
		  
		String _count;
		
		myname.Saying();
		do {
			mymenu.fDisplay();
			nAnswer=mymenu.fProcess();
			if(nAnswer<=7) {
				_mode = nAnswer;
				file_name="C:/A_OldPowersourceServer/file"+_mode+".rtf";
				
				column1.fView("TEST"+_mode);
				atest.fStart(file_name);
				atest.setLongVersion(_LongVersion);
				btest.fStart(file_name);
				btest.setLongVersion(_LongVersion);
				btest.setTransliterationOn(_TransliterationOn);
					
				try {
					ReadFile file =  new ReadFile(file_name);
					String[] aryLines;

					file.setMode(_mode);
					file.setTransliterationOn(_TransliterationOn);
					file.setLongVersion(_LongVersion);
					aryLines=(file.OpenFile());
					_countshort = file.getCount1();
					_countlong = file.getCount2();
					atest.setCount1(_countshort);
					atest.setCount2(_countlong);
					btest.setCount1(_countshort);
					btest.setCount2(_countlong);
					if(_LongVersion==false) {
						_count = _countshort;
					}
					else {
						_count = _countlong;
					}
				
					int i=1;
					boolean bMatch=false;
					do {
						if(!bMatch) {
							col1[i-1] = file.getCol1(i);	
							atest.setCol1(i-1,col1[i-1]);							
							btest.setCol1(i-1,col1[i-1]);							
						}
						i++;
						bMatch = a[i-2].equals(_count);
					} while (!bMatch);
				
					i=1;
					bMatch=false;
					do {
						if(!bMatch) {
							col2[i-1] = file.getCol2(i);	
							atest.setCol2(i-1,col2[i-1]);							
							btest.setCol2(i-1,col2[i-1]);							
						}
						i++;
						bMatch = a[i-2].equals(_count);
					}while (!bMatch);
				
					i=1;
					bMatch=false;
					do {
						if(!bMatch) {
							col3[i-1] = file.getCol3(i);	
							atest.setCol3(i-1,col3[i-1]);							
							btest.setCol3(i-1,col3[i-1]);							
						}
						i++;
						bMatch = a[i-2].equals(_count);
					}while (!bMatch);
					
					atest.fRandom();
					for(int j=1;j<=10;j++) {
						numbers[j-1] = atest.getNumbers(j);
						usefirst[j-1] = atest.getFirst(j);
					}
				}
				catch(IOException e){
					System.out.println(e.getMessage());
				}
				
				
			}
			else {		
				switch(nAnswer) {
				case 8:
					if(_LongVersion==false) {
						_count = _countshort;
					}
					else {
						_count = _countlong;
					}

					int i=0;
					boolean bMatch=false;
						
					do {
						i++;
						if(_TransliterationOn==false) {
							System.out.printf("[%s] %s = %s = %s\n",i,col1[i-1],col2[i-1],col3[i-1]);								
						}
						else {
							System.out.printf("[%s] %s = %s\n",i,col2[i-1],col3[i-1]);
						}
						bMatch = a[i-1].equals(_count);
					}while (!bMatch);
					break;
				case 9:
					mymenu.fDisplay2();
					mymenu.setTestType(nTestType);
					nAnswer2=mymenu.fProcess();
					if(nAnswer2<=6) {
						nTestType = nAnswer2;
					}
					break;
				case 10:
					btest.fStart(file_name);
					for(int j=1;j<=10;j++) {
						btest.setNumbers(j, numbers[j-1], usefirst[j-1]);
					}
					btest.setTestnumber(1);
					btest.setTestType(nTestType);
					boolean bFound2 = false;
					boolean bCorrect;
					do {
						btest.fDisplay();
						nAnswer2=btest.fProcess();
						switch(nAnswer2) {
						case 1:
							btest.increaseTestnumber();
							break;
						case 2:
							btest.decreaseTestnumber();
							break;
						case 3:
							bCorrect = btest.fProcessAnswer();
							if(bCorrect) {
								btest.increaseTestnumber();
							}
							break;
						default:
							bFound2 = true;
							break;
						}
					} while (bFound2==false);
					break;
				case 11:
					result1.View();
					break;
				case 12:
					if(_TransliterationOn==false) {
						_TransliterationOn = true;
					}
					else {
						_TransliterationOn = false;
					}
				case 13:
					if(_LongVersion==false) {
						_LongVersion = true;
					}
					else {
						_LongVersion = false;
					}
				default:
					bFound=true;
					break;
				}
			}
		} while (bFound==false);
	}
	
	
}
