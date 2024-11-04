package com.study.CodingTest;

public class CodingTest4 {
    class Solution {
        public int solution(String str1, String str2) {
            int answer = 0;

            answer = str1.contains(str2) ? 1 : 2 ;
            // str1.contains(str2) 여기 부분에서 값을 비교하기 때문에 true false 부분이 들어감
            // 그래서 삼항식을 연결하고 값을 answer 에 저장 가능하다.
            return answer;
            //return answer(str1.contains(str2) ? 1 : 2); 이렇게 한번에도 가능
        }
    }
}
