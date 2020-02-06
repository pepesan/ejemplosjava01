package com.ejemplos.clases;

import lombok.Data;

public class ClassBuilder{
    @Data
    public static class BankAccount {
        private long accountNumber; //This is important, so we'll pass it to the constructor.
        private String owner;
        private String branch;
        private double balance;
        private double interestRate;


        //Fields omitted for brevity.
        private BankAccount() {
            //Constructor is now private.
        }
        //Getters and setters omitted for brevity.
    }
    public static class Builder {
        private long accountNumber; //This is important, so we'll pass it to the constructor.
        private String owner;
        private String branch;
        private double balance;
        private double interestRate;
        public Builder(long accountNumber) {
            this.accountNumber = accountNumber;
        }
        public Builder withOwner(String owner){
            this.owner = owner;
            return this;  //By returning the builder each time, we can create a fluent interface.
        }
        public Builder atBranch(String branch){
            this.branch = branch;
            return this;
        }
        public Builder openingBalance(double balance){
            this.balance = balance;
            return this;
        }
        public Builder atRate(double interestRate){
            this.interestRate = interestRate;
            return this;
        }
        public BankAccount build(){
            //Here we create the actual bank account object, which is always in a fully initialised state when it's returned.
            BankAccount account = new ClassBuilder.BankAccount();  //Since the builder is in the BankAccount class, we can invoke its private constructor.
            account.accountNumber = this.accountNumber;
            account.owner = this.owner;
            account.branch = this.branch;
            account.balance = this.balance;
            account.interestRate = this.interestRate;
            return account;
        }
    }
    public static void main(String[] args) {
        // old school
        BankAccount account = new BankAccount();
        account.setAccountNumber(1234L);
        account.setOwner("Marge");
        account.setBranch("Springfield");
        account.setBalance(100);
        account.setInterestRate(2.5);
        // manera builder
        account = new ClassBuilder.Builder(1234L)
                .withOwner("Marge")
                .atBranch("Springfield")
                .openingBalance(100)
                .atRate(2.5)
                .build();
        /*
        BankAccount anotherAccount = new ClassBuilder().Builder(4567L)
                .withOwner("Homer")
                .atBranch("Springfield")
                .openingBalance(100)
                .atRate(2.5)
                .build();

         */
    }
}