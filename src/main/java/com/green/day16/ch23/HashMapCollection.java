package com.green.day16.ch23;

import java.util.*;

public class HashMapCollection {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        // < key , value > -> key 를 꺼내면 value가 나옴
        map.put("홍길동" , "시계");
        map.put("권혜지" , "자바책");
        map.put("이정민" , "빈 캔");
        map.put("1" , "ㅋㅋ");
        map.put("홍길동" , "두 번째 시계");
        // 같은 키 값으로 두번 작성하면 덮어쓰기 되어서 마지막에 덮어쓰기한 value가 나옴

        System.out.println(map.keySet()); // key값 얻을 때 사용
        String v = map.get("홍길동");
        System.out.println("v : " + v);
        System.out.println(map.get("권혜지"));
        System.out.println(map.get("김수지")); // key 값 - 김수지 없어서 null 로 나옴
        String v2 = map.get("이정민");
        System.out.println("v2 : " + v2);
    }
}

