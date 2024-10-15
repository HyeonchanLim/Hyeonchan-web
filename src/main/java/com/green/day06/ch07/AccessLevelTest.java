package com.green.day06.ch07;

import com.green.day06.ch09.InfoHideCircle; // 다른 패키지에 있는 클래스면 import 를 하여 사용한다.

public class AccessLevelTest {
    public static void main(String[] args) {
        InfoHideCircle ihc = new InfoHideCircle(); // import 를 하고 사용하면 똑같지 않은 패키지라도 사용이 가능함.
        // InfoHideCircle 는 public 이기 때문에 다른 패키지에서 사용 가능

        String str = "String 은 자주 사용해서 자동으로 import가 된다.";

        // Circle2 c = new Circle2();
        // class Circle2 는 ch09에 있어서 패키지가 다르므로 접근 불가능하다.
        // class 키워드 앞에 public 을 붙일 수 있는 경우는 java 파일명과 class 명이 일치할 때만 붙일 수 있다. 나머지는 불가능함



    }
}
