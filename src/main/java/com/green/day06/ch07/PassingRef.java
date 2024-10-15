package com.green.day06.ch07;

public class PassingRef {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();

        ba.deposit(1000);

        BankAccount ba2 = ba;

        ba2 = null; // null의 의미는 객체를 가르키고 있지 않다. 주소값 없음
        if (ba2 != null) {
            ba2.checkMyBalance();
        }
            // 여기서 if없이 호출하면 null 때문에 NullPointException 에러가 발생됨.
        ba2 = new BankAccount(); // 위에서 null 해놔도 다시 주소값 주면 사용 가능함.

        check(ba);
        // 메소드명 dd = new 메소드명();
        // dd.check(ba);
        // void check 이렇게 사용하면 BankAccount 를 객체화 시켜줘야함
        // void , return
        // static , non-static
    }
    static void check(BankAccount ba){
        ba.checkMyBalance();
    }
}
