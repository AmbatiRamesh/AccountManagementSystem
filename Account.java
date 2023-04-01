package com.bridgelabz;

public class Account {
    private String accountHolderName;
    private int accountNumber;
    private long accountHolderDob;
    private long accountHolderMobileNumber;
    private String accountHolderEmail;
    public Account(String accountHolderName,int accountNumber, long accountHolderDob, long accountHolderMobileNumber,
                   String accountHolderEmail) {
        super();
        this.accountHolderName = accountHolderName;
        this.accountNumber=accountNumber;
        this.accountHolderDob = accountHolderDob;
        this.accountHolderMobileNumber = accountHolderMobileNumber;
        this.accountHolderEmail = accountHolderEmail;
    }

    public Account() {

    }

    public String getAccountHolderName() {
        return accountHolderName;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }
    public long getAccountHolderDob() {
        return accountHolderDob;
    }
    public void setAccountHolderDob(long accountHolderDob) {
        this.accountHolderDob = accountHolderDob;
    }
    public long getAccountHolderMobileNumber() {
        return accountHolderMobileNumber;
    }
    public void setAccountHolderMobileNumber(long accountHolderMobileNumber) {
        this.accountHolderMobileNumber = accountHolderMobileNumber;
    }
    public String getAccountHolderEmail() {
        return accountHolderEmail;
    }
    public void setAccountHolderEmail(String accountHolderEmail) {
        this.accountHolderEmail = accountHolderEmail;
    }
}
