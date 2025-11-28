package proj1.proj1;

import java.util.Scanner;

public class CurrentAcount extends Account{
	
	private double overDraft;

	public CurrentAcount(long accNo, String accHolderName, String bankName, String ifsc, String branchName,
			double overDraft) {
		super(accNo, accHolderName, bankName, ifsc, branchName);
		this.overDraft = overDraft;
	}

	
	
	public double getOverDraft() {
		return overDraft;
	}



	public void setOverDraft(double overDraft) {
		this.overDraft = overDraft;
	}
	

	@Override
	public String toString() {
		return "CurrentAcount [overDraft=" + overDraft + ", Pin=" + getPin()
				+ ", AccNo=" + getAccNo() + ", AccHolderName=" + getAccHolderName() + ", BankName="
				+ getBankName() + ", Ifsc=" + getIfsc() + ", BranchName=" + getBranchName() + "]";
	}


	@Override
	public void withDraw(double amount) {
		// TODO Auto-generated method stub
		this.overDraft = this.overDraft+amount;
		System.out.println("Withdraw Successful");
	}
	
	

	@Override
	public void deposit(double amount) throws InsufficientFundsExceptions {
		// TODO Auto-generated method stub
		if(amount<this.overDraft) {
			this.overDraft = this.overDraft-amount;
			System.out.println("Withdraw Successful");
		} else {
			throw new InsufficientFundsExceptions("Excess funds deposited");
		}
	}
	
	public String checkDetails () {
		return "CurrentAcount [overDraft=" + overDraft + ", Pin=" + getPin()
		+ ", AccNo=" + getAccNo() + ", AccHolderName=" + getAccHolderName() + ", BankName="
		+ getBankName() + ", Ifsc=" + getIfsc() + ", BranchName=" + getBranchName() + "]";
	}
	
	public double checkOverDraftLimit () {
		return getOverDraft();
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
