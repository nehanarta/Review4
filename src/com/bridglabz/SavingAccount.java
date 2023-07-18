package com.bridglabz;

import java.util.Scanner;

//Write a Java program to create an abstract class BankAccount with abstract methods deposit() and withdraw().
    //    Create subclasses: SavingsAccount and CurrentAccount that extend the BankAccount class and
       // implement the respective methods to handle deposits and withdrawals for each account type.
abstract class BankAccount {
    public abstract void deposit();
    public abstract void withdraw();


}
public class SavingAccount extends BankAccount {
    Scanner sc=new Scanner(System.in);


    @Override
    public void withdraw() {
       int withdraw=sc.nextInt();
       int balance=sc.nextInt();
       if(balance>=withdraw){
           balance=balance-withdraw;
           System.out.println(balance);
       }

    }

    @Override
    public void deposit() {
        int amount=sc.nextInt();
        int balance=sc.nextInt();
        balance=balance + amount;
        System.out.println(balance);


    }
}
class CurrentAccount extends BankAccount{
Scanner sc=new Scanner (System.in);
    @Override
    public void deposit() {
       int amount=sc.nextInt();
       int balance=sc.nextInt();
       balance=balance+amount;
        System.out.println("Current balance is"+balance);


    }

    @Override
    public void withdraw() {
        int withdrawMoney=sc.nextInt();
        int balance=sc.nextInt();
        balance=balance+withdrawMoney;
        System.out.println("collect Money"+balance);

    }
}
