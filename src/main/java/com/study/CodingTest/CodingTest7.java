package com.study.CodingTest;

public class CodingTest7 {
    class Solution {
        public String solution(String my_string, int n) {
            StringBuilder answer = new StringBuilder();
            for (int i = 0; i < my_string.length(); i++) {
                char ch = my_string.charAt(i);
                for (int j = 0; j < n; j++) {
                    answer.append(ch);
                }
            }
            return answer.toString();
        }
    }
}