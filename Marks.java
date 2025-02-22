package Sep_2nd;

 interface Marks1 {
	 public void Stu1();
}
interface Mark2 extends Marks1{
	public void Stu2();
}
interface Mark3 extends Mark2{
	public void Stu3();
}
class V implements Mark3{

	@Override
	public void Stu1() {
		System.out.println(" Maths Maks : 95");
		
	}

	@Override
	public void Stu2() {
		System.out.println(" Math Marks : 85");
		
	}
	@Override
	public void Stu3() {
		System.out.println(" Math Marks  : 75");
	}
}
public class Marks{
	public static void main(String[] args) {
		V v=new V();
		v.Stu1();
		v.Stu2();
		v.Stu3();
	}
}