package Project_PhonePe;

class UPIQr{
	public static void ScanQr(BankAccount ba) {
		
		if(ba.getBankHolderName().equals("madhu") && ba.getAccountNumber()==123456789015l) {
			System.out.println("Send payment");
		}
		else {
			System.out.println("Scan Properly");
		}
	}
}