class Phone {
	public static void main(String args[]) {

		String numbers[][] = {
			{"Tommy", "555-3584-1537"},
			{"Lance", "555-5385-1128"},
			{"Sony", "555-2215-5115"},
			{"CJ", "583-1225-5412"},
			{"Larry", "555-5455-1552"}
		};

		int i;

		if(args.length != 1)
			System.out.println("Использование : java Phone <name> ");

		else{

			for(i = 0; i < numbers.length; i++){
				if(numbers[i][0].equals(args[0])) {
					System.out.println(numbers[i][0] + " : " + numbers[i][1]);
					break;
				}

			}
			if(i == numbers.length)
				System.out.println("Имя не найдено.");

		}


	}
}