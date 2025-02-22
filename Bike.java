package OOPS;

public class Bike  implements Vehicle{
	private String name;
	private String color;
	private int wheels;
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	public void setWheels(int wheels) {
		this.wheels=wheels;
	}
	public int getWheels() {
		return wheels;
	}
	@Override
	public void speed() {
		System.out.println("Speed ");
		
	}

	@Override
	public void wheel() {
		System.out.println("Wheels : "+getWheels());
		
	}

	@Override
	public void color() {
		System.out.println("Color : "+getColor());
	}

	@Override
	public void company() {
		System.out.println("Name : "+name);
	}

}
