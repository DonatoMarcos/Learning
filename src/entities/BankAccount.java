package entities;

public class BankAccount implements Comparable{
	
	static int generalAccountNumber = 1;
	private int accountNumber;
	private String customerName;
	private double balance;
	public final static int TAX = 5;
	
	public BankAccount(String customerName, double initialDeposit) {
		super();
		this.setAccountNumber();
		this.customerName = customerName;
		depositValue(initialDeposit);
	}

	public BankAccount(String customerName) {
		super();
		this.setAccountNumber();
		this.customerName = customerName;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	
	private void setAccountNumber() {
		this.accountNumber = generalAccountNumber;
		generalAccountNumber++;
	}

	public double getBalance() {
		return balance;
	}
	
	public void depositValue (double value) {
		balance +=value;
	}
	
	public void withdrawValue (double value) throws Exception {
		if (value > (balance - TAX))
			throw new Exception("Not enough funds");
		else
			balance -= (value + TAX);
	}

	@Override
	public String toString() {
		return "BankAccount | Account Number =" 
				+ accountNumber 
				+ " | Customer Name = " 
				+ customerName 
				+ " | Balance = $" 
				+ String.format("%.2f",balance);
	}

	public int compareTo(Object bank) {
		double auxBalance1 = this.getBalance();
		double auxBalance2 = ((BankAccount) bank).getBalance();
		
		return Double.compare(auxBalance1, auxBalance2);
		
	}

}
