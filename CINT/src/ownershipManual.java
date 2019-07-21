import java.util.Random;
import java.util.Scanner;

public class ownershipManual {
	private int[] intent1 = new int[48];
	private int[] intent2 = new int[48];
	private int[] intent3 = new int[48];
	private int[] intent4 = new int[48];
	private int[] intent5 = new int[48];
	private int[] intent6 = new int[48];
	private int[] intent7 = new int[48];
	private int[] intent8 = new int[48];
	private int[] count1 = new int[4];
	private int[] count2 = new int[4];
	private int[] count3 = new int[4];
	private int[] count4 = new int[4];
	private int[] count5 = new int[4];
	private int[] count6 = new int[4];
	private int[] count7 = new int[4];
	private int[] count8 = new int[4];
	private String[] _name = new String[8];
	
	public ownershipManual() {
		Random rnd1 = new Random();
		int nCount;
		
		for (int i=1;i<=48;i++) {
			intent1[i-1] = rnd1.nextInt(39)+1;
			intent2[i-1] = rnd1.nextInt(39)+1;
			intent3[i-1] = rnd1.nextInt(39)+1;
			intent4[i-1] = rnd1.nextInt(39)+1;
			intent5[i-1] = rnd1.nextInt(39)+1;
			intent6[i-1] = rnd1.nextInt(39)+1;
			intent7[i-1] = rnd1.nextInt(39)+1;
			intent8[i-1] = rnd1.nextInt(39)+1;
		}
		for (int i=1;i<=4;i++) {
			count1[i-1] = rnd1.nextInt(11)+1;
			count2[i-1] = rnd1.nextInt(11)+1;
			count3[i-1] = rnd1.nextInt(11)+1;
			count4[i-1] = rnd1.nextInt(11)+1;
		}
		nCount = count1[2];
		for (int i=nCount+1+24;i<=(12+24);i++) {
			intent1[i-1] = 0;
		}
		nCount = count1[3];
		for (int i=nCount+1+36;i<=(12+36);i++) {
			intent1[i-1] = 0;
		}
		nCount = count2[2];
		for (int i=nCount+1+24;i<=(12+24);i++) {
			intent2[i-1] = 0;
		}
		nCount = count2[3];
		for (int i=nCount+1+36;i<=(12+36);i++) {
			intent2[i-1] = 0;
		}
		nCount = count3[2];
		for (int i=nCount+1+24;i<=(12+24);i++) {
			intent3[i-1] = 0;
		}
		nCount = count3[3];
		for (int i=nCount+1+36;i<=(12+36);i++) {
			intent3[i-1] = 0;
		}
		nCount = count4[2];
		for (int i=nCount+1+24;i<=(12+24);i++) {
			intent4[i-1] = 0;
		}
		nCount = count4[3];
		for (int i=nCount+1+36;i<=(12+36);i++) {
			intent4[i-1] = 0;
		}
		nCount = count5[2];
		for (int i=nCount+1+24;i<=(12+24);i++) {
			intent5[i-1] = 0;
		}
		nCount = count5[3];
		for (int i=nCount+1+36;i<=(12+36);i++) {
			intent5[i-1] = 0;
		}
		nCount = count6[2];
		for (int i=nCount+1+24;i<=(12+24);i++) {
			intent6[i-1] = 0;
		}
		nCount = count6[3];
		for (int i=nCount+1+36;i<=(12+36);i++) {
			intent6[i-1] = 0;
		}
		nCount = count7[2];
		for (int i=nCount+1+24;i<=(12+24);i++) {
			intent7[i-1] = 0;
		}
		nCount = count7[3];
		for (int i=nCount+1+36;i<=(12+36);i++) {
			intent7[i-1] = 0;
		}
		nCount = count8[2];
		for (int i=nCount+1+24;i<=(12+24);i++) {
			intent8[i-1] = 0;
		}
		nCount = count8[3];
		for (int i=nCount+1+36;i<=(12+36);i++) {
			intent8[i-1] = 0;
		}
		for (int i=1;i<=8;i++) {
			_name[i-1] = null;
		}
	}
	
	private String getTitle(int nMode) {
		switch(nMode) {
		case 1:
			return "BeautifiedApparal";
		case 2:
			return "GardensRelagation";
		case 3:
			return "JobFiller";
		case 4:
			return "NecessityTransport";
		case 5:
			return "PostsRemoval";
		case 6:
			return "SimplyMoonsplits";
		case 7:
			return "StandardCourts";
		default:
			return "WarriorBarracks";
		}
	}

	void fDisplay(int nMode) {
		String sText;
		
		System.out.println("======================");
		System.out.println("OWNERSHIPMANUAL");
		sText = getTitle(nMode);
		System.out.println(sText);
		System.out.println("======================");
		System.out.println("COL1");
		for (int i=1;i<=count1[nMode-1];i++) {
			switch(nMode) {
			case 1:
				System.out.println(intent1[i-1]);
				break;
			case 2:
				System.out.println(intent2[i-1]);
				break;
			case 3:
				System.out.println(intent3[i-1]);
				break;
			case 4:
				System.out.println(intent4[i-1]);
				break;
			case 5:
				System.out.println(intent5[i-1]);
				break;
			case 6:
				System.out.println(intent6[i-1]);
				break;
			case 7:
				System.out.println(intent7[i-1]);
				break;
			default:
				System.out.println(intent8[i-1]);
				break;
			}
		}
		System.out.println("======================");
		System.out.println("COL2");
		for (int i=1;i<=count1[nMode-1];i++) {
			switch(nMode) {
			case 1:
				System.out.println(intent1[i-1+12]);
				break;
			case 2:
				System.out.println(intent2[i-1+12]);
				break;
			case 3:
				System.out.println(intent3[i-1+12]);
				break;
			case 4:
				System.out.println(intent4[i-1+12]);
				break;
			case 5:
				System.out.println(intent5[i-1+12]);
				break;
			case 6:
				System.out.println(intent6[i-1+12]);
				break;
			case 7:
				System.out.println(intent7[i-1+12]);
				break;
			default:
				System.out.println(intent8[i-1+12]);
				break;
			}
		}
		System.out.println("======================");
		System.out.println("COL3");
		for (int i=1;i<=12;i++) {
			switch(nMode) {
			case 1:
				sText = intent1[i-1+24] + "-" +intent1[i-1+36];
				System.out.println(sText);
				break;
			case 2:
				sText = intent2[i-1+24] + "-" +intent2[i-1+36];
				System.out.println(sText);
				break;
			case 3:
				sText = intent3[i-1+24] + "-" +intent3[i-1+36];
				System.out.println(sText);
				break;
			case 4:
				sText = intent4[i-1+24] + "-" +intent4[i-1+36];
				System.out.println(sText);
				break;
			case 5:
				sText = intent5[i-1+24] + "-" +intent5[i-1+36];
				System.out.println(sText);
				break;
			case 6:
				sText = intent6[i-1+24] + "-" +intent6[i-1+36];
				System.out.println(sText);
				break;
			case 7:
				sText = intent7[i-1+24] + "-" +intent7[i-1+36];
				System.out.println(sText);
				break;
			default:
				sText = intent8[i-1+24] + "-" +intent8[i-1+36];
				System.out.println(sText);
				break;
			}
		}
		System.out.println("======================");
		System.out.println("NAME = " + _name[nMode-1]);
			
	}
	
	public String fProcess(int nMode) {
		String sAnswer;
		Scanner input = new Scanner(System.in);
		
		sAnswer=input.nextLine();
		_name[nMode-1] = sAnswer;
		
		return sAnswer;
	}
}
