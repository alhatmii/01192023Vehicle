
public class Truck extends Vehicle {

//	Additional Properties of Truck:
	private int numberOfAxles;
	private int capacityInTons;

	public int getNumberOfAxles() {
		return numberOfAxles;
	}

	public void setNumberOfAxles(int numberOfAxles) {
		this.numberOfAxles = numberOfAxles;
	}

	public int getCapacityInTons() {
		return capacityInTons;
	}

	public void setCapacityInTons(int capacityInTons) {
		this.capacityInTons = capacityInTons;
	}

	// Method of Truck:
	void load() {
		System.out.println("Loaded " + getWeight() + " tons.");

	}
}
