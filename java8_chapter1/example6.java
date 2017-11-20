class example6{
	public static void main(String args[]){
		double gallons, liters;
		int count = 0;

			 for(gallons = 1; gallons <= 100; gallons++){
               
               liters = gallons * 3.7854;
               count++; 

					System.out.println( gallons + " галлонам соответствует:" + liters + " литров.");
		
		        		if (count == 10){

		         			System.out.println();

		        			 	count = 0;
		        }
		}
	}
}