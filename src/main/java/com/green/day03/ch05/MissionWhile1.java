package com.green.day03.ch05;

public class MissionWhile1 {
    public static void main(String[] args) {
        int n = 1;
        int j = 0;

        while (n < 100) { // 1~99까지 n의 반복 출력 조건식
            j = j + n++; // i + n++ -> 위의 조건이 true 면 n이 계속 증가하고 증가하는 값은 i에 누적 합산
            // i += n++; 복합식으로 작성도 가능
        }
        System.out.println("합계 :" + j); // 조건식에서 100이 되면 빠져나오고 i 에는 누적 합산된 결과값을 출력
    }
}
