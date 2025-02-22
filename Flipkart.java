package Aug_3;

public class Flipkart {
	public  void  clothes(String product, String companyName, String type, int quantity) {
		Flipkart f=new Flipkart();
		if(product.equals("clothes")&&companyName.equals("Nike") || companyName.equals("Rebook") && type.equals("T-shirt")|| type.equals("shoes")) {
			double price=f.buyNowforClothes(type, quantity);
			f. bill(product, companyName, type, quantity, price);
		}
		else {
			System.err.println("This product is not available!!");
		}
	}
	public  void mobile(String product, String companyName, int quantity) {
		if(product.equals("phone") && (companyName.contentEquals("Apple") || companyName.equals("Samsung"))) {
			Flipkart f=new Flipkart();
		double price=	buyNowforMobile(companyName, quantity);
			f.bill(product, companyName, companyName, quantity, price);
		}
		else {
			System.err.println("This product is not available!!");
		}
	}
	public double buyNowforClothes(String type, int quantity) {
        double price = 0;
        double discount = 0;

        if (type.equals("T-shirt")) {
            price = 500;
            discount = 0.10;
        } else if (type.equals("shoes")) {
            price = 1000;
            discount = 0.05;
        }

        double totalPrice = price * quantity;
        double discountAmount = totalPrice * discount;
        return totalPrice - discountAmount;
    }
	   public double buyNowforMobile(String companyName, int quantity) {
	        double price = 0;
	        double discount = 0;

	        if (companyName.equals("Apple")) {
	            price = 40000;
	            discount = 0.20;
	        } else if (companyName.equals("Samsung")) {
	            price = 30000;
	            discount = 0.25;
	        }

	        double totalPrice = price * quantity;
	        double discountAmount = totalPrice * discount;
	        return totalPrice - discountAmount;
	    }
	public  void bill(String product, String companyName, String type, int quantity, double price) {
		System.out.println("The name of the product"+product);
		System.out.println("The name of the company: "+companyName);
		System.out.println("The type of the product: "+type);
		System.out.println("The quantity of the product: "+quantity);
		System.out.println("The total price after discount: "+price);
		
	}
	public static void main(String[] args) {
		Flipkart f=new Flipkart();
		
		f.clothes("clothes", "Rebook", "shoes", 3);
		f.mobile("phone", "Apple", 2);
	}

}
