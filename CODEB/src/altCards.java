import java.util.Random;

public class altCards {
	private String a[]=new String[200];
	private String[] _data = new String[] {"AS","2S","3S","4S","5S","6S","7S","8S","9S","10S","JS","QS","KS","AC","2C","3C","4C","5C","6C","7C","8C","9C","10C","JC","QC","KC","AD","2D","3D","4D","5D","6D","7D","8D","9D","10D","JD","QD","KD","AH","2H","3H","4H","5H","6H","7H","8H","9H","10H","JH","QH","KH"};
	private boolean[] _used = new boolean[52];
	private int mnHands;
	
	public void fStart() {
		Random rnd1 = new Random();
		boolean bFound = false;
		int nPos, nTimes, nCount;
		String sText;
		
		for(int i=1;i<=52;i++) {
			_used[i-1] = false;
		}
		mnHands = 0;
		
		do {
			mnHands++;
			nTimes = rnd1.nextInt(8)+2;
			sText = "HAND" + mnHands + " ";
			for(int i=1;i<=nTimes;i++) {
				nPos = rnd1.nextInt(25)+1;
				if(_used[nPos-1]==false) {
					sText = sText + _data[nPos-1];
					_used[nPos-1] = true;
				}				
				else {
					nPos = fNext(nPos);
					sText = sText + _data[nPos-1];
					_used[nPos-1] = true;					
				}
			}
			System.out.println(sText);
			nCount = fCount();
			if(nCount<=9) {
				bFound = true;
			}
		}while (bFound==false);

		System.out.println("======================");
		System.out.println("LEFT");
		for(int i=1;i<=52;i++) {
			if(_used[i-1]==false) {
				System.out.println(_data[i-1]);
			}
		}
	}
	
	private int fCount() {
		int nCount = 0;
		
		for(int i=1;i<=52;i++) {
			if(_used[i-1]==false) {
				nCount++;
			}
		}
		
		return nCount;
	}
	
	private int fNext(int value) {
		boolean bFound = false;
		int i=0;
		
		do {
			i++;
			value++;
			if(value==53) {
				value = 1;
			}
			if(_used[value-1]==false) {
				return value;
			}
			if(i>52) {
				bFound = true;
			}
		} while (bFound==false);
		
		return 0;
	}
}
