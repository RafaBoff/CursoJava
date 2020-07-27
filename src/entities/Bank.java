package entities;

public class Bank {

	private int account;
	private String name;
	private double balance;
	
	public Bank(int account, String name) {
		this.account = account;
		this.name = name;
	}

	
	public Bank(int account, String name, double initial) {
		this.account = account;
		this.name = name;
		incBalance(initial);
	}

	public int getAccount() {
		return account;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getBalance() {
		return balance;
	}

	public void incBalance(double incValue) {
		this.balance += incValue;
	}

	public void decBalance(double decValue) {
		this.balance -= decValue + 5.00;
	}
	
	public String toString() {
		return "Account " 
				+ account
				+ ", Holder: "
				+ name
				+ ", Balance: $"
				+ String.format("%.2f",balance);
				}
	
}
