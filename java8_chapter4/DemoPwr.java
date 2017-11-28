//	Ключевое слово this;

//стр 156;

class Pwr {

int e;
double b, val;

Pwr(double b, int e) {

	this.b = b;
	this.e = e;

	val = 1;
	if(e == 0) return;
	for(; e > 0; e--) val *= b;

}

 double get_pwr() {

 	return val;

 }


}	

	class DemoPwr {
		public static void main(String args[]) {


			Pwr x = new Pwr(5.0, 11);
			Pwr y = new Pwr(8.18, 83);
			Pwr z = new Pwr(5.5, 1241);


			System.out.println(x.b + " в степени " + x.e + " равно " + x.get_pwr());
			System.out.println(y.b + " в степени " + y.e + " равно " + y.get_pwr());
			System.out.println(z.b + " в степени " + z.e + " равно " + z.get_pwr());


		}

	}