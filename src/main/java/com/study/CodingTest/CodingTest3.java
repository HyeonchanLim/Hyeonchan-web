package com.study.CodingTest;

public class CodingTest3 {
    class Solution {
        public int solution(int[] numbers) {
            int answer = 0;
            int max = 0;
            int tmp = 0;

            for (int i=0; i<numbers.length; i++){
                if(max < numbers[i]){
                    tmp = max;
                    max = numbers[i];
                } else if (tmp < numbers[i]){
                    tmp = numbers[i];
                }
                answer = max * tmp;
            }
            return answer;

            /*
            Arrays.sort(numbers); // 배열을 오름차순으로 정렬합니다.
            return numbers[numbers.length-1]*numbers[numbers.length-2];
            // 오름차순 정렬하고 제일 큰 값 * 두 번째로 큰 값
             */
        }
    }
}
