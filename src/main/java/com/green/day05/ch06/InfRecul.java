package com.green.day05.ch06;

public class InfRecul {
    public static void main(String[] args) {
        showHi(3);
    }

    public static void showHi ( int cnt) {
        System.out.println("Hi~~");
        if (cnt == 1) {
            return;
        }
        //showHi(cnt--); <- -- 감소식이 안돌아가서 n이 3으로 계속 찍힘
        //showHi(--cnt); <-- 감소식을 뒤에 붙이지 말고 앞에
        showHi(cnt - 1);
    }

}
