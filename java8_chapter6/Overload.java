class Over {


void f(int a) {
	System.out.println("Внутри f (int)" + a);
}

void f(double a) {
	System.out.println("Внутри f (double)" + a);
}
}

class Overload {
	public static void main(String args[]) {
		Over overload = new Over();
		int a = 8;
		byte b = 2;
		float c = 32.5F;
		short d = 4;
		double e = 64.12;
		

		overload.f(a);
		overload.f(b);
		overload.f(c);
		overload.f(d);
		overload.f(e);
	}


}

