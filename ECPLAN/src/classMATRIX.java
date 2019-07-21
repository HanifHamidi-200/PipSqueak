import java.util.Random;

public class classMATRIX {
	private int[] _col1 = new int[12];
	private int[] _col2 = new int[12];
	private int[] _col3 = new int[12];
	private int[] _col4 = new int[12];
	private int[] _col5 = new int[12];
	private int[] _col6 = new int[12];
	private int[] _col7 = new int[12];
	private int[] _col8 = new int[12];
	private int[] _col9 = new int[12];
	private int[] _col10 = new int[12];
	private int[] _col11 = new int[12];
	private int[] _col12 = new int[12];
	private int[] _realcol1 = new int[12];
	private int[] _realcol2 = new int[12];
	private int[] _realcol3 = new int[12];
	private int[] _realcol4 = new int[12];
	private int[] _realcol5 = new int[12];
	private int[] _realcol6 = new int[12];
	private int[] _realcol7 = new int[12];
	private int[] _realcol8 = new int[12];
	private int[] _realcol9 = new int[12];
	private int[] _realcol10 = new int[12];
	private int[] _realcol11 = new int[12];
	private int[] _realcol12 = new int[12];
	private int[] _index = new int[12];
	private int[] _indexpos = new int[12];
	private int[] _sortpos = new int[12];
	
	public int fGetValue(int nCol, int nRow) {
		switch(nCol) {
		case 1:
			return _col1[nRow-1]; 
		case 2:
			return _col2[nRow-1]; 
		case 3:
			return _col3[nRow-1]; 
		case 4:
			return _col4[nRow-1]; 
		case 5:
			return _col5[nRow-1]; 
		case 6:
			return _col6[nRow-1]; 
		case 7:
			return _col7[nRow-1]; 
		case 8:
			return _col8[nRow-1]; 
		case 9:
			return _col9[nRow-1]; 
		case 10:
			return _col10[nRow-1]; 
		case 11:
			return _col11[nRow-1]; 
		default:
			return _col12[nRow-1]; 
		}
	}
	
	public void fLogupScenario() {
		fCopyNew();
		fAlliteration();
		fCopyOld();
	}
	
	private void fLogup(int nCol, int nRow, int nAdd) {
		switch(nCol) {
		case 1:
			for(int i=nRow;i<=12;i++) {
				_col1[i-1]+=nAdd;
			}
			break;
		case 2:
			for(int i=nRow;i<=12;i++) {
				_col2[i-1]+=nAdd;
			}
			break;
		case 3:
			for(int i=nRow;i<=12;i++) {
				_col3[i-1]+=nAdd;
			}
			break;
		case 4:
			for(int i=nRow;i<=12;i++) {
				_col4[i-1]+=nAdd;
			}
			break;
		case 5:
			for(int i=nRow;i<=12;i++) {
				_col5[i-1]+=nAdd;
			}
			break;
		case 6:
			for(int i=nRow;i<=12;i++) {
				_col6[i-1]+=nAdd;
			}
			break;
		case 7:
			for(int i=nRow;i<=12;i++) {
				_col7[i-1]+=nAdd;
			}
			break;
		case 8:
			for(int i=nRow;i<=12;i++) {
				_col8[i-1]+=nAdd;
			}
			break;
		case 9:
			for(int i=nRow;i<=12;i++) {
				_col9[i-1]+=nAdd;
			}
			break;
		case 10:
			for(int i=nRow;i<=12;i++) {
				_col10[i-1]+=nAdd;
			}
			break;
		case 11:
			for(int i=nRow;i<=12;i++) {
				_col11[i-1]+=nAdd;
			}
			break;
		case 12:
			for(int i=nRow;i<=12;i++) {
				_col12[i-1]+=nAdd;
			}
			break;
		}
	}
	
	private void fAlliteration() {
		int nValue1, nValue2;
		int nDifference;
		
		for(int i=2;i<=12;i++) {
			for(int j=1;j<=12;j++) {
				nValue1 = fValue(i, j);
				nValue2 = fValue(i-1, j);
				if(nValue1<nValue2) {
					nDifference = nValue2 - nValue1;
					fLogup(i, j, nDifference);
				}
			}
		}
	}
	
	private void fCopyOld() {
		for(int i=1;i<=12;i++) {
			_col1[i-1] = _realcol1[i-1];
			_col2[i-1] = _realcol2[i-1];
			_col3[i-1] = _realcol3[i-1];
			_col4[i-1] = _realcol4[i-1];
			_col5[i-1] = _realcol5[i-1];
			_col6[i-1] = _realcol6[i-1];
			_col7[i-1] = _realcol7[i-1];
			_col8[i-1] = _realcol8[i-1];
			_col9[i-1] = _realcol9[i-1];
			_col10[i-1] = _realcol10[i-1];
			_col11[i-1] = _realcol11[i-1];
			_col12[i-1] = _realcol12[i-1];
		}
	}
	private void fCopy(int nFrom, int nTo) {
		int[] _array = new int[12];
		
		switch(nFrom) {
		case 1:
			for(int i=1;i<=12;i++) {
				_array[i-1] = _col1[i-1];
			}
		case 2:
			for(int i=1;i<=12;i++) {
				_array[i-1] = _col2[i-1];
			}
		case 3:
			for(int i=1;i<=12;i++) {
				_array[i-1] = _col3[i-1];
			}
		case 4:
			for(int i=1;i<=12;i++) {
				_array[i-1] = _col4[i-1];
			}
		case 5:
			for(int i=1;i<=12;i++) {
				_array[i-1] = _col5[i-1];
			}
		case 6:
			for(int i=1;i<=12;i++) {
				_array[i-1] = _col6[i-1];
			}
		case 7:
			for(int i=1;i<=12;i++) {
				_array[i-1] = _col7[i-1];
			}
		case 8:
			for(int i=1;i<=12;i++) {
				_array[i-1] = _col8[i-1];
			}
		case 9:
			for(int i=1;i<=12;i++) {
				_array[i-1] = _col9[i-1];
			}
		case 10:
			for(int i=1;i<=12;i++) {
				_array[i-1] = _col10[i-1];
			}
		case 11:
			for(int i=1;i<=12;i++) {
				_array[i-1] = _col11[i-1];
			}
			break;
		default:
			for(int i=1;i<=12;i++) {
				_array[i-1] = _col12[i-1];
			}
		}
		
		switch(nTo) {
		case 1:
			for(int i=1;i<=12;i++) {
				_realcol1[i-1] = _array[i-1];
			}
			break;
		case 2:
			for(int i=1;i<=12;i++) {
				_realcol2[i-1] = _array[i-1];
			}
			break;
		case 3:
			for(int i=1;i<=12;i++) {
				_realcol3[i-1] = _array[i-1];
			}
			break;
		case 4:
			for(int i=1;i<=12;i++) {
				_realcol4[i-1] = _array[i-1];
			}
			break;
		case 5:
			for(int i=1;i<=12;i++) {
				_realcol5[i-1] = _array[i-1];
			}
			break;
		case 6:
			for(int i=1;i<=12;i++) {
				_realcol6[i-1] = _array[i-1];
			}
			break;
		case 7:
			for(int i=1;i<=12;i++) {
				_realcol7[i-1] = _array[i-1];
			}
			break;
		case 8:
			for(int i=1;i<=12;i++) {
				_realcol8[i-1] = _array[i-1];
			}
			break;
		case 9:
			for(int i=1;i<=12;i++) {
				_realcol9[i-1] = _array[i-1];
			}
			break;
		case 10:
			for(int i=1;i<=12;i++) {
				_realcol10[i-1] = _array[i-1];
			}
			break;
		case 11:
			for(int i=1;i<=12;i++) {
				_realcol11[i-1] = _array[i-1];
			}
			break;	
		default:
			for(int i=1;i<=12;i++) {
				_realcol12[i-1] = _array[i-1];
			}
			break;
		}
	}
	
	private void fCopyNew() {
		for(int i=1;i<=12;i++) {
			fCopy(_sortpos[i-1],i);
		}
	}
	
	public void fFill() {
		Random rnd1 = new Random();
		int nAdd;
		
		_col1[0] = rnd1.nextInt(9)+1;
		_col2[0] = rnd1.nextInt(9)+1;
		_col3[0] = rnd1.nextInt(9)+1;
		_col4[0] = rnd1.nextInt(9)+1;
		_col5[0] = rnd1.nextInt(9)+1;
		_col6[0] = rnd1.nextInt(9)+1;
		_col7[0] = rnd1.nextInt(9)+1;
		_col8[0] = rnd1.nextInt(9)+1;
		_col9[0] = rnd1.nextInt(9)+1;
		_col10[0] = rnd1.nextInt(9)+1;
		_col11[0] = rnd1.nextInt(9)+1;
		_col12[0] = rnd1.nextInt(9)+1;
		for(int i=2;i<=12;i++) {
			nAdd = rnd1.nextInt(7)+2;
			_col1[i-1] = _col1[i-2] + nAdd;
			nAdd = rnd1.nextInt(7)+2;
			_col2[i-1] = _col2[i-2] + nAdd;
			nAdd = rnd1.nextInt(7)+2;
			_col3[i-1] = _col3[i-2] + nAdd;
			nAdd = rnd1.nextInt(7)+2;
			_col4[i-1] = _col4[i-2] + nAdd;
			nAdd = rnd1.nextInt(7)+2;
			_col5[i-1] = _col5[i-2] + nAdd;
			nAdd = rnd1.nextInt(7)+2;
			_col6[i-1] = _col6[i-2] + nAdd;
			nAdd = rnd1.nextInt(7)+2;
			_col7[i-1] = _col7[i-2] + nAdd;
			nAdd = rnd1.nextInt(7)+2;
			_col8[i-1] = _col8[i-2] + nAdd;
			nAdd = rnd1.nextInt(7)+2;
			_col9[i-1] = _col9[i-2] + nAdd;
			nAdd = rnd1.nextInt(7)+2;
			_col10[i-1] = _col10[i-2] + nAdd;
			nAdd = rnd1.nextInt(7)+2;
			_col11[i-1] = _col11[i-2] + nAdd;
			nAdd = rnd1.nextInt(7)+2;
			_col12[i-1] = _col12[i-2] + nAdd;
		}
		
		fIndex();
		fSort();
	}
	
	private void fIndex() {
		for(int i=1;i<=12;i++) {
			_indexpos[i-1] = i;
		}	
		
		_index[0] = _col1[0];
		_index[1] = _col2[0];
		_index[2] = _col3[0];
		_index[3] = _col4[0];
		_index[4] = _col5[0];
		_index[5] = _col6[0];
		_index[6] = _col7[0];
		_index[7] = _col8[0];
		_index[8] = _col9[0];
		_index[9] = _col10[0];
		_index[10] = _col11[0];
		_index[11] = _col12[0];
	}
	
	private void fSort() {
		int nMin, nPos;
		
		for(int i=1;i<=12;i++) {
			_sortpos[i-1] = 0;
		}
	
		for(int i=1;i<=12;i++) {
			nMin = 200;
			nPos = 0;
			for(int j=1;j<=12;j++) {
				if(_index[j-1]<nMin && _index[j-1]!=0) {
					nMin = _index[j-1];
					nPos = j;
				}
			}
			_index[nPos-1] = 0;
			_sortpos[i-1] = nPos;			
		}
	}
	
	private int fValue(int col, int row) {
		switch(col) {
		case 1:
			return _col1[row-1]; 
		case 2:
			return _col2[row-1]; 
		case 3:
			return _col3[row-1]; 
		case 4:
			return _col4[row-1]; 
		case 5:
			return _col5[row-1]; 
		case 6:
			return _col6[row-1]; 
		case 7:
			return _col7[row-1]; 
		case 8:
			return _col8[row-1]; 
		case 9:
			return _col9[row-1]; 
		case 10:
			return _col10[row-1]; 
		case 11:
			return _col11[row-1]; 
		default:
			return _col12[row-1]; 
		}
	}
	
	public void fDisplay() {
		String sText;
	
		System.out.println("======================");
		System.out.println("MATRIX");
		System.out.println("======================");
		for(int i=1;i<=12;i++) {
			sText = "[" + i + "] ";
			for(int j=1;j<=12;j++) {
				sText = sText + fValue(i, j) + "-";
			}
			System.out.println(sText);
		}
		System.out.println("======================");
	}
}
