import java.util.Random;

public class storeCalculation {
	private int[] distances1 = new int[12];
	private int[] distances2 = new int[12];
	private int[] distances3 = new int[12];
	private int[] distances4 = new int[12];
	private int[] distances5 = new int[12];
	private int[] distances6 = new int[12];
	private int[] distances7 = new int[12];
	private int[] distances8 = new int[12];
	private int[] distances9 = new int[12];
	private int[] distances10 = new int[12];
	private int[] distances11 = new int[12];
	private int[] distances12 = new int[12];
	
	public int getDistance(int col, int row) {
		switch(col) {
		case 1:
			return distances1[row-1];
		case 2:
			return distances1[row-1];
		case 3:
			return distances1[row-1];
		case 4:
			return distances1[row-1];
		case 5:
			return distances1[row-1];
		case 6:
			return distances1[row-1];
		case 7:
			return distances1[row-1];
		case 8:
			return distances1[row-1];
		case 9:
			return distances1[row-1];
		case 10:
			return distances1[row-1];
		case 11:
			return distances1[row-1];
		default:
			return distances1[row-1];
		}
	}
	
	public void fFill() {
		Random rnd1 = new Random();
		int nStart = 1;
		
		nStart++;
		for (int i=1;i<=nStart-1;i++) {
			distances1[i-1] = 0;
		}
		for (int i=nStart;i<=12;i++) {
			distances1[i-1] = rnd1.nextInt(200);
		}
	
		nStart++;
		for (int i=1;i<=nStart-1;i++) {
			distances2[i-1] = 0;
		}
		for (int i=nStart;i<=12;i++) {
			distances2[i-1] = rnd1.nextInt(200);
		}
	
		nStart++;
		for (int i=1;i<=nStart-1;i++) {
			distances3[i-1] = 0;
		}
		for (int i=nStart;i<=12;i++) {
			distances3[i-1] = rnd1.nextInt(200);
		}
	
		nStart++;
		for (int i=1;i<=nStart-1;i++) {
			distances4[i-1] = 0;
		}
		for (int i=nStart;i<=12;i++) {
			distances4[i-1] = rnd1.nextInt(200);
		}
	
		nStart++;
		for (int i=1;i<=nStart-1;i++) {
			distances5[i-1] = 0;
		}
		for (int i=nStart;i<=12;i++) {
			distances5[i-1] = rnd1.nextInt(200);
		}
	
		nStart++;
		for (int i=1;i<=nStart-1;i++) {
			distances6[i-1] = 0;
		}
		for (int i=nStart;i<=12;i++) {
			distances6[i-1] = rnd1.nextInt(200);
		}
	
		nStart++;
		for (int i=1;i<=nStart-1;i++) {
			distances7[i-1] = 0;
		}
		for (int i=nStart;i<=12;i++) {
			distances7[i-1] = rnd1.nextInt(200);
		}
	
		nStart++;
		for (int i=1;i<=nStart-1;i++) {
			distances8[i-1] = 0;
		}
		for (int i=nStart;i<=12;i++) {
			distances8[i-1] = rnd1.nextInt(200);
		}
	
		nStart++;
		for (int i=1;i<=nStart-1;i++) {
			distances9[i-1] = 0;
		}
		for (int i=nStart;i<=12;i++) {
			distances9[i-1] = rnd1.nextInt(200);
		}
	
		nStart++;
		for (int i=1;i<=nStart-1;i++) {
			distances10[i-1] = 0;
		}
		for (int i=nStart;i<=12;i++) {
			distances10[i-1] = rnd1.nextInt(200);
		}
	
		nStart++;
		for (int i=1;i<=nStart-1;i++) {
			distances11[i-1] = 0;
		}
		for (int i=nStart;i<=12;i++) {
			distances11[i-1] = rnd1.nextInt(200);
		}
	
		nStart++;
		for (int i=1;i<=nStart-1;i++) {
			distances12[i-1] = 0;
		}
		for (int i=nStart;i<=12;i++) {
			distances12[i-1] = rnd1.nextInt(200);
		}
	
	}
	
	public void fDisplay() {
		String sText;
		
		System.out.println("======================");
		System.out.println("CALCULATION");
		System.out.println("======================");
		System.out.println("[A][B][C][D][E][F][G][H][I][J][K][L]");
		sText = "A = ";
		for (int i=1;i<=12;i++) {
			sText = sText + distances1[i-1] + "-";
		}
		System.out.println(sText);
		sText = "B = ";
		for (int i=1;i<=12;i++) {
			sText = sText + distances2[i-1] + "-";
		}
		System.out.println(sText);
		sText = "C = ";
		for (int i=1;i<=12;i++) {
			sText = sText + distances3[i-1] + "-";
		}
		System.out.println(sText);
		sText = "D = ";
		for (int i=1;i<=12;i++) {
			sText = sText + distances4[i-1] + "-";
		}
		System.out.println(sText);
		sText = "E = ";
		for (int i=1;i<=12;i++) {
			sText = sText + distances5[i-1] + "-";
		}
		System.out.println(sText);
		sText = "F = ";
		for (int i=1;i<=12;i++) {
			sText = sText + distances6[i-1] + "-";
		}
		System.out.println(sText);
		sText = "G = ";
		for (int i=1;i<=12;i++) {
			sText = sText + distances7[i-1] + "-";
		}
		System.out.println(sText);
		sText = "H = ";
		for (int i=1;i<=12;i++) {
			sText = sText + distances8[i-1] + "-";
		}
		System.out.println(sText);
		sText = "I = ";
		for (int i=1;i<=12;i++) {
			sText = sText + distances9[i-1] + "-";
		}
		System.out.println(sText);
		sText = "J = ";
		for (int i=1;i<=12;i++) {
			sText = sText + distances10[i-1] + "-";
		}
		System.out.println(sText);
		sText = "K = ";
		for (int i=1;i<=12;i++) {
			sText = sText + distances11[i-1] + "-";
		}
		System.out.println(sText);
		sText = "L = ";
		for (int i=1;i<=12;i++) {
			sText = sText + distances12[i-1] + "-";
		}
		System.out.println(sText);
		System.out.println("======================");
		
	}
}
