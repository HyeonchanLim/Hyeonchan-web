package com.study.CodingTest;

import java.util.Arrays;

public class ArraySum {
    public double solution(int[] numbers)  {
        return Arrays.stream(numbers).average().orElse(0);
    }
}
