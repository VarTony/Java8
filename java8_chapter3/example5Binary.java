class example5Binary{
	public static void main(String args[])
			   throws java.io.IOException { 

			   	long answer;
			   	int i = 0, j;


			   	for(; i <= 64; i++){
			   		answer = 1;
			   		j = i;
			   		while(j > 0){
			   			j--;
			   			answer *= 2;
			   		}
			   

			   	System.out.println("2 в степени " + i + " эквивалентно " + answer);

			   }
			   }
}
