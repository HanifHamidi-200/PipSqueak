import java.util.Scanner;

class apples {

	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		tuna myname = new tuna("Hanif");
		soap mydate = new soap("Fri 3/15/19");
		water myweather = new water("rainy");
		bathroom myscore = new bathroom();
		cMenu mymenu = new cMenu();
		int nAnswer;
		String sReply;
		boolean bFound=false;
		
		myname.Saying();
		mydate.Saying();
		myweather.Saying();
		myscore.fPerform();
		
		do {
		nAnswer=mymenu.fAsk();
		switch(nAnswer) {
		case 1:
			sReply=input.nextLine();
			myname.setName(sReply);
			break;
		case 2:
			sReply=input.nextLine();
			mydate.setDate(sReply);
			break;
		case 3:
			sReply=input.nextLine();
			myweather.setWeather(sReply);
			break;
		case 4:
			myscore.fPerform();
			break;
		case 5:
			myname.Saying();
			mydate.Saying();
			myweather.Saying();
			break;
		default:
			bFound=true;
			break;
		}
		} while (bFound==false);
	}
}
