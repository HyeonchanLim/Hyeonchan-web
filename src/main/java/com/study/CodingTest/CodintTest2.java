package com.study.CodingTest;

public class CodintTest2 {
    class Solution {
        public int solution(int n) {
            int answer = 0;
            String a = Integer.toString(n); // 정수를 문자열로 전환
            for(int i=0; i<a.length(); i++){
                answer += a.charAt(i)-'0'; // 각 자리 숫자를 정수로 변환하여 더함
                // ex) '1' = ascii 49 , '0' = ascii 48 -> 정수 1 출력
            }
            /*
            while(n>0){
            answer+=n%10;
            ex) 123 -> 1의 자리인 3을 찾아서 answer 에 저장
            n/=10;
            123 -> 12로 바꿔서 3이 있던 1의 자리를 바꿈
        }

             */

            return answer;
        }
    }
}
