package com.study.CodingTest;

class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        int x = dot[0];
        int y = dot[1];
        if (x>0 && y>0){
            answer = 1;
        } else if (x<0 && y>0) {
            answer = 2;
        } else if (x<0 && y<0) {
            answer = 3;
        } else if (x>0 && y<0){
            answer = 4;
        }
        return answer;
    }
    public int solution1(int[] dot) {
        int answer = 0;
        int x = dot[0];
        int y = dot[1];

        if (x>0){
            answer = (y>0 ? 1 : 4);
        } else {
            answer
        }
        return answer;
    }
}


