import java.util.Scanner;

public class bathroom {
	public void fPerform() {
		Scanner input = new Scanner(System.in);
		int total = 0;
		int grade;
		int average;
		int counter = 0;
			
		System.out.println("Enter scores10");
		
		while (counter < 10) {
			grade = input.nextInt();
			total = total + grade;
			counter++;
		}
		
		average=total/10;
		
		System.out.printf("Your average is %s\n", average);

	}
}
