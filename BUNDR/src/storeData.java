
public class storeData {
	private boolean[] senta1 = new boolean[10];
	private boolean[] senta2 = new boolean[10];
	private boolean[] senta3 = new boolean[10];
	private boolean[] senta4 = new boolean[10];
	private boolean[] senta5 = new boolean[10];
	private boolean[] sentb1 = new boolean[10];
	private boolean[] sentb2 = new boolean[10];
	private boolean[] sentb3 = new boolean[10];
	private boolean[] sentb4 = new boolean[10];
	private boolean[] sentb5 = new boolean[10];
	private boolean[] sentc1 = new boolean[10];
	private boolean[] sentc2 = new boolean[10];
	private boolean[] sentc3 = new boolean[10];
	private boolean[] sentc4 = new boolean[10];
	private boolean[] sentc5 = new boolean[10];
	private String[] pFIBON1 = new String[10];
	private String[] pFIBON2 = new String[10];
	private String[] pFIBON3 = new String[10];
	private String[] pFIBON4 = new String[10];
	private String[] pFIBON5 = new String[10];
	private String[] pDIJKSR1 = new String[10];
	private String[] pDIJKSR2 = new String[10];
	private String[] pDIJKSR3 = new String[10];
	private String[] pDIJKSR4 = new String[10];
	private String[] pDIJKSR5 = new String[10];
	private String[] llast1 = new String[10];
	private String[] llast2 = new String[10];
	private String[] llast3 = new String[10];
	private String[] llast4 = new String[10];
	private String[] llast5 = new String[10];
	
	public void fReset() {
		for(int i=1;i<=10;i++) {
			senta1[i-1] = false;
			senta2[i-1] = false;
			senta3[i-1] = false;
			senta4[i-1] = false;
			senta5[i-1] = false;
		}
		for(int i=1;i<=10;i++) {
			sentb1[i-1] = false;
			sentb2[i-1] = false;
			sentb3[i-1] = false;
			sentb4[i-1] = false;
			sentb5[i-1] = false;
		}
		for(int i=1;i<=10;i++) {
			sentc1[i-1] = false;
			sentc2[i-1] = false;
			sentc3[i-1] = false;
			sentc4[i-1] = false;
			sentc5[i-1] = false;
		}
		for(int i=1;i<=10;i++) {
			pFIBON1[i-1] = null;
			pFIBON2[i-1] = null;
			pFIBON3[i-1] = null;
			pFIBON4[i-1] = null;
			pFIBON5[i-1] = null;
		}
		for(int i=1;i<=10;i++) {
			pDIJKSR1[i-1] = null;
			pDIJKSR2[i-1] = null;
			pDIJKSR3[i-1] = null;
			pDIJKSR4[i-1] = null;
			pDIJKSR5[i-1] = null;
		}
		for(int i=1;i<=10;i++) {
			llast1[i-1] = null;
			llast2[i-1] = null;
			llast3[i-1] = null;
			llast4[i-1] = null;
			llast5[i-1] = null;
		}
	}	

	public void setSenta(int col,int row, boolean value) {
		switch(col) {
		case 1:
			senta1[row-1] = value;
			break;
		case 2:
			senta2[row-1] = value;
			break;
		case 3:
			senta3[row-1] = value;
			break;
		case 4:
			senta4[row-1] = value;
			break;
		default:
			senta5[row-1] = value;
			break;
		}
	}
	public void setSentb(int col,int row, boolean value) {
		switch(col) {
		case 1:
			sentb1[row-1] = value;
			break;
		case 2:
			sentb2[row-1] = value;
			break;
		case 3:
			sentb3[row-1] = value;
			break;
		case 4:
			sentb4[row-1] = value;
			break;
		default:
			sentb5[row-1] = value;
			break;
		}
	}
	public void setSentc(int col,int row, boolean value) {
		switch(col) {
		case 1:
			sentc1[row-1] = value;
			break;
		case 2:
			sentc2[row-1] = value;
			break;
		case 3:
			sentc3[row-1] = value;
			break;
		case 4:
			sentc4[row-1] = value;
			break;
		default:
			sentc5[row-1] = value;
			break;
		}
	}
	
	public boolean getSenta(int col,int row) {
		switch(col) {
		case 1:
			return senta1[row-1];
		case 2:
			return senta2[row-1];
		case 3:
			return senta3[row-1];
		case 4:
			return senta4[row-1];
		default:
			return senta5[row-1];
		}
	}
	public boolean getSentb(int col,int row) {
		switch(col) {
		case 1:
			return sentb1[row-1];
		case 2:
			return sentb2[row-1];
		case 3:
			return sentb3[row-1];
		case 4:
			return sentb4[row-1];
		default:
			return sentb5[row-1];
		}
	}
	public boolean getSentc(int col,int row) {
		switch(col) {
		case 1:
			return sentc1[row-1];
		case 2:
			return sentc2[row-1];
		case 3:
			return sentc3[row-1];
		case 4:
			return sentc4[row-1];
		default:
			return sentc5[row-1];
		}
	}
	
	public void setpFIBON(int col,int row, String value) {
		switch(col) {
		case 1:
			pFIBON1[row-1] = value;
			break;
		case 2:
			pFIBON2[row-1] = value;
			break;
		case 3:
			pFIBON3[row-1] = value;
			break;
		case 4:
			pFIBON4[row-1] = value;
			break;
		default:
			pFIBON5[row-1] = value;
			break;
		}
	}
	public void setpDIJKSR(int col,int row, String value) {
		switch(col) {
		case 1:
			pDIJKSR1[row-1] = value;
			break;
		case 2:
			pDIJKSR2[row-1] = value;
			break;
		case 3:
			pDIJKSR3[row-1] = value;
			break;
		case 4:
			pDIJKSR4[row-1] = value;
			break;
		default:
			pDIJKSR5[row-1] = value;
			break;
		}
	}
	public void setllast(int col,int row, String value) {
		switch(col) {
		case 1:
			llast1[row-1] = value;
			break;
		case 2:
			llast2[row-1] = value;
			break;
		case 3:
			llast3[row-1] = value;
			break;
		case 4:
			llast4[row-1] = value;
			break;
		default:
			llast5[row-1] = value;
			break;
		}
	}

	public String getpFIBON(int col,int row) {
		switch(col) {
		case 1:
			return pFIBON1[row-1];
		case 2:
			return pFIBON2[row-1];
		case 3:
			return pFIBON3[row-1];
		case 4:
			return pFIBON4[row-1];
		default:
			return pFIBON5[row-1];
		}
	}
	public String getpDJIKSR(int col,int row) {
		switch(col) {
		case 1:
			return pDIJKSR1[row-1];
		case 2:
			return pDIJKSR2[row-1];
		case 3:
			return pDIJKSR3[row-1];
		case 4:
			return pDIJKSR4[row-1];
		default:
			return pDIJKSR5[row-1];
		}
	}
	public String getllast(int col,int row) {
		switch(col) {
		case 1:
			return llast1[row-1];
		case 2:
			return llast2[row-1];
		case 3:
			return llast3[row-1];
		case 4:
			return llast4[row-1];
		default:
			return llast5[row-1];
		}
	}
}
