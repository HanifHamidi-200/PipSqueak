import java.util.Scanner;
import java.util.Random;

public class apples {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		Random rnd1=new Random();
		tuna myname = new tuna("Hanif");
		plumbing1 mystraight = new plumbing1(rnd1.nextInt(201));
		plumbing2 mycorner = new plumbing2(rnd1.nextInt(201));
		plumbing3 mycross = new plumbing3(rnd1.nextInt(201));
		food myfood = new food(rnd1.nextInt(201));
		boiler myboiler = new boiler(rnd1.nextInt(201));
		cart mycart = new cart(rnd1.nextInt(201));
		cMenu mymenu = new cMenu();
		cMenu2 mymenu2 = new cMenu2();
		
			
		int nAnswer;
		String sReply;
		int sReply2;
		boolean bFound=false;
		cWriteFile2 _file = new cWriteFile2();
		boolean bFirst=true;
		
		myname.Saying();
		mystraight.Saying(bFirst);
		mycorner.Saying(bFirst);
		mycross.Saying(bFirst);
		myfood.Saying(bFirst);
		myboiler.Saying(bFirst);
		mycart.Saying(bFirst);
		bFirst=false;
		_file.initFile();
		
		do {
			nAnswer=mymenu.fAsk();
			switch(nAnswer) {
			case 1:
				sReply=input.nextLine();
				myname.setName(sReply);
				break;
			case 2:
				nAnswer=mymenu2.fAsk();
				switch(nAnswer) {
				case 1:
					sReply2=input.nextInt();
					mystraight.takeAmount(sReply2);
					break;
				case 2:
					sReply2=input.nextInt();
					mycorner.takeAmount(sReply2);
					break;
				case 3:
					sReply2=input.nextInt();
					mycross.takeAmount(sReply2);
				break;
				default:
					break;
				}
				break;
			case 3:
				sReply2=input.nextInt();
				myfood.takeAmount(sReply2);
			break;
			case 4:
				sReply2=input.nextInt();
				myboiler.takeAmount(sReply2);
			break;
			case 5:
				sReply2=input.nextInt();
				mycart.takeAmount(sReply2);
			break;
			case 6:
				_file.printFile();
				break;
			case 7:
				myname.Saying();
				bFirst=true;
				mystraight.Saying(bFirst);
				mycorner.Saying(bFirst);
				mycross.Saying(bFirst);
				myfood.Saying(bFirst);
				myboiler.Saying(bFirst);
				mycart.Saying(bFirst);
				bFirst=false;
				break;
			default:
				bFound=true;
				break;
			}
			} while (bFound==false);
	}
}
