
public class ElectricVehicle extends Vehicle {

//	Properties of Electric Vehicle:
	private int batteryCapacity;
	private int chargeLevel;

//	Getters and setters of properties:
	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public int getChargeLevel() {
		return chargeLevel;
	}

	public void setChargeLevel(int chargeLevel) {
		this.chargeLevel = chargeLevel;
	}

//	Methods of Electric Properties:
	void charge() {

//		The change of battery levels occurs when charged:
		for (int i = 0; i < 101; i++) {
			setChargeLevel(i);

		}
	}

	void drive() {
		System.out.println("Electric Vehicle started moving:");
		System.out.println("Electric Vehicle driven 5,482 miles");

	}

}