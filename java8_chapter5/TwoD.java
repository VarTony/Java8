
//Многомерные массивы;

class TwoD {
	public static void main(String args[]) {
		int t, i;
		int table[][] = new int [5][5];

		for(t=0; t<5; t++) {
			for(i=0; i<5; ++i) {
				table[t][i] =  (t*5) +i+1;
				System.out.print(table[t][i] + " "); 
			}
			System.out.print("\n");
		}

	}


}