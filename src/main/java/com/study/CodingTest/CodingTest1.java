package com.study.CodingTest;

/*
첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1, 두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어집니다.
두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
 */

public class CodingTest1 {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {

        int lcm = denom1 * denom2; // 공통 분모
        int gcd = (numer1 * denom2) + (numer2 * denom1); // 공통 분자
        int max = 0; // 최대값
        // for문을 통해서 i로 나눴을 때 나머지 값이 0 인 denom , numer 를 구해야함
        for (int i=1; i<=lcm && i<= gcd; i++){
            if(lcm % i == 0 && gcd % i == 0){
                max = i;
            }
        }
        lcm = lcm / max;
        gcd = gcd / max;

        int[] answer = {lcm , gcd};



        return answer;
    }
}