package Sep_2nd;

interface Fruit1 {
	public void cut();
}
abstract class Mango {
	public abstract  void eat();
}
class L extends Mango implements Fruit1{

   @Override
	public void cut() {
		System.out.println("Fruit Cutted");
		
	}
	@Override
	public void eat() {
		System.out.println(" mango eated ");
	}
	
}
public class Fruit{
	public static void main(String[] args) {
		L l=new L();
		l.cut();
		l.eat();
	}
}
