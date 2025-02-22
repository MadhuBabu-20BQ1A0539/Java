package Sep_30;

public class Truck extends Vehicle {
int loadCapacity;
	public Truck(String licensePlate, String model, int rentalPricePerDay, boolean isAvailable,int loadCapacity) {
		super(licensePlate, model, rentalPricePerDay, isAvailable);
		this.loadCapacity=loadCapacity;
	}
	@Override
	public void displayInfo() {
		System.out.println("Truck Licence : "+licensePlate);
		System.out.println("Truck Model : "+model);
		System.out.println("Truck RentalPriceperday :"+rentalPricePerDay);
		System.out.println("Truck Available : "+isAvailable);
		System.out.println("Load Capacity : "+loadCapacity);
	}
	@Override
	public int calculateRentalCost(int days) {
		
		int total=days*rentalPricePerDay;
		return total;
	}
	public void rentVehicle(Vehicle c) {
		
	}
}
