class example9logicOpTable{
	public static void main(String args[]){
	boolean p, q;
	int f, s;
	System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

	p = true; q = true;

	f = (p)?1:0; 
	s = (!q)?0:1;

	System.out.print(f + "\t" + s + "\t");
	System.out.print( (f&s) + "\t" + (f|s) + "\t");
	System.out.println( (f^s) + "\t" + ((f != 1)? 1: 0));


	p = true; q = false;

	f = (p)?1:0; 
	s = (!q)?0:1;

	System.out.print(f + "\t" + s + "\t");
	System.out.print( (f&s) + "\t" + (f|s) + "\t");
	System.out.println( (f^s) + "\t" + ((f != 1)? 1: 0));

	p = false; q = true;

	f = (p)?1:0; 
	s = (!q)?0:1;

	System.out.print(f + "\t" + s + "\t");
	System.out.print( (f&s) + "\t" + (f|s) + "\t");
	System.out.println( (f^s) + "\t" + ((f != 1)? 1: 0));


	p = false; q = false;

	f = (p)?1:0; 
	s = (!q)?0:1;

	System.out.print(f + "\t" + s + "\t");
	System.out.print( (f&s) + "\t" + (f|s) + "\t");
	System.out.println( (f^s) + "\t" + ((f != 1)? 1: 0));


	}
}