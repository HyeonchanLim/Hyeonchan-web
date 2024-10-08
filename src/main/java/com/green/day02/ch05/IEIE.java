package com.green.day02.ch05;

public class IEIE {
    public static void main(String[] args) {
        int n = 120;

        if(n < 0) {
            System.out.printf("%d는 0 미만\n" , n);
        } else if (n <50 ) {
            System.out.printf("%d는 50 미만\n" , n);
        } else if (n < 100) {
            System.out.printf("%d는 100 미만\n" , n);
        } else {
            System.out.printf("%d는 100 이상\n" , n);
        }
        /*
        if - else if - else 전부 if의 그룹이고 이 중에서 조건에 해당하는거 하나만 실행
        else if 갯수 제한은 없고 추가하고 싶은 조건을 계속 추가 가능
        맨 위에서부터 조건이 true가 되면 실행이 되고 빠져나온다.
        조건문에 해당하는게 없으면 마지막에 있는 else가 실행되고 else가 없다면 실행되는거 없이 빠져나온다.
        else 는 있어도 되고 없어도 된다.
         */
    }
}
