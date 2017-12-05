
class Test {

public int a,b;

Test(int a, int b) {
	this.a = a;
	this.b = b;
}

void noChange(int a, int b){
	a = a * a - b;
	b = b * b - a;

}
void change(Test obj){
	this.a = a * a - b;
	this.b = b * b - a;
}


}


class CallByVale {
	public static void main(String args[]){

		Test test = new Test(185, 85);
		int i = 17, j = 55;

		System.out.println("Не ссылочные значения до изменения : " + i + " " + j);
		System.out.println("Cсылочные значения до изменения : " + test.a + " " + test.b);
		
		System.out.println();
		test.noChange(i, j);
		test.change(test);
		
		System.out.println("Не ссылочные значения после изменения : " + i + " " + j);
		System.out.println("Cсылочные значения после изменения : " + test.a + " " + test.b);

	}

}