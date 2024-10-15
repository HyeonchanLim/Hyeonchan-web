package com.green.day06.ch07;

public class BankAccount {
    int balance = 0;

    void deposit (int amount){
        balance += amount;
    }
    /*
    void 타입 deposit 메소드 - 정수타입 amount 변수 정의
    BankAccount 메소드의 balance 변수에 잇는 정수를 가져와서 amount 에 값을 넣고 += 계산 후 balance 에 저장
     */
    void  withdraw(int amount){
        balance -= amount;
    }
    /*
    deposit 처럼 -= 계산 후 balance 에 저장
     */

    void checkMyBalance (){
        System.out.printf("balance : %d\n" , balance);
        // amount 에서 계산하고 balance에 저장된 값을 가져와서 출력

    }
}
