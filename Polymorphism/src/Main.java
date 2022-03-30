
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		Boat boat = new Boat();
		Bike bike = new Bike();
		
		Vehicle[] racers = {car, bike, boat};
		
		//car.go();
		//bike.go();
		//boat.go();
		
		for(Vehicle x : racers) {
			
			x.go();
			
		}

	}

}
