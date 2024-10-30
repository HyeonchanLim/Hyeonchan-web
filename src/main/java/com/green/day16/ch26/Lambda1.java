package com.green.day16.ch26;

public class Lambda1 {
    public static void main(String[] args) {
        PrintableVer2 p = (String) -> System.out.println(String);
        PrintableVer2 p2 = (s) -> System.out.println(s);
        PrintableVer2 p3 = s -> System.out.println(s); // 파라미터가 하나일 경우 앞에 () 소괄호 생략 가능 0

        p.print("haha");
        p2.print("haha2");
        p3.print("haha3");

        Calc sumCalc = (n1 , n2) -> n1 + n2; //뒤에 () 중괄호 생략시 return 도 생략 가능
        System.out.println(sumCalc.calc(5,8));
        System.out.println(sumCalc.calc(2,3));

        Calc minusCalc = (n1 , n2) -> {return  n1 - n2;};
        System.out.println(minusCalc.calc(10,7));
        System.out.println(minusCalc.calc(100,13));

    }
}

@FunctionalInterface
interface PrintableVer2 {
    void print (String str);
}

@FunctionalInterface
interface Calc {
    int calc(int n1 , int n2);
}
