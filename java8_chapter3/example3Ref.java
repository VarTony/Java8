
class example3Ref{
	public static void main(String args[])
		throws java.io.IOException{
			char choice;
			boolean p;
			System.out.println("Справка: \n" + "1. if \n" + "2. switch");
			System.out.print("Выберите: ");
			choice = (char) System.in.read();

			System.out.println();

			p = (choice == '1')? true: false;

			if(p) 
				System.out.println("Оператор if: \n \n \t if(условие) оператор \n \t else оператор \n");
			else
				System.out.println("Оператор switch: \n \n \t shitch(выражение) \n \t case константа \n \t последовательность операторов \n \t break \n  \t //... \n } \n");



		}
	}