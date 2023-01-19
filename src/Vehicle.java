
public class Vehicle {

//	Properties of Vehicle:
	private int make;
	private int model;
	private int year;
	private String color;
	private int numberOfWheels;
	private double weight;

	int counter = 0;

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

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

//	Methods of Vehicle:
	private void start() {
		System.out.println("Vehicle started");
	}

	private void stop() {
		System.out.println("Vehicle stopped");

	}

	private void drive() {
		System.out.println("Vehicle started moving:");
		System.out.println("Vehicle driven " + counter + " miles");
		counter ++;

	}

	private void honk() {
		System.out.println("Honk Honk!");

	}
}
