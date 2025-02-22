package Aug_26;

public class CardType {
	private Customer c;
	private String CardType;
	CardType(Customer c,String CardType){
		this.c=c;
		this.CardType=CardType;
	}
	public String display() {
		return "The Customer "+ c.display()+" Is Eligible For "+CardType+" Card.";
	}
}
