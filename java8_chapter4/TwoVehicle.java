class Vehicle{
	int passengers;	//Колличество пасажиров;
	int fuelcap; // емкость топливного бака;
	int mpg; // потребность топлива в милях на галлон;
}


class TwoVehicle{
	public static void main(String args[]){
		int range1, range2;
		Vehicle minivan = new Vehicle();
		Vehicle sportcar = new Vehicle();

		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;

		sportcar.passengers = 2;
		sportcar.fuelcap = 14;
		sportcar.mpg = 12;


		range1 = minivan.fuelcap * minivan.mpg;
		range2 = sportcar.fuelcap * sportcar.mpg;

		System.out.println("Минифургон, при полном баке, может перевезти " + minivan.passengers + " пасажиров на расстояние " + range1 + " миль.");
		System.out.println("Спортивный автомобиль, при полном баке, может перевезти " + sportcar.passengers + " пасажиров на расстояние " + range2 + " миль.");
	}
}