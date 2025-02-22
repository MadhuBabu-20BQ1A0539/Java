package Aug_26;

public class Test {

	public static void main(String[] args) {
		Customer c=new Customer("sidhu",500);
	//	CardsOnOffer d=new CardsOnOffer();
	
		CardType cd1=CardsOnOffer.getOfferedCard(c);
		if(cd1!=null) {
			System.out.println(cd1.display());
		}
	}
	
	

}
