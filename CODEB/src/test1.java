import java.util.Random;
import java.util.Scanner;

public class test1 {
	private boolean mbUseLetters;
	private String msTeststring;
	private int mnLength, mnWordlength;
	private String msDisplay, msSofar, msReverse;
	private String msDisplayCode, msReverseCode;
	
	public void setUseLetters(boolean value) {
		mbUseLetters = value;
	}
	
	public boolean getUseLetters() {
		return mbUseLetters;
	}
	
	public void fStart() {
		Random rnd1 = new Random();
		int nPos;
		String sText;
		
		if(mbUseLetters) {
			msTeststring="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		}
		else {
			msTeststring="0123456789";
		}
		mnLength=msTeststring.length();
		
		sText = null;
		mnWordlength = rnd1.nextInt(8)+2;
		for(int i=1;i<=mnWordlength;i++) {
			nPos = rnd1.nextInt(mnLength)+1;
			sText = sText + msTeststring.substring(nPos-1,nPos);
		}
		msDisplay = sText;
		int s,l;
		s = 4;
		l = msDisplay.length();
		msDisplay = msDisplay.substring(s, l);
		msSofar = null;
		msReverse = null;
			
		sText = null;
		for(int i=1;i<=mnWordlength;i++) {
			nPos=mnWordlength+1-i;
			sText = sText + msDisplay.substring(nPos-1,nPos);			
		}
		msReverse = sText;
		s = 4;
		l = msReverse.length();
		msReverse = msReverse.substring(s, l);
		}
	
	public void fProcess() {
		String sText;
		String sAnswer;
		
		Scanner input = new Scanner(System.in);		

		System.out.println("======================");
		System.out.println("TEST1");
		System.out.println("======================");
		sText = "DISPLAY = " + msDisplay;
		System.out.println(sText);
		System.out.println("ENTER REVERSESTRING");		
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
}
