import java.util.Scanner;

public class testStart {
private int _factor;
private boolean _down;	
private int[] _wrongs = new int[12];

	public void fReset() {
		for(int i=1;i<=12;i++) {
			_wrongs[i-1] = 0;
		}
	}
	
	public void setFactor(int value) {
		_factor = value;		
	}
	
	public int getFacotor() {
		return _factor;
	}

	public void setDown(boolean value) {
		_down = value;
	}
	
	public boolean getDown() {
		return _down;
	}
	
	public void fStart() {
		int a,b;
		int nAnswer;
			
		Scanner input = new Scanner(System.in);
		
		System.out.println("======================");
		System.out.println("StartTest");
		System.out.println("======================");
		for(int i=1;i<=12;i++) {
			if(_down) {
				a = i;
				b = _factor;
			}
			else {
				a = _factor;
				b = i;
			}
			System.out.printf("[%sx%s] ",a,b);
			nAnswer = input.nextInt();
			if(nAnswer!=(a*b)) {
				_wrongs[i-1] = nAnswer;
			}
		}
	}
	
	public void fWronglist() {
		int nCount = 0;
		int a, b;
		
		System.out.println("======================");
		System.out.println("Wronglist");
		System.out.println("======================");
		for(int i=1;i<=12;i++) {
			if(_wrongs[i-1]!=0) {
				nCount++;
				if(_down) {
					a = i;
					b = _factor;
				}
				else {
					a = _factor;
					b = i;
				}
				System.out.printf("%sx%s\n",a,b);
				System.out.printf("NOT %s\n",_wrongs[i-1]);
				System.out.printf("BUT %s\n",a*b);				
			}
		}
		System.out.println("Count = " + nCount);
	}
}
