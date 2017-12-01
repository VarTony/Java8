class ForEach {
	public static void main(String args[]) {

		int A[][] = new int [2][8];
		int sum = 0;

		for(int i = 0; i < A.length; i++)
			for(int j = 0; j < A[i].length; j++) {
				A[i][j] = (i+1)*(j+1);
			}
			System.out.println("Массив " + A);

			for(int x[]: A)
				for(int y: x) {
					System.out.println("Значение " + sum);
					sum += y;

				}
				System.out.println("Сумма - " + sum);

	}

}