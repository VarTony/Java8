
class MyClass {

	private int alpha;
	public int beta;
	int gamma;


	void setAlpha(int a) {

 		this.alpha = a;

 	}

 	int getAlpha() {

 		return alpha;

 	}	

}



 class AccessDemo {
 	public static void main(String args[]) {

 		MyClass ob = new MyClass();
 		ob.setAlpha(16);
 		ob.beta = 8;
 		ob.gamma = 4;

 		System.out.println("ob.alpha(private) - " + ob.getAlpha() + "\nob.beta(public) - " + ob.beta + "\nob.gamma(default) - " + ob.gamma);
 	 }

 }