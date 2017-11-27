class Vehicle{
	int passengers;	//Колличество пасажиров;
	int fuelcap; // емкость топливного бака;
	int mpg; // потребность топлива в милях на галлон;

	Vehicle(int p, int f, int m){

	passengers = p;
    fuelcap = f;
    mpg = m;

	}



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


class TwoVehicle4Constructor{
	public static void main(String args[])
					throws java.io.IOException{
		
		Vehicle minivan = new Vehicle(7,16,21);
		Vehicle sportcar = new Vehicle(2,14,12);
		double gallons;
		System.out.print("Введите колличество миль: ");
		char dist = (char) System.in.read();

		gallons = (double) minivan.fuelneeded(dist);
		System.out.println("Минифургону для преодаления расстояния в " + dist + " миль, потребуется " + minivan.liters(gallons) + " литров топлива.");
		gallons = (double) sportcar.fuelneeded(dist);
		System.out.println("Спортивному автомобилю для преодаления расстояния в " + dist + " миль, потребуется " + sportcar.liters(gallons) + " литров топлива.");
	}
}