package Sep_30;

public class Customer extends User {
	int creditScore;
	
	 public Customer(String userId, String name, String email, int creditScore) {
	        super(userId, name, email);
	        this.creditScore = creditScore;
	    }

	 @Override
	    public void viewAvailableVehicles() {
	        System.out.println(name + " is viewing available vehicles.");
	    }


	@Override
	void rentVehicle(String vehicleType) {
		
	}

	@Override
	void returnVehicle(String licensePlate) {
		
	}

}
