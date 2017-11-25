class example11for{
	public static void main(String args[]){
		int j = 1;
		
			for(int i = 2;i <= 1024; i *= 2, j++)
				System.out.println("2^" + j + " = " + i);


	}
}