
public class Vehicle extends Engine implements Honkable {

//	Properties of Vehicle:
	private int make;
	private int model;
	private int year;
	private String color;
	private int numberOfWheels;
	private double weight;

//	Allow Getters and setters for properties:
	public int getMake() {
		return make;
	}

	public void setMake(int make) {
		this.make = make;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

//	Methods of Vehicle:
	void start() {
		System.out.println("Vehicle started");
	}

	void stop() {
		System.out.println("Vehicle stopped");

	}

	void drive() {
		System.out.println("Vehicle started moving:");
		System.out.println("Vehicle driven 75,482 miles");

	}

	public void honk() {
		System.out.println("Honk Honk!");

	}

//	Abstracted Method from Engine Abstracted class:
	@Override
	public void startEngine() {
		System.out.println("The Electric Vehicle already started.");
	}
}
