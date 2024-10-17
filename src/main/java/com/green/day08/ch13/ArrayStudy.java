package com.green.day08.ch13;

public class ArrayStudy {
    /*
    배열은 같은 타입의 여러 데이터를 묶어서 저장하기 위해 사용
    배열을 사용하지 않는다면 데이터 수만큼 변수를 만들어야 한다.

    만약 100개의 정수값을 저장 한다면 변수 선언은 100번 해야한다.
    ex) int n1, n2 ,n3 .... n100;

    배열을 사용하면 여러데이터를 편하게 저장하고 가져올 수 있다. (read/write)

    배열 만드는 방법
    int[] 변수명 = new int [100]; // 100개의 정수값을 저장할 수 있는 공간을 만들었다.
    String[] 변수명 = new String[100]; // 100개의 문자열 저장 공간 생성

    int[] 변수명 말고 int 변수명[] 도 가능하지만 int[]로 사용하는걸 추천

    int[] arr; 가 의미하는건 int 배열(객체)의 주소값만 저장 가능하고 다른 타입은 불가능

    new int[100]; int 형의 공간이 100개 생성 , 각 공간에는 int 값만 저장
    new String[100]; String 형의 공간 100개 생성  , String 값만 저장

    배열 쓰기
    int[] arr = new int[10];
    arr[0] = 10; // 첫번째 공간에 10을 대입 , 공간번호(index)는 0부터 시작
    arr[1] = 20; // 두번째 공간에 20을 대입
    arr[9] = 100; // 마지막 공간에 100을 대입
    초기화하지 않은 공간은 디폴트값이 들어간다. ex int - 0 , boolean - false , reference타입 - null

    배열 읽기
    System.our.println(arr[0]); // 10
    System.our.println(arr[9]); // 100

    arr.length 는 자신의 공간 크기값을 저장한 정수 상수
    어떤 크기의 배열이든 마지막 공간의 값을 사용하고 싶을 때는 arr[arr.length-1] 이렇게 사용

    [배열 생성과 동시에 초기화]
    int[] arr2 = { 1, 2, 3, 4, 5};
    int[] arr3 = new int[] {1, 2, 3, 4, 5};
    메소드에 파라미터로 방금 만든 배열을 보내고 싶을 때 사용
    메소드명({1,2,3}) 이렇게 호출은 불가능 -> type 안적혀져 잇어서
    그치만 우회가 가능

    int[] arr={1, 2, 3};
    메소드명(arr); // 이렇게 가능

    배열과 반복문(for)의 궁합이 좋다. 대부분 함께 쓰인다.
     */
}
