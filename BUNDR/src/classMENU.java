import java.util.Scanner;

public class classMENU {
	private int _mode1, _mode2;
	
	public void setMode1(int value) {
		_mode1 = value;
	}
	
	public int getMode1() {
		return _mode1;
	}
	
	public void setMode2(int value) {
		_mode2 = value;
	}
	
	public int getMode2() {
		return _mode2;
	}

	private String getText1(){
		switch(_mode1) {
		case 1:
			return "ByhandToAuto";
		case 2:
			return "NicosiaAndamanSea";
		case 3:
			return "ECPLN";
		case 4:
			return "Negotiations";
		case 5:
			return "TradeConstruction";
		default:
			return null;
		}
	}
	
	private String getText2(){
		switch(_mode2) {
		case 1:
			return "[1] if the growthapp is at 4.9% what is the resultant TaxFacility\n 4yearsafter (2023)";
		case 2:
			return "[2] if ASituation becomes the Locksmith howmuch is charged for each\n DeservingCapita";
		case 3:
			return "[3] if BBUOY is installed Temporarily what is the CostReserve of\n installing it Permanently";
		case 4:
			return "[4] if FischerForest is being PDEFP howmuch doesthis comparewith the\n Piechart thatis BeachSuccess";
		case 5:
			return "[5] if newGeogianWalls havebeen putonhold howlong until completion of\n PMIEMBuildings suchthat newGeorgianWalls canthenbe resumed";
		case 6:
			return "[6] if CountryRank#53 asksfor money from the IMF howlong until itcan\n RepayItBack";
		case 7:
			return "[7] if all NWOil is productionoutput continuously what isthe effective\n RateUptake ofthe OilCountries responsible";
		case 8:
			return "[8] if CommonAnimalEscalation is investigated whatis the PopularityVote\n concerning ThisDemise";
		case 9:
			return "[9] if SportAvailablity isincreased byhowmuch doesthis affect\n LifeSatisfactionRatings";
		case 10:
			return "[10] if TrojanStorageDepot resumes its outcrop howlong until itneedstobe\n refilled";
		default:
			return null;
		}
	}
	
	public void fDisplay() {
		String sText;
		
		System.out.println("======================");
		System.out.println("MainMenu");
		System.out.println(getText1());
		System.out.println(getText2());
		System.out.println("======================");
		System.out.println("[1] ChangeMode");
		System.out.println("[2] ChangeEquation");
		System.out.println("[3] RANDOMOption");
		System.out.println("[4] AttachSentiment (1)");
		System.out.println("[5] AttachSentiment (2)");
		System.out.println("[6] AttachSentiment (3)");
		System.out.println("[7] InvestigatePermutations (FIBON)");
		System.out.println("[8] InvestigatePermutations (DJIKSR)");
		System.out.println("[9] Own_RDIntel");
		System.out.println("[10] EXIT");
		System.out.println("======================");
	}
	
	public int fProcess() {
		int nAnswer;
		Scanner input = new Scanner(System.in);
		
		nAnswer=input.nextInt();
		
		return nAnswer;
	}
}

