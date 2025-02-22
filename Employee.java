package Sep_2nd;

 interface Employee1 {
	 public void m1();
}
 interface Employee2 extends Employee1{
	 public void m2();
 }
 interface Employee3 extends Employee1{
	 public void m3();
 }
 abstract class N implements Employee1,Employee2,Employee3{
	 @Override
	 public void m1() {
		 System.out.println(" M1 Emp Executed.");
	 }
	 @Override
	 public void m2() {
		 System.out.println(" M2 Emp executed");
	 }
	 public abstract void m3();
 }
class M extends N{
	@Override
	public void m3() {
		System.out.println("M3 excuted emp");
	}
}
public class Employee{
	public static void main(String[] args) {
		M m=new M();
		m.m1();
		m.m2();
		m.m3();
	}
}