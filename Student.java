package Sep_2nd;

 interface Student1 {
	 public void m1();
}
 interface Student2 extends Student1{
	 public void m2();
 }
 interface Student3 extends Student2{
	 public void m3();
 }
 class B1 implements Student3{

	@Override
	public void m2() {
		System.out.println("M2 excuted");
		
	}

	@Override
	public void m1() {
		System.out.println("M1 excuted");
		
	}

	@Override
	public void m3() {
		System.out.println("m3 executed");
		
	}
	 
 }
public  class Student{
	 public static void main(String[] args) {
		B1 b=new B1();
		b.m1();
		b.m2();
		b.m3();
	}
 }
