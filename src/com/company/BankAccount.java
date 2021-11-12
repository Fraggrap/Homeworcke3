package com.company;

public class BankAccount {
    private double  amount;
    public void  deposit(double sum ){
        amount=amount+sum;
    }
    public  int   withDraw(int sum) throws LimetException.LimitExcption {
        if (amount < sum){
            throw new LimetException.LimitExcption("В вашем балансе недостаточно средств ",getAmount() );
        }
        amount=amount-sum;
        return  sum;
    }
    public double getAmount() {
        return amount;
    }
}



