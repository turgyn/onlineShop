package com.example.task5.entities;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="accounts")
public class Account {

    @Id
    private String username;
    @NotBlank
    private String password;
    @Min(value = 0, message = "Balance should be positive value")
    private int balance;

    public Account() {}

    public Account(String username) {
        this.username = username;
    }

    public Account(String username, String password, int balance) {
        this.username = username;
        this.password = password;
        this.balance = balance;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", balance=" + balance;
    }
}
