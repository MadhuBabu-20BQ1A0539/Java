package Sep_2nd;

 interface A1 {
	public void m1();
}
 interface B extends A1{
	 public void m2();
 }
class c implements B{

	@Override
	public void m1() {
		System.out.println("M1 Executed");
		
	}

	@Override
	public void m2() {
		System.out.println("M2 executed");
	}
	
}
public class A{
	public static void main(String[] args) {
		c C=new c();
		C.m1();
		C.m2();
	}
}