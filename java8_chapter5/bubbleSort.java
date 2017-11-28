class bubbleSort{
	public static void main(String args[]) {

		int nums[] = {12129, -10, 10013, -1218, 555, 3825, -12312, 12323, -76970, 1231 };

		int a, b, t;
		
			System.out.print("Исходный массив: ");

			for(int i = 0; i < 10; i++)
				System.out.print(" " +  nums[i]);
			System.out.println();

		 for(a = 1; a < 10; a++) { 
		 	System.out.println();
		 	for(b = 9; b >= a; b--) {
		 		
		 		if(nums[b - 1] > nums[b]) {

		 		t = nums[b - 1];
		 		nums[b - 1] = nums[b];
		 		nums[b] = t;
 				
 				}
				
			}
			System.out.print("Массив на " + a + " итерации");
			for(int i = 0; i < 10; i++)
				System.out.print(" " + nums[i]);


		}
		System.out.print("\n\nОтсортированный массив:");
		for(int i = 0; i < 10; i++)
			System.out.print(" " + nums[i]);
				System.out.println();


	}
}