package com.green.day02;

public class PrintFormat {
    public static void main(String[] args) {
        /*
        문자열 사이에 변수의 값을 주입하고 싶을 때 사용
         */
        String name = "홍길동";
        int age = 22;
        float height= 172.5f;
        char bloodType = '0';
        boolean isMan = true;

        // 홍길동 나이 - 22 , 키 - 172.5cm , 혈액형 - o형 , 성별은 남자 입니까? true

        System.out.println(name + "의 나이는"+ age + "살 키는 " + height + "cm 혈액형은 " + bloodType + " 형입니다. 그는 남자입니까?" + isMan);
        System.out.printf("%s 의 나이는 %d 살 키는 %f cm 혈액형은 %c 형입니다 그는 남자입니까? %b\n" , name , age , height , bloodType , isMan);

        System.out.printf("키는 %.1f\n" , height);
        System.out.printf("키는 %012.1f\n" , height);
        // 12.1f 에서 12는 공백 자리를 포함한 12자리 출력
        // 012.1f 에서 012는 공백 자리를 0으로 표기해서 12자리를 화면에 출력
        // 0.111 f 는 소수점 자리 표기 -> 00000172.500

        int won = 230000000;
        System.out.printf("won : %d원\n" , won);
        System.out.printf("won : %,d원\n" , won); // 3자리 마다 , 표기
        System.out.printf("won : %12d원\n" , won); // 12자리 표기 , 공백은 앞으로
        System.out.printf("won : %-12d원\n" , won); // 12자리 표기 , 공백은 뒤로

        String result = String.format("%,d" , won); // printf %d 와 같은 기능
        System.out.println("result: " + result);
    }
}
