

class example10Prime{
	public static void main(String args[]){
		int i;
		Boolean isPrime;

			for(i = 2; i < 100; i++ ){

				isPrime = ((i%2 != 0) & (i%3 != 0 & i != 3) & (i%5 != 0 & i != 5))? true:
				 (i == 3 | i == 5)? true: false;

					 if(isPrime)
						System.out.println(i + " - простое число;");
			}	
	}

}

// class example10Prime{
// 	public static void main(String args[]){
// 		int i, j;
// 		boolean isPrime;

// 			for(i = 2; i < 100; i++ ){
// 				isPrime = true;

// 				for(j=2; j <= (i/j); j++){

// 					 if((i%j) == 0) isPrime = false;

// 					if(isPrime) System.out.println(i + " - простое число;");

// 				}
// 			}	
// 	}

// }  <- Неверное решение;