class example9Fac{
	public static void main(String args[]){

		int i, j;

 	for(i = 2; i <= 128; i++){
      System.out.print("Делители " + i + ": ");
      for(j = 1; j <= i; j++ )
      	if(i % j == 0)
      		System.out.print(j + ", ");

      	System.out.println();
      
 	}

	}
}