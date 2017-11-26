class Vehicle{
	int passengers;	//Колличество пасажиров;
	int fuelcap; // емкость топливного бака;
	int mpg; // потребность топлива в милях на галлон;

	void range(){
  		System.out.println(" Дальность - " + (fuelcap * mpg) + " миль.\n");

	}
}


class TwoVehicle2{
	public static void main(String args[]){
		Vehicle minivan = new Vehicle();
		Vehicle sportcar = new Vehicle();

		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;

		sportcar.passengers = 2;
		sportcar.fuelcap = 14;
		sportcar.mpg = 12;


		System.out.println("Минифургон, при полном баке, может перевезти " + minivan.passengers + " пасажиров.");
		minivan.range();
		System.out.println("Спортивный автомобиль, при полном баке, может перевезти " + sportcar.passengers + " пасажиров.");
		sportcar.range();
	}
}