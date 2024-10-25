package com.green.day08.ch11;

public class BuildString {
    //264~269p 참조
    public static void main(String[] args) {
        StringBuilder sb3 = new StringBuilder("123");
        sb3.append(456789).delete(0,2).replace(0,3,"kk");
        // 같은 주소값의 메소드에서 return this가 각각 들어가서 호출 계속 가능
        System.out.println("sb3 : " + sb3);

        // 문자열 "123"이 저장된 인스턴스 생성
        StringBuilder sb = new StringBuilder("123");
        sb.append("45678"); // append : + 문자열 추가하고 싶을 때 사용

        System.out.println(sb);

        sb.delete(0,2); // index 0부터 2전까지 ex)
        System.out.println(sb);

        //미니 미션
        // 모든 문자열을 지우는 방법
        sb.delete(0,sb.length());
        System.out.println(sb);

        sb.insert(0,"1");
        System.out.println(sb);
        System.out.println("---");

        sb.append("345678");
        System.out.println("sb :" + sb);

        sb.replace(0,3,"AB"); // replace 시작점 ~ 끝지점 까지의 값을 str "????" 값으로 변경
        String str = sb.toString(); // StringBuilder 에서 string 타입으로 변경
        System.out.println("sb : " + sb);
        System.out.println("str : " + str); //
        System.out.println("====");
        sb.reverse();
        System.out.println("sb: " + sb);

        StringBuilder sb2 = sb.reverse().replace(0,2,"kk");
        // 체이닝 기법 , 각 메소드에서 return this;가 핵심 .메소드(호출) 계속 가능 , 같은 주소값이면
        System.out.println("sb == sb2:" + (sb==sb2)); // 같은 객체 주소값

    }
}
