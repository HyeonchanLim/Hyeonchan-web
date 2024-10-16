package com.green.day07.ch11;

public class StringStudy {
    public static void main(String[] args) {
        String str1 = "Coffee";
        String str2 = "Bread";

        String str3 = str1.concat(str2);
        System.out.println(str3);

        String str4 = str2.concat(str1);
        System.out.println("str1 : "+str1);
        System.out.println("str2 : "+str2);
        System.out.println(str4);

        String str5 = str1 + str2;
        System.out.println(str5);

        System.out.println("-------");

        String str6 = "abcedfghijklmn";
        System.out.println("str6.substring(3)" + str6.substring(3));
        // str6 번에서 3번째 이후 문자열을 새로 뽑아서 출력하고 리턴
        // 파일명에서 확장자 추출할때 사용 ex) ???.jpeg -> 4번째 . 이후 jpeg
        System.out.println("str6.substring(4,7)" + str6.substring(4,7)); // 7전까지 , 7-4 = 3 자리 추출

        String fileNm = "nice_Very.Nice.jpg";
        System.out.println(".의 위치값: " + fileNm.indexOf("."));
        // 왼쪽에서 가장 먼저 일치하는 index값을 리턴
        System.out.println("마지막 .의 위치값: " + fileNm.lastIndexOf("."));
        // 왼쪽에서 가장 마지막 일치하는 index값을 리턴


        System.out.println("--------");

        String str7 = "LExi";
        String str8 = "Lexi";
        System.out.println(str7.equals(str8));
        System.out.println(str7.compareTo(str8));
        System.out.println(str8.compareTo(str7));
        System.out.println(str7.compareTo("LExi")); // 같은 문자열이면 0으로 출력
        System.out.println(str7.equalsIgnoreCase(str8)); // 대소문자 구분 없이 같은지

        System.out.println("--------");

        int n = 10;
        String str9 = n + "";
        String str10 = String.valueOf(n); //valueof에 오버로딩으로 모든 타입이 잇어서 String으로 전부 변경할 수 있다.

    }
}
