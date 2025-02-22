package Project_PhonePe;


class User{
public static void main(String []args){
	BankAccount b1= new BankAccount("mahu",123456789015l);
BankAccount.balance = 10000;
PhonePe.makePayment(new UPIQr(), 5000);
System.out.println("Remaining Balance : "+BankAccount.balance);
}
}