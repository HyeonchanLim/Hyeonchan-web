package com.green.day06.ch07;

public class PassingRef {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();

        ba.deposit(1000);

        BankAccount ba2 = ba;
        check(ba);
        //
        // void , return
        // static , non-static
    }
    static void check(BankAccount ba){
        ba.checkMyBalance();
    }
}
