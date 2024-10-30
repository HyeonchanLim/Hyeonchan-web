package com.green.day16.ch26;

import java.util.function.BiPredicate;

public class BiPredicateDemo {
    public static void main(String[] args) {
        // 특정 문자열의 길이가 내가 정한 정수값 보다 크면 true , 아니면 false
        BiPredicate<String , Integer> conv = (str , len) ->  str.length() > len;

        System.out.println(conv.test("Robot",3)); // true
        System.out.println(conv.test("Box",5)); // false


    }
}


