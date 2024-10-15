package com.green.day06.ch07;

public class BankAccountTest {
    public static void main(String[] args) {
        //ba는 BankAccount 객체 주소값만 담을 수 있는 참조변수이다.
        BankAccount ba = new BankAccount();

        ba.deposit(1000);
        ba.checkMyBalance(); // deposit += 계산으로 1000출력
        ba.deposit(2000);
        ba.checkMyBalance();// deposit += 계산으로 1000 + 2000 = "3000"출력

        BankAccount ba3 = new BankAccount();
        //새로운 객체 BankAccount 생성하여 ba3에 저장 , BankAccount 클래스에 만든 값을 기준으로 만들고 ba3 라는 새로운 주소를 생성
        ba3.checkMyBalance(); //  BankAccount 클래스에 int balance = 0; 으로 초기화값을 만들어놨기 때문에 0으로 출력
        ba3.deposit(40000); // += 40000
        ba3.withdraw(1000); // 40000 -= 1000 -> 39000출력
        ba3.checkMyBalance(); // 위에서 deposit , withdraw 로 계산되고 저장된 값인 39000이 출력되어 나옴


        // BankAccount ba2 = new String("안녕");
        String str = new String("안녕");
    }
}
