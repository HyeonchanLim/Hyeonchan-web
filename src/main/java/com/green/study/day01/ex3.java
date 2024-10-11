package com.green.study.day01;

public class ex3 {
    public static void main(String[] args) {
        int star = (int)(Math.random()*10+1);
        System.out.println(star);
        /*
        for (int i=star; i>0; i--){
            for (int j=1; j<=star; j++){
                System.out.print(j<i ? "" : "*");
            }
            System.out.println();
        }

         */

        // 랜덤  n 수에서 * 을 출력하는데 다음 회차에서 -1 씩 들어가도록 만들어라.

        for (int i = star ; i>0; i--) {
            System.out.print("".repeat(star-i));
            System.out.println("*".repeat(i));
        }
        System.out.println("----");

        // 랜덤  n 수를 추출하고 n 수 만큼 공백을 출력 , 다음 회차에서 +1씩 *이 들어가도록 하라.
        for (int i = star; i>0; i-- ) {
            // i = n 수에서 시작을 하고 0미만까지 반복실행하면 회차를 반복하면 -- 감소식을 진행한ㄷ
            for(int j = 0; j<star-i; j++){
                // i가 한번 실행할때 마다 j는 0부터 시작해서 j가 n-i만큼 반복하며 매번 ++ 증가식
                // 1회차 j=0 , 0 < (4-4) == 0 -> false 로 0 번 실행
                // 2회차 j=1 , 1 < (4-2) == 1 -> true 로 1번 실행
                // 2회차 j=2 , 2 < (4-1) == 2 -> true 로 1번 실행
                // 2회차 j=3 , 3 < (4-0) == 3 -> true 로 1번 실행
            System.out.print(" ");
                // j 가 반복할때 마다 " " 공백을 추가한다
            } // j가 커질수록 공백이 늘어난다
            for (int j = 0 ; j < i ; j++) {
                // 위의 j가 빠져 나오면 여기서 다시 시작하고 j는 0부터 시작 , i 미만까지 반복하며 매번 ++ 증가식
                // ex) 1회차에는 0부터 i는 5를 받았으면 5회 실행
                // 2회차에서는 j=0 , 0 < 4 true -> j++ 로 4번 실행
                // 3회차에서는 j=0 , 0 < 3 true -> j++ 로 3번 진행
                // 4회차에서는 j=0 , 0 < 2 true -> j++ 로 2번 진행
                // 5회차에서는 j=0 , 0 < 1 true -> j++ 로 1번 진행
                System.out.print("*");
                // j 가 실행될때마다 * 찍어내기
            }
        System.out.println();
            // 위의 j 2개 진행이 끝나면 개행이 이루어지고 i for 문이 다시 시작된다.
        }

        /*
        star = 4

        ****
         ***
          **
           *
        바깥쪽 for문 - 횟수 반복될수록 늘어남
        안쪽 for 문 - 횟수 반복될수록 줄어듬
        -> 바깥쪽 for문은 ++ , 안쪽 for문은 --
        -> 바깥쪽 for문 반복횟수는 star 까지 , i=0 이면 =<star i=1 이면 <star
        -> 안쪽 for문 j = 0 이면 j<=i
         */

    }
}

