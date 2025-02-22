package Aug_3;

import java.util.*;
public class Sample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("CHOOSE category Clothes or Mobile :");
		String type = scan.nextLine();
		if(type.equals("Clothes")) {
			Clothes();
		}else if(type.equals("Mobiles")) {
			Mobiles();
		}else System.out.println("this program is only for clothes and mobiles");
	}

	private static void Mobiles() {
		System.out.println("CHOOSE STORE APPLE or SAMSUNG :");
		Scanner scan = new Scanner(System.in);
		String brand = scan.nextLine();
		String iteam;
		if(brand.equals("APPLE")) {
			System.out.println("available products=> IPHONE 11 , 12 , 13, 14, 15, 15PLUS :");
			iteam = scan.nextLine();
		}
		else {
			System.out.println("available items=> SAMSUNG S21,S22,S23,S23-ULTRA,FLIP-Z:5,6,7-PLUS :");
			 iteam = scan.nextLine();
		}
		System.out.println("Quantity requried  :");
	    int q = scan.nextInt();
	    System.out.println("ADD THIS TO CART (Y/N):");
	    //char c = scan.nextLine().charAt(0);
	    scan.nextLine();
	    String c = scan.nextLine();
	    if(c.equals("y")||c.equals("Y")) {
	    	buyItem(brand,iteam,q);
	    }else {
	    	System.out.println("THANK YOU FOR SHOPPING");
	    }
	}

	private static void Clothes() {
		Scanner scan = new Scanner(System.in);
		System.out.println("CHOOSE STORE NIKE or REEBOK :");
		String brand = scan.nextLine();
		System.out.println("available items=> t-shirts or shoes :");
		String iteam = scan.nextLine();
		System.out.println("Quantity requried  :");
	    int q = scan.nextInt();
	    System.out.println("ADD THIS TO CART (Y/N):");
	    //char c = scan.nextLine().charAt(0);
	    scan.nextLine();
	     String c = scan.nextLine();
	    if(c.equals("y")||c.equals("Y")) {
	    	buyItem(brand,iteam,q);
	    }else {
	    	System.out.println("THANK YOU FOR SHOPPING");
	    }
	}

	private static void buyItem(String a,String b,int c) {
		if(a.equals("APPLE")||a.equals("SAMSUNG")||a.equals("IPHONE")||a.equals("GALAXCY")) {
			if(a.equals("APPLE")||a.equals("IPHONE")) {
				System.out.println("----->you got an discount of 20%<-----");
				long price = 40000*c;
				double finalIs = price/5;
				System.err.println("--------------------------------------------------------------------");
				System.err.println("-----------------------------|YOUR BILL|----------------------------");
				System.err.println("\t----->BRAND IS APPLE<-----");
				System.err.println("\t----->MODEL IS"+b+"<-----");
				System.err.println("\t----->you got an discount of 20% on"+b+"<-----");
				System.err.println("\t----->TOTAL BILL AMOUNT WITH DISCOUNT IS:("+finalIs+")<-----");
				System.err.println("--------------------------------------------------------------------");
			}else {
				System.out.println("----->you got an discount of 25%<-----");
				long price = 40000*c;
				double finalIs = price/4;
				System.err.println("--------------------------------------------------------------------");
				System.err.println("-----------------------------|YOUR BILL|----------------------------");
				System.err.println("\t----->BRAND IS SAMSUNG<-----");
				System.err.println("\t----->MODEL IS"+b+"<-----");
				System.err.println("\t----->you got an discount of 25% on"+b+"<-----");
				System.err.println("\t----->TOTAL BILL AMOUNT WITH DISCOUNT IS:("+finalIs+")<-----");
				System.err.println("--------------------------------------------------------------------");
			}
		}else {
			if(b.equals("t-shirt")||b.equals("Tshirts")||b.equals("T-shirts")) {
			System.out.println("----->you got an discount of 10%<-----");
			long price = 500*c;
			double finalIs = price/10;
			System.err.println("--------------------------------------------------------------------");
			System.err.println("-----------------------------|YOUR BILL|----------------------------");
			System.err.println("\t----->BRAND IS "+a+"<-----");
			System.err.println("\t----->MODEL IS  "+b+"<-----");
			System.err.println("\t----->you got an discount of 10% on"+b+"<-----");
			System.err.println("\t----->TOTAL BILL AMOUNT WITH DISCOUNT IS:("+finalIs+")<-----");
			System.err.println("--------------------------------------------------------------------");
			
		}else {
			System.err.println("----->you got an discount of 25%<-----");
			long price = 1000*c;
			double finalIs = price/20;
			System.err.println("--------------------------------------------------------------------");
			System.err.println("-----------------------------|YOUR BILL|----------------------------");
			System.err.println("\t----->BRAND IS "+a+"<-----");
			System.err.println("\t----->MODEL IS"+b+"<-----");
			System.err.println("\t----->you got an discount of 5% on"+b+"<-----");
			System.err.println("\t----->TOTAL BILL AMOUNT WITH DISCOUNT IS:("+finalIs+")<-----");
			System.err.println("--------------------------------------------------------------------");
			
		}
		
	}

}
}