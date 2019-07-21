
public class classINVENTORY {
	private int[] farshelf = new int[5];
	private int[] doorway1 = new int[5];
	private int[] doorway2 = new int[5];
	private int[] backhutch = new int[5];

	public void setAll(int nMode, int value1, int value2, int value3, int value4, int value5) {
		switch(nMode) {
		case 1:
			farshelf[0] = value1;
			farshelf[1] = value2;
			farshelf[2] = value3;
			farshelf[3] = value4;
			farshelf[4] = value5;
		case 2:
			doorway1[0] = value1;
			doorway1[1] = value2;
			doorway1[2] = value3;
			doorway1[3] = value4;
			doorway1[4] = value5;
		case 3:
			doorway2[0] = value1;
			doorway2[1] = value2;
			doorway2[2] = value3;
			doorway2[3] = value4;
			doorway2[4] = value5;
		default:
			backhutch[0] = value1;
			backhutch[1] = value2;
			backhutch[2] = value3;
			backhutch[3] = value4;
			backhutch[4] = value5;
			break;
		}
	}
	
	public void fDisplay() {
		String sText;
		int i = 0;
		
		System.out.println("======================");
		System.out.println("MainMenu");
		System.out.println("======================");
		System.out.println("Farshelf");
		sText = "[1] 1VaseH = " + farshelf[0];
		System.out.println(sText);
		sText = "[2] CWSHEP = " + farshelf[1];
		System.out.println(sText);
		sText = "[3] ConstM = " + farshelf[2];
		System.out.println(sText);
		sText = "[4] EDEAL = " + farshelf[3];
		System.out.println(sText);
		sText = "[5] CWOOL = " + farshelf[4];
		System.out.println(sText);
		System.out.println("======================");
		System.out.println("Doorway1");
		sText = "[1] 1VaseH = " + doorway1[0];
		System.out.println(sText);
		sText = "[2] CWSHEP = " + doorway1[1];
		System.out.println(sText);
		sText = "[3] ConstM = " + doorway1[2];
		System.out.println(sText);
		sText = "[4] EDEAL = " + doorway1[3];
		System.out.println(sText);
		sText = "[5] CWOOL = " + doorway1[4];
		System.out.println(sText);
		System.out.println("======================");
		System.out.println("Doorway2");
		sText = "[1] 1VaseH = " + doorway2[0];
		System.out.println(sText);
		sText = "[2] CWSHEP = " + doorway2[1];
		System.out.println(sText);
		sText = "[3] ConstM = " + doorway2[2];
		System.out.println(sText);
		sText = "[4] EDEAL = " + doorway2[3];
		System.out.println(sText);
		sText = "[5] CWOOL = " + doorway2[4];
		System.out.println(sText);
		System.out.println("======================");
		System.out.println("Backhutch");
		sText = "[1] 1VaseH = " + backhutch[0];
		System.out.println(sText);
		sText = "[2] CWSHEP = " + backhutch[1];
		System.out.println(sText);
		sText = "[3] ConstM = " + backhutch[2];
		System.out.println(sText);
		sText = "[4] EDEAL = " + backhutch[3];
		System.out.println(sText);
		sText = "[5] CWOOL = " + backhutch[4];
		System.out.println(sText);
		System.out.println("======================");
	}
}
