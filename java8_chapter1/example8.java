//Упражнение 10;

class example8{
	public static void main(String args[]){
		double inch, meters;
		int count = 0;

			 for(meters = 1; meters <= 100; meters++){
               
               inch = meters * 39.37;
               count++; 

					System.out.println( meters + " метрам соответствует: " + inch + " дюймов.");
		
		        		if (count == 12){

		         			System.out.println();

		        			 	count = 0;
		        }
		}
	}
}