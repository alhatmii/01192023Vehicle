
public class Car extends Vehicle {

//	Additional Properties of Car:
	private int numberOfDoors;

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	// Methods of Car:
	void openTrunk() {
		System.out.println("Trunk opened.");

	}

}
