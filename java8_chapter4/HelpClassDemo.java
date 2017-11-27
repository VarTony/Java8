
class Help{

	void helpon(int what){

		switch(what){
				case '1':
					System.out.println("Оператор if: \n \n \t if(условие) оператор \n \t else оператор \n");
					break;
				case ('2'):
					System.out.println("Оператор switch: \n \n \t switch(выражение) \n \t case константа \n \t последовательность операторов \n \t break \n  \t //... \n } \n");
					break;
				case '3':
					System.out.println("Оператор for: \n \n \t (инициализация; условие; итерация)  \n \t оператор \n");
					break;
				case '4':
					System.out.println("Оператор while: \n \n \t (условие)  \n \t оператор \n");
					break;
				case '5':
					System.out.println("Оператор do-while: \n \n \t do{  \n \t оператор \n  while(условие) \n");
					break;
				case '6':
					System.out.println("Оператор break: \n \n \t break; или break метка; \n");
					break;
				case '7':
					System.out.println("Оператор continue: \n \n \t continue; или continue метка;\n");
					break;
				default:
					System.out.println("Значение - " + what + " не найдено. ");
			}
			System.out.println();

	}

	void ShowMenu(){
		System.out.println(
				"Справка: \n" + "1. if \n" + "2. switch" + "3. for \n" + "4. while \n" + "5. do-while \n" + "6. break \n" + "7. continue \n" + "Завершение (q - quite) \n" );
			System.out.print("Выберите: ");

	}

	boolean isvalid(int ch){
		
		 return (ch < '1' | ch > '7' & ch != 'q')? false: true;
	
	}


}



class HelpClassDemo{
	public static void main(String args[])
		throws java.io.IOException{

			char choice, ignore;		

			Help hlpobg = new Help();

			for( ; ; ){
				do{
			
			hlpobg.ShowMenu();

			choice = (char) System.in.read();
			System.out.println();

				do{
					ignore = (char) System.in.read();
				}while(ignore != '\n');
			}while(!hlpobg.isvalid(choice));


			if(choice == 'q') break;

			System.out.println("\n");

			

			hlpobg.helpon(choice);

			}


		}
	}