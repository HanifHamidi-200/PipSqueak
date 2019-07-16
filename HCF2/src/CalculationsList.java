
public class CalculationsList {
	public void fDisplay() {
		System.out.println("======================");
		System.out.println("CalculationsList");
		System.out.println("======================");
		System.out.println("BOX1");
		System.out.println("d1 = MassNumber");
		System.out.println("dAnswer = 7.2264E24/d1");
		System.out.println("======================");
		System.out.println("BOX2_optional");
		System.out.println("d1 = BOX1.dAnswer");
		System.out.println("d2 = FACTOR");
		System.out.println("dAnswer = d1/d2");
		System.out.println("======================");
		System.out.println("BOX3");
		System.out.println("d1 = BOX1.dAnswer OR BOX2.dAnswer");
		System.out.println("nAnswer = d1/6.022E23");
		System.out.println("======================");
		System.out.println("BOX4");
		System.out.println("d1 = BOX3.nAnswer");
		System.out.println("dAnswer = d1*12");
		System.out.println("======================");
		System.out.println("BOX5_optional");
		System.out.println("d1 = TotalMassGiven");
		System.out.println("d2 = BOX4.dAnswer");
		System.out.println("dAnswer = d1/d2");
		System.out.println("======================");
		System.out.println("BOX6_optional");
		System.out.println("d1 = BOX4.dAnswer");
		System.out.println("d2 = BOX2.d2");
		System.out.println("d3 = BOX5.dAnswer");
		System.out.println("dAnswer = d1*d2*d3");
		System.out.println("======================");
	}
	
}
