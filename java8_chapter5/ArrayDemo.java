
class ArrayDemo{
	public static void main(String args[]){

		char A[] = new char[15];

		for(int i = 0; i < 15; i++)
			A[i] = (char) (i + (i * i));

			for(int i = 0; i < 15; i++)
				System.out.println("Индекс массива " + i + " равен " + A[i]);


	}
}