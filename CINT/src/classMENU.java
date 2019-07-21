import java.util.Scanner;

public class classMENU {
	
	public void fDisplay() {
		System.out.println("======================");
		System.out.println("MainMenu");
		System.out.println("======================");
		System.out.println("[1] BeautifiedApparal");
		System.out.println("[2] GardensRelagation");
		System.out.println("[3] JobFiller");
		System.out.println("[4] NecessityTransport");
		System.out.println("[5] PostsRemoval");
		System.out.println("[6] SimplyMoonsplits");
		System.out.println("[7] StandardCourts");
		System.out.println("[8] WarriorBarracks");
		System.out.println("[9] EXIT");
		System.out.println("======================");
	}
	
	public int fProcess() {
		int nAnswer;
		Scanner input = new Scanner(System.in);
		
		nAnswer=input.nextInt();
		
		return nAnswer;
	}
}