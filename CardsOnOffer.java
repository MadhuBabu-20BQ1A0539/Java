package Aug_26;

public class CardsOnOffer {
	String ans="";
	public static CardType getOfferedCard(Customer c) {
		
		String ans="";
		if(c.getCreditPoints()<0) {
			System.out.println("Invalid Input");
		}
		else if(c.getCreditPoints()>0&&c.getCreditPoints()<100) {
			ans="Emi";
		}
		else if(c.getCreditPoints()>=100 && c.getCreditPoints()<=500) {
			ans="Silver";
		}
		else if(c.getCreditPoints()>=501 && c.getCreditPoints()<=1000) {
			ans="Gold";
		}
		else {
			ans="Platinum";
		}
	
		return new CardType(c, ans);
	}
}
