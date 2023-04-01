package com.bridgelabz;
import java.util.Scanner;
public class AccountManagement extends Account {
    Scanner scanner = new Scanner(System.in);
    Account account = new Account();
    public AccountManagement(String accountHolderName,int accountNumber, long accountHolderDob, long accountHolderMobileNumber, String accountHolderEmail) {
        super(accountHolderName,accountNumber, accountHolderDob, accountHolderMobileNumber, accountHolderEmail);
    }
    public AccountManagement() {
        super();
    }
    public void addAccountDetails() {
        System.out.println("Enter Account Holder Name: ");
        String accountHolderName = scanner.nextLine();
        account.setAccountHolderName(accountHolderName);
        System.out.println("Enter Account Number: ");
        int accountNumber = scanner.nextInt();
        account.setAccountNumber(accountNumber);
        System.out.println("Enter Account Holder Date Of Birth: ");
        long accountHolderDob = scanner.nextLong();
        account.setAccountHolderDob(accountHolderDob);
        System.out.println("Enter Account Holder Mobile Number: ");
        long accountHolderMobileNumber = scanner.nextLong();
        account.setAccountHolderMobileNumber(accountHolderMobileNumber);
        System.out.println("Enter Account Holder Email: ");
        String accountHolderEmail = scanner.next();
        account.setAccountHolderEmail(accountHolderEmail);
    }
    public void displayAccountDetails() {
        System.out.println("Account Holder Name: "+account.getAccountHolderName());
        System.out.println("Account Number: "+account.getAccountNumber());
        System.out.println("Account Holder Date Of Birth: "+ " "+account.getAccountHolderDob());
        System.out.println("Account Holder Mobile number: "+" "+account.getAccountHolderMobileNumber());
        System.out.println("Account Holder Email: "+" "+account.getAccountHolderEmail());
        }
    }

