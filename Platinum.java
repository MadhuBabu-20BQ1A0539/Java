package OOPS;

public class Platinum  extends Bike{

	Bike b=new Bike();
	public void Wheels() {
		b.setWheels(5);
		b.setColor("black");
		b.wheel();
	}
	public void Color() {
		//System.out.println("Color of the Bike : "+b.getColor());
		b.color();
	}
}
