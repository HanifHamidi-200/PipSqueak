import java.util.Random;

public class process1 {
	private int _1VaseH;
	private int _CWSHEP;
	private int _ConstM;
	private int _EDEAL;
	private int _CWOOL;

	public void fStart() {
		Random rnd1 = new Random();
		int nThrow;
		
		_1VaseH = rnd1.nextInt(39)+1;
		_CWSHEP = rnd1.nextInt(39)+1;
		_ConstM = rnd1.nextInt(39)+1;
		nThrow = rnd1.nextInt(10);
		if(nThrow<=5) {
			_EDEAL = rnd1.nextInt(39)+1;			
		}
		else {
			_EDEAL = 0;
		}
		nThrow = rnd1.nextInt(10);
		if(nThrow<=5) {
			_CWOOL = rnd1.nextInt(39)+1;			
		}
		else {
			_CWOOL = 0;
		}
	}
	
	public int get1() {
		return _1VaseH;
	}
	public int get2() {
		return _CWSHEP;
	}
	public int get3() {
		return _ConstM;
	}
	public int get4() {
		return _EDEAL;
	}
	public int get5() {
		return _CWOOL;
	}
}
