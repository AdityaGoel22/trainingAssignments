package proj1.proj1;

import java.util.Scanner;

public class BankingApp {

	public static void main(String[] args) throws InsufficientFundsExceptions {

		SavingAccount sa = new SavingAccount(34567821, "Aditya Goel", "IndusInd", "INDB0000371", "Pitmpura", 1000);
		CurrentAcount ca = new CurrentAcount(34567821, "Aditya Goel", "IndusInd", "INDB0000371", "Pitmpura", 0);

		Scanner sc = new Scanner(System.in);

		int option1 = 0, option2 = 0;

		while (option1 != 3) {
			while (option1 != 3) {
				System.out.println("Main Menu");
				System.out.println("1. Savings Account");
				System.out.println("2. Current Account");
				System.out.println("3. Exit");
				option1 = sc.nextInt();

				if (option1 == 1) {
					option2 = 0;
					while (option2 != 7) {
						System.out.println("Savings Account Menu");
						System.out.println("1. Check Account Details");
						System.out.println("2. Check Balance");
						System.out.println("3. Withdraw");
						System.out.println("4. Deposit");
						System.out.println("5. Change Pin");
						System.out.println("6. Generate New Pin");
						System.out.println("7. Exit");
						option2 = sc.nextInt();

						switch (option2) {
						case 1:
							System.out.println(sa.checkDetails());
							break;
						case 2:
							System.out.println(sa.checkBalance());
							break;
						case 3:
							System.out.println("Enter amount to withdraw:");
							double amt1 = sc.nextDouble();
							sa.withDraw(amt1);
							break;
						case 4:
							System.out.println("Enter amount to deposit:");
							double amt = sc.nextDouble();
							sa.deposit(amt);
							break;
						case 5:
							sa.changePin();
							break;
						case 6:
							sa.generateNewPin();
							break;
						case 7:
							System.out.println("Exiting Savings Menu...");
							break;
						default:
							System.out.println("Invalid option");
						}
					}
				} else if (option1 == 2) {
					option2 = 0;
					while (option2 != 7) {
						System.out.println("Current Account Menu");
						System.out.println("1. Check Account Details");
						System.out.println("2. Check Overdraft Limit");
						System.out.println("3. Withdraw");
						System.out.println("4. Deposit");
						System.out.println("5. Change Pin");
						System.out.println("6. Generate New Pin");
						System.out.println("7. Exit");
						option2 = sc.nextInt();

						switch (option2) {
						case 1:
							System.out.println(ca.checkDetails());
							break;
						case 2:
							System.out.println(ca.checkOverDraftLimit());
							break;
						case 3:
							System.out.println("Enter amount to withdraw:");
							double amt1 = sc.nextDouble();
							ca.withDraw(amt1);
							break;
						case 4:
							System.out.println("Enter amount to deposit:");
							double amt = sc.nextDouble();
							ca.deposit(amt);
							break;
						case 5:
							ca.changePin();
							break;
						case 6:
							ca.generateNewPin();
							break;
						case 7:
							System.out.println("Exiting Current Menu...");
							break;
						default:
							System.out.println("Invalid option");
						}
					}
				}
			}
		}
	}
}
