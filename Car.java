package Aug_12;
import java.util.Scanner;
public class Car {
	public String Company;
	public String model;
	public int year;
	public String mileage;
	public void setCarDetails() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the Company : ");
		Company =sc.next();
		System.out.println("Enter the model of the Car : ");
		model=sc.next();
		System.out.println("Enter the year : ");
		year=sc.nextInt();
		System.out.println("Enter the mileage : ");
		mileage=sc.next();
		sc.close();
	}
	public void display() {
		System.out.println(" Car Company : "+Company);
		System.out.println("Car Model : "+model);
		System.out.println("Car Year : "+year);
		System.out.println("Car Mmileage : "+mileage);
	}
	
}
