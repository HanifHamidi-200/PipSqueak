import java.util.Scanner;

public class cMenu {
	public int fAsk() {
		System.out.println("[1] WMBPlantation");
		System.out.println("[2] SurfaceLayers_congeneity");
		System.out.println("[3] Lombardy_placings");
		System.out.println("[4] Exit");
		
		int nAnswer;
		Scanner input = new Scanner(System.in);
		
		nAnswer=input.nextInt();
		return nAnswer;
		
		
	}
}
