import java.io.FileInputStream;
import java.util.Scanner;

public class searchElement {
	private String a[]=new String[200];
	private int _originalmass;
	private int _metal;
	private int _gas;
	private int mnCount1 = 900;
	private int mnCount2 = 184;
	private int mnCount3 = 31;
	private String[] ElementName1 = new String[] {"Hydrogen","Lithium","Beryllium","Boron","Sodium","Magnesium","Aluminium","Silicon","Potassium","Calcium","Scandium","Titanium","Titanium","Vanadium","Vanadium","Vanadium","Vanadium","Chromium","Chromium","Chromium","Manganese","Manganese","Manganese","Manganese","Manganese","Iron","Iron","Cobalt","Cobalt","Nickel","Nickel","Copper","Copper","Zinc","Gallium","Gallium","Germanium","Arsenic","Arsenic","Rubidium","Strontium","Yttrium","Zirconium","Niobium","Niobium","Molybdenum","Molybdenum","Molybdenum","Molybdenum","Molybdenum","Technetium","Technetium","Technetium","Technetium","Technetium","Ruthenium","Ruthenium","Ruthenium","Ruthenium","Rhodium","Rhodium","Palladium","Palladium","Silver","Cadmium","Indium","Indium","Tin","Tin","Antimony","Antimony","Tellurium","Tellurium","Tellurium","Caesium","Barium","Hafnium","Tantalum","Tantalum","Tungsten","Tungsten","Tungsten","Tungsten","Rhenium","Rhenium","Rhenium","Osmium","Osmium","Osmium","Osmium","Osmium","Iridium","Iridium","Platinum","Platinum","Gold","Gold","Mercury","Mercury","Thallium","Thallium","Lead","Lead","Bismuth","Bismuth","Polonium","Polonium","Polonium","Francium","Radium","Rutherfordium","Dubnium","Seaborgium","Bohrium","Hassium","Meitnerium","Darmstadtium","Roentgenium","Ununbium","Ununtrium","Ununquadrium","Ununpentium","Ununhexium","Lanthanum","Cerium","Cerium","Praseodymium","Neodymium","Promethium","Samarium","Samarium","Europium","Europium","Gadolinium","Terbium","Dysprosium","Holmium","Erbium","Thulium","Thulium","Ytterbium","Ytterbium","Lutetium","Actinium","Thorium","Protactinium","Protactinium","Uranium","Uranium","Uranium","Uranium","Neptunium","Neptunium","Neptunium","Neptunium","Neptunium","Plutonium","Plutonium","Plutonium","Plutonium","Plutonium","Americium","Americium","Americium","Americium","Americium","Curium","Curium","Curium","Berkelium","Berkelium","Berkelium","Californium","Californium","Californium","Einsteinium","Einsteinium","Fermium","Fermium","Mendelevium","Mendelevium","Nobelium","Nobelium","Lawrencium"};
	private String[] ElementSymbol1 = new String[] {"H","Li","Be","B","Na","Mg","Al","Si","K","Ca","Sc","Ti","Ti","V","V","V","V","Cr","Cr","Cr","Mg","Mg","Mg","Mg","Mg","Fe","Fe","Co","Co","Ni","Ni","Cu","Cu","Zn","Ga","Ga","Ge","As","As","Rb","Sr","Y","Zr","Nb","Nb","Mo","Mo","Mo","Mo","Mo","Tc","Tc","Tc","Tc","Tc","Ru","Ru","Ru","Ru","Rh","Rh","Pd","Pd","Ag","Cd","In","In","Sn","Sn","Sb","Sb","Te","Te","Te","Cs","Ba","Hf","Ta","Ta","W","W","W","W","Re","Re","Re","Os","Os","Os","Os","Os","Ir","Ir","Pt","Pt","Au","Au","Hg","Hg","Tl","Tl","Pb","Pb","Bi","Bi","Po","Po","Po","Fr","Ra","Rf","Db","Sg","Bh","Hs","Mt","Db","Rg","Uub","Uut","Uuq","Uup","Uuh","La","Ce","Ce","Pr","Nd","Pm","Sm","Sm","Eu","Eu","Gd","Tb","Dy","Ho","Er","Tm","Tm","Yb","Yb","Lu","Ac","Th","Pa","Pa","U","U","U","U","Np","Np","Np","Np","Np","Pu","Pu","Pu","Pu","Pu","Am","Am","Am","Am","Am","Cm","Cm","Cm","Bk","Bk","Bk","Cf","Cf","Cf","Es","Es","Fm","Fm","Md","Md","No","No","Lr"};
	private int[] ElementValence1 = new int[] {1,1,2,3,1,2,3,4,1,2,3,3,4,2,3,4,5,2,3,6,2,3,4,6,7,2,3,2,3,2,3,1,2,2,2,3,4,3,5,1,2,3,4,3,5,2,3,4,5,6,2,3,4,6,7,3,4,6,8,3,4,2,4,1,2,1,3,2,4,3,5,2,4,6,1,2,4,3,5,2,4,5,6,1,4,7,2,3,4,6,8,3,4,2,4,1,3,1,2,1,3,2,4,3,5,2,3,4,1,2,0,0,0,0,0,0,0,0,0,0,0,0,0,3,3,4,3,3,3,2,3,2,3,3,3,3,3,3,2,3,2,3,3,3,4,4,5,3,4,5,6,2,3,4,5,6,2,3,4,5,6,2,3,4,5,6,2,3,4,2,3,4,2,3,4,2,3,2,3,2,3,2,3,3};
	private int[] AtomicNumber1 = new int[] {1,3,4,5,11,12,13,14,19,20,21,22,22,23,23,23,23,24,24,24,25,25,25,25,25,26,26,27,27,28,28,29,29,30,31,31,32,33,33,37,38,39,40,41,41,42,42,42,42,42,43,43,43,43,43,44,44,44,44,45,45,46,46,47,48,49,49,50,50,51,51,52,52,52,55,56,72,73,73,74,74,74,74,75,75,75,76,76,76,76,76,77,77,78,78,79,79,80,80,81,81,82,82,83,83,84,84,84,87,88,104,105,106,107,108,109,110,111,112,113,114,115,116,57,58,58,59,60,61,62,62,63,63,64,65,66,67,68,69,69,70,70,71,89,90,91,91,92,92,92,92,93,93,93,93,93,94,94,94,94,94,95,95,95,95,95,96,96,96,97,97,97,98,98,98,99,99,100,100,101,101,102,102,103};
	private int[] MassNumber1 = new int[] {1,7,9,11,23,24,27,28,39,40,45,48,48,51,51,51,51,52,52,52,55,55,55,55,55,56,56,59,59,59,59,64,64,65,70,70,73,75,75,85,88,89,91,93,93,96,96,96,96,96,98,98,98,98,98,101,101,101,101,103,103,106,106,108,112,115,115,119,119,122,122,128,128,128,133,137,178,181,181,184,184,184,184,186,186,186,190,190,190,190,190,192,192,195,195,197,197,201,201,204,204,207,207,209,209,210,210,210,223,226,267,268,271,272,277,276,281,280,285,284,289,288,293,139,140,140,141,144,145,150,150,152,152,157,159,163,165,167,169,169,173,173,175,227,232,231,231,238,238,238,238,237,237,237,237,237,244,244,244,244,244,243,243,243,243,243,247,247,247,247,247,247,251,251,251,252,252,253,253,256,256,254,254,257};
	private String[] ElementName2 = new String[] {"Carbon","Carbon","Nitrogen","Nitrogen","Oxygen","Fluorine","Phosphorus","Phosphorus","Sulfur","Sulfur","Sulfur","Chlorine","Chlorine","Chlorine","Chlorine","Selenium","Selenium","Selenium","Bromine","Bromine","Bromine","Bromine","Iodine","Iodine","Iodine","Iodine","Astatine","Astatine","Astatine","Astatine","Ununseptium"};
	private String[] ElementSymbol2 = new String[] {"C","C","N","N","O","Fl","P","P","S","S","S","Cl","Cl","Cl","Cl","Se","Se","Se","Br","Br","Br","Br","I","I","I","I","At","At","At","At","Uus"};
	private int[] ElementValence2 = new int[] {2,4,3,5,2,1,3,5,2,4,6,1,3,5,7,2,4,6,1,3,5,7,1,3,5,7,1,3,5,7,0};
	private int[] AtomicNumber2 = new int[] {6,6,7,7,8,9,15,15,16,16,16,17,17,17,17,34,34,34,35,35,35,35,53,53,53,53,85,85,85,85,117};
	private int[] MassNumber2 = new int[] {12,12,14,14,16,19,31,31,32,32,32,35,35,35,35,79,79,79,80,80,80,80,127,127,127,127,210,210,210,210,0};
	private boolean[] _check = new boolean[200];
	private int mnAnswer;
	private String msSearchstring;
	
	public searchElement() {
		fGetNumbers();
	}
	
	public void fStart() {
		for(int i=1;i<=200;i++) {
			_check[i-1] = false;
		}
	}
	
	public void setAnswer(int value) {
		mnAnswer = value;
	}
	
	public int getAnswer() {
		return mnAnswer;
	}
	
	public void setSearchstring(String value) {
		msSearchstring = value;
	}
	
	public String getSearchstring() {
		return msSearchstring;
	}

	public void fCheck() {
		switch(mnAnswer) {
		case 1:
			for(int i=1;i<=mnCount2;i++) {
				if(ElementName1[i-1].trim().equals(msSearchstring.trim())) {
					_check[i-1] = true;
				}
			}
			break;
		case 2:
			for(int i=1;i<=mnCount2;i++) {
				if(ElementSymbol1[i-1].trim().equals(msSearchstring.trim())) {
					_check[i-1] = true;
				}
			}
			break;
		case 3:
			for(int i=1;i<=mnCount2;i++) {
				if(a[ElementValence1[i-1]].equals(msSearchstring.trim())) {
					_check[i-1] = true;
				}
			}
			break;
		case 4:
			for(int i=1;i<=mnCount2;i++) {
				if(a[AtomicNumber1[i-1]].equals(msSearchstring.trim())) {
					_check[i-1] = true;
				}
			}
			break;
		case 5:
			for(int i=1;i<=mnCount2;i++) {
				if(a[MassNumber1[i-1]].equals(msSearchstring.trim())) {
					_check[i-1] = true;
				}
			}
			break;
		case 6:
			for(int i=1;i<=mnCount3;i++) {
				if(ElementName2[i-1].trim().equals(msSearchstring.trim())) {
					_check[i-1] = true;
				}
			}
			break;
		case 7:
			for(int i=1;i<=mnCount3;i++) {
				if(ElementSymbol2[i-1].trim().equals(msSearchstring.trim())) {
					_check[i-1] = true;
				}
			}
			break;
		case 8:
			for(int i=1;i<=mnCount3;i++) {
				if(a[ElementValence2[i-1]].equals(msSearchstring.trim())) {
					_check[i-1] = true;
				}
			}
			break;
		case 9:
			for(int i=1;i<=mnCount3;i++) {
				if(a[AtomicNumber2[i-1]].equals(msSearchstring.trim())) {
					_check[i-1] = true;
				}
			}
			break;
		default:
			for(int i=1;i<=mnCount3;i++) {
				if(a[MassNumber2[i-1]].equals(msSearchstring.trim())) {
					_check[i-1] = true;
				}
			}
			break;
		}
	}
	
	public void fDisplay1() {
		System.out.println("======================");
		System.out.println("SEARCH");
		System.out.println("======================");
		System.out.println("[1] ElementName1");
		System.out.println("[2] ElementSymbol1");
		System.out.println("[3] ElementValence1");
		System.out.println("[4] AtomicNumber1");
		System.out.println("[5] MassNumber1");
		System.out.println("[6] ElementName2");
		System.out.println("[7] ElementSymbol2");
		System.out.println("[8] ElementValence2");
		System.out.println("[9] AtomicNumber2");
		System.out.println("[10] MassNumber2");
	}
	
	public void fDisplay2() {
		String sText;
		
		System.out.println("======================");
		System.out.println("SEARCHRESULTS");
		System.out.println("======================");
		if(mnAnswer<=5) {
			for(int i=1;i<=mnCount2;i++) {
				if(_check[i-1]) {
					sText="["+i+"] "+ElementName1[i-1]+" = "+ElementSymbol1[i-1]+" = "+ElementValence1[i-1]+" = "+AtomicNumber1[i-1]+" = "+MassNumber1[i-1];
					System.out.println(sText);					
				}
			}			
		}
		else {
			for(int i=1;i<=mnCount3;i++) {
				if(_check[i-1]) {
					sText="["+i+"] "+ElementName2[i-1]+" = "+ElementSymbol2[i-1]+" = "+ElementValence2[i-1]+" = "+AtomicNumber2[i-1]+" = "+MassNumber2[i-1];
					System.out.println(sText);					
				}
			}						
		}
	}
	
	public int fProcess() {
		int nAnswer;
		Scanner input = new Scanner(System.in);
		
		nAnswer=input.nextInt();
		
		return nAnswer;
	}
	
	private void fGetNumbers() {
		String sFilename="C:/A_OldPowersourceServer/numbers.txt";
		  try{    
	          FileInputStream fin=new FileInputStream(sFilename);    
	     	  int r=0,l=0,s=0;    
	      	 String sLine=null;
       	  while((r=fin.read())!=13){
       		 sLine=sLine+(char)r;  	        		  			
       	  }
	          for(int i=1;i<=200;i++) {
	        	  sLine=null;
	        	  while((r=fin.read())!=13){
	        		 sLine=sLine+(char)r;  	        		  			
	        	  }
	        	  l=sLine.length();
	        	  s=5;
	        	  sLine=sLine.substring(s, l);
	        	  a[i-1]=sLine;
	          }
	          fin.close();    
	        }catch(Exception e){System.out.println(e);}    
	          

			
	}

}
