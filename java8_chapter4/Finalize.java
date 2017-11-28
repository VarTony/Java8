
//стр 155;

//Демонстрация сборки мусора;

class FDemo {
int x;

	FDemo(int i) {
	x = i;
	
	}

	//Вызывается при удаление объекта;
	protected void finalize() {
		System.out.println("Финализация " + x);
	} 

	//Генерация объекта который сразу же уничтожается;
	void generator(int i) {
		FDemo j = new FDemo(i);
	}

}

	class Finalize{

		public static void main(String args[]) {

			int count;

			FDemo jo = new FDemo(0); 
		
			count = 1;

				for(count = 1; count < 10000000; count++) {

					jo.generator(count);
				}

		}

	}