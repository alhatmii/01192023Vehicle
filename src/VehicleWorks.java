
public class VehicleWorks {

	public static void main(String[] args) {
		
//		Polymorphism object Calling: 
		Vehicle Veh = new Vehicle();
		Veh.start();
		Veh.drive();
		System.out.println("\n");
		System.out.println("CAUTION: ANIMAL AHEAD!!!");
		Veh.honk();
		Veh.stop();
	}
}