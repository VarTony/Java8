class ShowBits {
 int numbits;

 ShowBits(int n) {
 	this.numbits = n;
 }

void show(long val) {
	long mask = 1;
	mask <<= numbits - 1;
	int spacer = 0;
	for(; mask != 0; mask >>>= 1) {
		if((val & mask) != 0) 
			System.out.print("1");
		else
			System.out.print("0");
		spacer++;
		if((spacer % 8) == 0) {
			System.out.print(" ");
			spacer = 0;
		}

	}
	System.out.println();
}
}

class ShowBitsDemo {
      public static void main(String args[]) {

      	ShowBits b = new ShowBits(8);
      	ShowBits s = new ShowBits(16);
      	ShowBits i = new ShowBits(32);

      	System.out.println("715 в двоичной системе счиления");
      	s.show(715);
      	System.out.println("\n715 * 715 в двоичной системе счиления");
      	i.show((715 * 715));
      	System.out.println("\n400 000 000 в двоичной системе счиления");
      	i.show(400000000);


}
}