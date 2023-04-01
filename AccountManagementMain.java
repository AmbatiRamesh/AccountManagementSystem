package com.bridgelabz;
public class AccountManagementMain  {
    public static void main(String[] args) {
        System.out.println("------Welcome to Account Management System------");
        AccountManagement accountManagement= new AccountManagement();
        accountManagement.addAccountDetails();
        accountManagement.displayAccountDetails();

    }
}

