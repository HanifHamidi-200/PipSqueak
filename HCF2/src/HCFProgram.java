import java.io.FileInputStream;
import java.util.Random;

public class HCFProgram {
	private int _number1;
	private int _number2;
	private String a[]=new String[100];
	private String[] PokerDot = new String[] {"1000000000000","0100000000000","0000010000000","0110000000000","0000000100000","0100010000000","0000000010000","0111000000000","0000011000000","0100000100000","0000000001000","0110010000000","0000000000100","0100000010000","0000010100000","0111100000000","0000000000010","0100011000000","0000000000001","0110000100000"};
	private String _pokerdot1;
	private String _pokerdot2;
	private int mnCount=20;
	private int mnLength=13;
	private boolean[] _SumT = new boolean[13];
	private String SumT = null;
	private int SumT_total = 0;
	
	public HCFProgram() {
		fGetNumbers();
	}

	public void setNumber1(int value) {
		_number1 = value;
	}
	
	public int getNumber1() {
		return _number1;
	}

	public void setNumber2(int value) {
		_number2 = value;
	}
	
	public int getNumber2() {
		return _number2;
	}
	
	public int getTotal() {
		return SumT_total;
	}
	
	public void fStart() {
		Random rnd1 = new Random();
		
		_number1 = rnd1.nextInt(19)+1;
		_number2 = rnd1.nextInt(19)+1;		
	}
	
	public void fDisplay() {
		String sText;
		
		System.out.println("======================");
		sText = _number1 + " and " + _number2;
		System.out.println(sText);
		System.out.println("======================");
		sText = "PokerDot1 = " + _pokerdot1;
		System.out.println(sText);
		sText = "PokerDot2 = " + _pokerdot2;
		System.out.println(sText);
		sText = "SumT = " + SumT;
		System.out.println(sText);
		sText = "SumT_total = " + SumT_total;
		System.out.println(sText);
		System.out.println("======================");
	}
	

	public void fProcess() {
		String sLetter;
		boolean bCompare;
		int nTotal = 1;
		String sText;
		
		_pokerdot1 = PokerDot[_number1-1];
		_pokerdot2 = PokerDot[_number2-1];
		for(int i=1;i<=mnLength;i++) {
			_SumT[i-1] = false;
		}
	
		for(int i=1;i<=mnLength;i++) {
			sLetter = _pokerdot1.substring(i-1,i);
			bCompare = sLetter.equals("1");
			if (bCompare) {
				_SumT[i-1] = true;
			}
		}
		for(int i=1;i<=mnLength;i++) {
			sLetter = _pokerdot2.substring(i-1,i);
			bCompare = sLetter.equals("1");
			if (bCompare) {
				_SumT[i-1] = true;
			}
		}
		
		SumT = null;
		
		for(int i=1;i<=mnLength;i++) {
			if(_SumT[i-1]) {
				SumT = SumT +"1";
				nTotal *= fPipValue(i);
			}
			else {
				SumT = SumT + "0";
			}
		}
		int s, l;
		
		l = SumT.length();
		s = 4;
		SumT = SumT.substring(s, l);
		
		SumT_total = nTotal;
	}
	
	private int fPipValue(int pos) {
		switch(pos) {
		case 1:
			return 1;
		case 2:
			return 2;
		case 3:
			return 2;
		case 4:
			return 2;
		case 5:
			return 2;
		case 6:
			return 3;
		case 7:
			return 3;
		case 8:
			return 5;
		case 9:
			return 7;
		case 10:
			return 11;
		case 11:
			return 13;
		case 12:
			return 17;
		default:
			return 19;
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
}
