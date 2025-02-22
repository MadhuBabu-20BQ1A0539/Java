package OOPS;

public class MainTest {

	public static void main(String[] args) {
		Car c=new Car("Hondai","Blue",4);
		c.speed();
		c.wheel();
		c.color();
		c.company();
		System.out.println("============================================");
		Bike b=new Bike();
		b.setName("Speldor");
		b.setColor("Gold");
		b.setWheels(2);
		b.speed();
		b.company();
		b.color();
		b.wheel();
		System.out.println("============================================");
		Platinum p=new Platinum();
		p.Wheels();
		p.Color();
		System.out.println("===========cpy=========");
		Car c2=new Car(c);
		c2.speed();
		c2.wheel();

	}

}
