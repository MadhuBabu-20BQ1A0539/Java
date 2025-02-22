package Project_PhonePe;

public class PhonePe {
	//static double balance=0;
	public static void makePayment(UPIQr qr, double amount) {
		if(qr instanceof UPIQr) {
			if(BankAccount.balance>=amount) {
			BankAccount.balance=BankAccount.balance-amount;
			System.out.println("Payment successfull");
			}
			else {
				System.out.println("Insufficient balance");
			}
		}
		else {
			System.out.println("Invalid QR");
		}
	}
}
