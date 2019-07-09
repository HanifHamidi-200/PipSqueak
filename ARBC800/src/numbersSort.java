public class numbersSort {
	private int numbers[] = new int[10];
	private int numbers2[] = new int[10];
	private boolean taken[] = new boolean[10];
	
	public void fSetNumbers(int nPos,int value) {
		numbers[nPos] = value;
		numbers2[nPos] = 0;
		taken[nPos] = false;
	}
	
	public int fGetNumbers(int nPos) {
		return numbers2[nPos];
	}
	
	private int fNext() {
		int nSmallest=1000;
		int nLevel=0;
		
		for(int i=1;i<=10;i++) {
			if(taken[i-1]==false) {
				if (numbers[i-1]<nSmallest) {
					nSmallest=numbers[i-1];
					nLevel=i;
				}				
			}
		}
		
		taken[nLevel-1] = true;
		return nLevel;
	}
	
	private boolean fLeft() {
		boolean bFound = false;
		
		for(int i=1;i<=10;i++) {
			if(taken[i-1]==false) {
				bFound = true;
			}
		}
		
		return bFound;
	}
	
	public void fPalindrome() {
		int nPos;
		boolean bFound = false;
		
		for(int i=1;i<=10;i++){
			nPos=fNext();
			numbers2[i-1] = numbers[nPos-1];
			bFound = fLeft();
		}
	}
}