
public class classRUN {
	private int[] _prediction = new int[12];
	private double[] mnG = new double[12];
	private double[] mnB = new double[12];
	private int mnGirls;
	private int mnBoys;
	
	public void setGirls(int value) {
		mnGirls = value;
	}
	
	public void setBoys(int value) {
		mnBoys = value;
	}

	public void setPrediction(int col, int value) {
		_prediction[col-1] = value;
	}
	
	public void fStart() {
		for(int i=1;i<=12;i++) {
			mnG[i-1] = 0;
			mnB[i-1] = 0;
		}
		fCalculate();
	}
	
	private void fCalculate() {
		int nA = mnGirls;
		int nB = mnBoys;
		double calc1, calc2, calc3, calc4;
		
		for(int i=1;i<=12;i++) {
			calc1 = (110 * nB)/100;
			calc2 = calc1 + nA;
			calc3 = _prediction[i-1]/calc2;
			mnG[i-1] = calc3;
			calc4 = (110 * mnG[i-1])/100;
			mnB[i-1] = calc4;
		}
	}
	
	public void fDisplay() {
		String sText;
		
		System.out.println("======================");
		System.out.println("RUN");
		System.out.println("======================");
		for(int i=1;i<=12;i++) {
			sText = "[" + i + "] T=" + _prediction[i-1] + " g=" + mnG[i-1] + " b=" + mnB[i-1];
			System.out.println(sText);			
		}
		System.out.println("======================");
	
	}
}
