package com.company;

public class Main {

    public static void main(String[] args) {
	    BankAccount account = new BankAccount();
	    account.setBalance(100.00);
	    account.depositFunds(50.00);
	    account.withdrawlFunds(25.00);
    }
}
