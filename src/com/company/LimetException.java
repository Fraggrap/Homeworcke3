package com.company;

public class LimetException {

    public static class LimitExcption extends Exception {
        private double  remainingAmount;
        public LimitExcption(String message, double remainingAmount) {
            super(message);
            this.remainingAmount = remainingAmount;
        }
        public double getRemainingAmount() {
            return remainingAmount;
        }
    }



}
