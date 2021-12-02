package com.company;

public class BankAccount {
    double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        amount = sum + amount;
    }

    public void withDraw(int sum) throws LimitException {
        if (sum > amount) {
            throw new LimitException("ваш баланс близок к нулю");
        }
        System.out.println(amount = amount - sum);
    }
}
