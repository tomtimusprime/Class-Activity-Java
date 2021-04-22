package com.company;

import java.lang.reflect.Constructor;

public class BankAccount {
    private long AccountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phone;

    public BankAccount() {
        System.out.println("Empty constructor called.");
    }

    public long getAccountNumber() {
        return AccountNumber;
    }

    public double getBalance() {
        return balance;
    }
    public String getCustomerName() {
        return customerName;
    }
    public String getEmail() {
        return email;
    }
    public String getPhoneNumber() {
        return phone;
    }

    public void setAccountNumber(long AccountNumber) {
        this.AccountNumber = AccountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String name) {
        this.customerName = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void depositFunds(double deposit) {
        balance += deposit;
        System.out.println(deposit + " USD was deposited into your bank");
        System.out.println("Your new balance is: " +balance);
    }

    public void withdrawlFunds(double withdrawl) {
        if(withdrawl > balance) {
            System.out.println("Not enough funds");
            return;
        }
        balance -= withdrawl;
        System.out.println(withdrawl + " USD was withdrawn from your account.");
        System.out.println("Your new balance is " + balance);
    }
}
