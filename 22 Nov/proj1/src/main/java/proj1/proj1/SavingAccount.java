package proj1.proj1;

import java.util.Scanner;

public class SavingAccount extends Account {
	
	private double balance;

	public SavingAccount(long accNo, String accHolderName, String bankName, String ifsc, String branchName, double balance) {
		super(accNo, accHolderName, bankName, ifsc, branchName);
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "SavingAccount [balance=" + balance + ", getPin()=" + getPin() + ", AccNo=" + getAccNo()
				+ ", AccHolderName=" + getAccHolderName() + ", BankNam)=" + getBankName() + ", Ifsc="
				+ getIfsc() + ", BranchName=" + getBranchName() + "]";
	}
	
	@Override
	public void withDraw (double amount) throws InsufficientFundsExceptions {
		if(amount<this.balance) {
			this.balance = this.balance-amount;
			System.out.println("Withdraw Successful");
		} else {
			throw new InsufficientFundsExceptions("Low Balance");
		}
	}
	
	@Override
	public void deposit (double amount) {
			this.balance = this.balance+amount;
			System.out.println("Deposit Successful");
	}
	
	public String checkDetails () {
		return "SavingAccount [balance=" + balance + ", getPin()=" + getPin() + ", AccNo=" + getAccNo()
		+ ", AccHolderName=" + getAccHolderName() + ", BankNam)=" + getBankName() + ", Ifsc="
		+ getIfsc() + ", BranchName=" + getBranchName() + "]";
	}
	
	
	public double checkBalance() {
		return this.getBalance();
	}
	
	public int changePin() {
		
		Scanner sc = new Scanner(System.in);
		int pin;
		System.out.println("Enter current pin");
		pin = sc.nextInt();
		if(this.getPin() == pin) {
			System.out.println("Enter new pin");
			pin = sc.nextInt();
			setPin(pin);
		}
		else {
			System.out.println("Current pin is wrong");
			pin = this.getPin();
		}
		
		return pin;
	}
	public int generateNewPin() {
		
		Scanner sc = new Scanner(System.in);
		int pin;
		System.out.println("Enter current pin");
		pin = sc.nextInt();
		if(this.getPin() == pin) {
			System.out.println("This is the new pin");
			pin = generatePin();
			setPin(pin);
		}
		else {
			System.out.println("Current pin is wrong");
			pin = this.getPin();
		}
		
		return pin;
	}
}
