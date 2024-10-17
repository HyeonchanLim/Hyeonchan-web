package com.green.day08.ch11;

public class Mission11_2 {
    public static void main(String[] args) {
        /*
        다음 주민등록 번호의 중간에 삽입된 - 를 지우고 공백으로 채워서 출력하는 프로그램을 작성해봐
        StringBuilder 클래스를 활용하여 빈번한 문자열 생성이 발생하지 않도록 해야 한다.

        990925-101299
         */

        StringBuilder sb = new StringBuilder("990925-101299");
        String str = sb.toString();
        String strResult = str.replace("-"," "); // stringbuilder 를 문자열로 바꾸고 strresult에 저장
        System.out.println("strResult : " + strResult);

        sb.replace(6,7," ");
        System.out.println(sb.toString());
        // sb 로 출력하면 sb의 객체 주소값은 참조해서 출력 , tostring 으로 출력하면 문자열로 바꿔서 출력
        // 여기서 sb로 뽑으면 참조해서 추가 변경 가능하고 tostring 붙이면 개조 불가
        int dashIdx = sb.indexOf("-");
        System.out.println("dashIdx:"+dashIdx);
        sb.replace(dashIdx,dashIdx+1," ");
        System.out.println(sb);
    }
}
