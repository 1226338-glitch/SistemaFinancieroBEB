package com.sistemasfinancieros.dao;

import java.util.List;
import java.util.ArrayList;

public class AccountDAO {
    private List<Account> accounts = new ArrayList<>();

    // Get a list of accounts for a specific client
    public List<Account> getAccountsByClient(int clientId) {
        List<Account> clientAccounts = new ArrayList<>();
        for (Account account : accounts) {
            if (account.getClientId() == clientId) {
                clientAccounts.add(account);
            }
        }
        return clientAccounts;
    }

    // Get account by account ID
    public Account getAccountById(int accountId) {
        for (Account account : accounts) {
            if (account.getId() == accountId) {
                return account;
            }
        }
        return null; // Return null if not found
    }

    // Create new account
    public void createAccount(Account account) {
        accounts.add(account);
    }

    // Update account balance
    public void updateAccountBalance(int accountId, double newBalance) {
        Account account = getAccountById(accountId);
        if (account != null) {
            account.setBalance(newBalance);
        }
    }

    // Close an account
    public void closeAccount(int accountId) {
        Account account = getAccountById(accountId);
        if (account != null) {
            accounts.remove(account);
        }
    }
}

class Account {
    private int id;
    private int clientId;
    private double balance;

    // Getters and Setters for Account fields
    public int getId() { return id; }
    public int getClientId() { return clientId; }
    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }
}