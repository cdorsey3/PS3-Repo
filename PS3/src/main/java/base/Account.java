package base;

import java.util.Date;

public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date date;

	public Account() {
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		date = new java.util.Date();
	}

	public Account(double balance, int id) {
		super();
		this.id = id;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public Date getDate() {
		return date;
	}

	double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}

	public double withdraw(double amt) throws InsufficientFundsException {
		if (amt < getBalance()){
			setBalance(balance - amt);
		}
		else {
			throw new InsufficientFundsException(amt);
		}
		return getBalance();
	}

	public double deposit(double DAmt) {
		setBalance(balance + DAmt);
		return getBalance();
	}
}