package Project_PhonePe;

class BankAccount{
	static double balance;
	String bankHolderName;
	long accountNumber;
	BankAccount(String bankH,long accN){
		this.bankHolderName=bankH;
		this.accountNumber=accN;
	}
	public String getBankHolderName() {
        return bankHolderName;
    }

    public long getAccountNumber() {
        return accountNumber;
    }
}