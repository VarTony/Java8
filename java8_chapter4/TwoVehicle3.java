class Vehicle{
	int passengers;	//Колличество пасажиров;
	int fuelcap; // емкость топливного бака;
	int mpg; // потребность топлива в милях на галлон;

	double fuelneeded(int miles){
		return (double) miles / mpg;
	}

	int range(){
  		return (int) mpg * fuelcap;
	}

	double liters(double gallons){
		return gallons * 3.7854;
	}

}


class TwoVehicle3{
	public static void main(String args[])
					throws java.io.IOException{
		
		Vehicle minivan = new Vehicle();
		Vehicle sportcar = new Vehicle();
		double gallons;
		System.out.print("Введите колличество миль: ");
		int dist = (int) System.in.read();

		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;
		minivan.range();
		

		sportcar.passengers = 2;
		sportcar.fuelcap = 14;
		sportcar.mpg = 12;
		sportcar.range();

		gallons = (double) minivan.fuelneeded(dist);
		System.out.println("Минифургону для преодаления расстояния в " + dist + " миль, потребуется " + minivan.liters(gallons) + " литров топлива.");
		gallons = (double) sportcar.fuelneeded(dist);
		System.out.println("Спортивному автомобилю для преодаления расстояния в " + dist + " миль, потребуется " + sportcar.liters(gallons) + " литров топлива.");
	}
}