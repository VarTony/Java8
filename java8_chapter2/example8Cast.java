class example8Cast{
	public static void main(String args[]){
		double x, y;
		long i;
		char ch;
		byte b;

		x = 15.5;
		y = 38.8;
		i = (long) (x * (x * y));
		System.out.println("Целочисленый результат : " + i);

		b = (byte) i;

		System.out.println("Явное приведение long : " + i + " к byte:" + b);

		ch = (char) x;

		System.out.println("x == (15.5) к char: " + ch);
	}
}

