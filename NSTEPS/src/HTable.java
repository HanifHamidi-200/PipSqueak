import java.util.Random;
import java.util.Scanner;

public class HTable {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		Random rnd1=new Random();
		storeName myname = new storeName("Hanif");
		classMENU mymenu = new classMENU();
		
		storeCalculation mycalculation = new storeCalculation();
		int[] distances1 = new int[12];
		int[] distances2 = new int[12];
		int[] distances3 = new int[12];
		int[] distances4 = new int[12];
		int[] distances5 = new int[12];
		int[] distances6 = new int[12];
		int[] distances7 = new int[12];
		int[] distances8 = new int[12];
		int[] distances9 = new int[12];
		int[] distances10 = new int[12];
		int[] distances11 = new int[12];
		int[] distances12 = new int[12];
		
		storePick mypick = new storePick();
		
		int nAnswer;
		boolean bFound = false;
		String sAnswer;
		
		myname.Saying();
		mycalculation.fFill();
		mycalculation.fDisplay();
		
		for (int i=1;i<=12;i++) {
			distances1[i-1] = mycalculation.getDistance(1, i);
			distances2[i-1] = mycalculation.getDistance(2, i);
			distances3[i-1] = mycalculation.getDistance(3, i);
			distances4[i-1] = mycalculation.getDistance(4, i);
			distances5[i-1] = mycalculation.getDistance(5, i);
			distances6[i-1] = mycalculation.getDistance(6, i);
			distances7[i-1] = mycalculation.getDistance(7, i);
			distances8[i-1] = mycalculation.getDistance(8, i);
			distances9[i-1] = mycalculation.getDistance(9, i);
			distances10[i-1] = mycalculation.getDistance(10, i);
			distances11[i-1] = mycalculation.getDistance(11, i);
			distances12[i-1] = mycalculation.getDistance(12, i);
		}
		
		for (int i=1;i<=12;i++) {
			mypick.setDistance(1, i, distances1[i-1]);
			mypick.setDistance(2, i, distances2[i-1]);
			mypick.setDistance(3, i, distances3[i-1]);
			mypick.setDistance(4, i, distances4[i-1]);
			mypick.setDistance(5, i, distances5[i-1]);
			mypick.setDistance(6, i, distances6[i-1]);
			mypick.setDistance(7, i, distances7[i-1]);
			mypick.setDistance(8, i, distances8[i-1]);
			mypick.setDistance(9, i, distances9[i-1]);
			mypick.setDistance(10, i, distances10[i-1]);
			mypick.setDistance(11, i, distances11[i-1]);
			mypick.setDistance(12, i, distances12[i-1]);
		}
		mypick.fStart();
		mypick.fDisplay();
	}
}
