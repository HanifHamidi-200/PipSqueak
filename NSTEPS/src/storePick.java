import java.util.Random;

public class storePick {
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
	private int firstPick;
	private int[] otherPicks = new int[12];
	private String firstText;
	private String[] otherTexts = new String[12];

	private int fValue(int col, int row) {
		int nSave1 = col;
		int nSave2 = row;
		
		if (col>row) {
			col = row;
			row = nSave1;
			System.out.println(col + "SWAP" + row);
		}
		else {
			System.out.println(col + "MEETS" + row);			
		}
		
		switch(col) {
		case 1:
			return distances1[row-1];
		case 2:
			return distances2[row-1];
		case 3:
			return distances3[row-1];
		case 4:
			return distances4[row-1];
		case 5:
			return distances5[row-1];
		case 6:
			return distances6[row-1];
		case 7:
			return distances7[row-1];
		case 8:
			return distances8[row-1];
		case 9:
			return distances9[row-1];
		case 10:
			return distances10[row-1];
		case 11:
			return distances11[row-1];
		default:
			return distances12[row-1];
		}
	}
	
	public void setDistance(int col, int row, int value) {
		switch(col) {
		case 1:
			distances1[row-1] = value;
			break;
		case 2:
			distances2[row-1] = value;
			break;
		case 3:
			distances3[row-1] = value;
			break;
		case 4:
			distances4[row-1] = value;
			break;
		case 5:
			distances5[row-1] = value;
			break;
		case 6:
			distances6[row-1] = value;
			break;
		case 7:
			distances7[row-1] = value;
			break;
		case 8:
			distances8[row-1] = value;
			break;
		case 9:
			distances9[row-1] = value;
			break;
		case 10:
			distances10[row-1] = value;
			break;
		case 11:
			distances11[row-1] = value;
			break;
		default:
			distances12[row-1] = value;
			break;
		}
	}
	
	private String fLetter(int pos) {
		switch(pos) {
		case 1:
			return "A";
		case 2:
			return "B";
		case 3:
			return "C";
		case 4:
			return "D";
		case 5:
			return "E";
		case 6:
			return "F";
		case 7:
			return "G";
		case 8:
			return "H";
		case 9:
			return "I";
		case 10:
			return "J";
		case 11:
			return "K";
		default:
			return "L";
		}
	}
	
	private int fRandom(int nNot) {
		Random rnd1 = new Random();
		boolean bFound = false;
		int nNumber;
		
		do {
			nNumber = rnd1.nextInt(11)+1;
			if (nNumber!=nNot) {
				bFound = true;
			}
		}while (!bFound);
		return nNumber;
	}
	private int fRandom2(int nNot1, int nNot2) {
		Random rnd1 = new Random();
		boolean bFound = false;
		int nNumber;
		
		do {
			nNumber = rnd1.nextInt(11)+1;
			if (nNumber!=nNot1 && nNumber!=nNot2) {
				bFound = true;
			}
		}while (!bFound);
		return nNumber;
	}
	
	public void fStart() {
		Random rnd1 = new Random();
		int nFrom, nTo, nMiddle;
		
		nFrom = rnd1.nextInt(11)+1;
		nTo = fRandom(nFrom);
		firstText = fLetter(nFrom) + fLetter(nTo);
		firstPick = fValue(nFrom, nTo);
		System.out.printf("%s = %s = %s\n", nFrom, nTo, firstPick);
		
		nMiddle = fRandom2(nFrom, nTo);			
		for (int i=1;i<=12;i++) {
			otherTexts[i-1] = fLetter(nFrom) + fLetter(i) + fLetter(i) + fLetter(nTo);
			otherPicks[i-1] = fValue(nFrom, i) + fValue(i, nTo);
			System.out.printf("%s = %s = %s = %s\n", nFrom, i, nTo, otherPicks[i-1]);
		}
	}
	
	public void fDisplay() {
	String sText;
		
		System.out.println("======================");
		System.out.println("THEPICKS");
		System.out.println("======================");
		sText = "Firstpick = " + firstText + " = " + firstPick; 
		System.out.println(sText);
		System.out.println("======================");
		for (int i=1;i<=12;i++) {
			sText = "Pick" + i + " = " + otherTexts[i-1] + " = " + otherPicks[i-1];
			System.out.println(sText);
		}
		System.out.println("======================");
	}
}
