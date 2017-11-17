class example4{
	public static void main(String args[]){
		int a = 14;
		double b = a * 3.583;
        double c = a - b;

        	if(a < b) System.out.println("c: " + c);
        	if(a > b) System.out.println("(c - b) if c = (a - b):" + (c - b));

       c = b - c;

       	System.out.println("(c - b) if  c = (b - c): " + (c - b));

	}
}