import java.util.Scanner;

public class selectPrediction {
	private int[] _col1 = new int[12];
	private int[] _col2 = new int[12];
	private int[] _col3 = new int[12];
	private int[] _col4 = new int[12];
	private int[] _col5 = new int[12];
	private int[] _col6 = new int[12];
	private int[] _col7 = new int[12];
	private int[] _col8 = new int[12];
	private int[] _col9 = new int[12];
	private int[] _col10 = new int[12];
	private int[] _col11 = new int[12];
	private int[] _col12 = new int[12];
	private int[] _prediction = new int[12];

	public int getPrediction(int col) {
		return _prediction[col-1];
	}
	
	public void fSetValue(int nCol, int nRow, int value) {
		switch(nCol) {
		case 1:
			_col1[nRow-1] = value;
			break;
		case 2:
			_col2[nRow-1] = value;
			break;
		case 3:
			_col3[nRow-1] = value;
			break;
		case 4:
			_col4[nRow-1] = value;
			break;
		case 5:
			_col5[nRow-1] = value;
			break;
		case 6:
			_col6[nRow-1] = value;
			break;
		case 7:
			_col7[nRow-1] = value;
			break;
		case 8:
			_col8[nRow-1] = value;
			break;
		case 9:
			_col9[nRow-1] = value;
			break;
		case 10:
			_col10[nRow-1] = value;
			break;
		case 11:
			_col11[nRow-1] = value;
			break;
		default:
			_col12[nRow-1] = value;
			break;
		}
	}
	
	private int fValue(int col, int row) {
		switch(col) {
		case 1:
			return _col1[row-1]; 
		case 2:
			return _col2[row-1]; 
		case 3:
			return _col3[row-1]; 
		case 4:
			return _col4[row-1]; 
		case 5:
			return _col5[row-1]; 
		case 6:
			return _col6[row-1]; 
		case 7:
			return _col7[row-1]; 
		case 8:
			return _col8[row-1]; 
		case 9:
			return _col9[row-1]; 
		case 10:
			return _col10[row-1]; 
		case 11:
			return _col11[row-1]; 
		default:
			return _col12[row-1]; 
		}
	}

	public void fProcess() {
		int nAnswer;
		String sText;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("======================");
		System.out.println("Predictions");
		System.out.println("======================");

		for(int i=1;i<=12;i++) {
			sText="ENTER_" + i + " ";
			System.out.printf(sText);
			nAnswer=input.nextInt();
			_prediction[i-1] = nAnswer;
		}
	
		System.out.println("======================");
		System.out.println("MATRIX_PREDICTIONS");
		System.out.println("======================");
		for(int i=1;i<=12;i++) {
			sText = "[" + i + "] ";
			for(int j=1;j<=12;j++) {
				sText = sText + fValue(i, j) + "-";
			}
			sText = sText + "  " + _prediction[i-1];
			System.out.println(sText);
		}
		System.out.println("======================");
	}
}
