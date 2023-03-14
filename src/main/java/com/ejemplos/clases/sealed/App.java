package com.ejemplos.clases.sealed;

/**
 * Hello world!
 *
 */
public class App
{

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Account account = new Account();
        SavingsAccount savingsAccount = new SavingsAccount();
        CheckingAccount checkingAccount = new CheckingAccount();
    }
}
