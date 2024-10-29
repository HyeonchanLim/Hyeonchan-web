package com.green.day15.ch18;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionCase5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        try {
            System.out.print("a/b ... a?");
            int n1 = scan.nextInt();
            System.out.print("a/b ... b?");
            int n2 = scan.nextInt();

            System.out.printf("%d / %d = %d\n " ,n1 , n2 , n1/n2);
        } catch (InputMismatchException | ArithmeticException e){ // | 사용해서 다중 catch 가능
            e.printStackTrace(); // InputMismatch 발생
            System.out.println(e.getMessage()); // 기본값 null
        }
        System.out.println("--------");


        try {
            System.out.print("a/b ... a?");
            int n1 = scan.nextInt();
            System.out.print("a/b ... b?");
            int n2 = scan.nextInt();

            System.out.printf("%d / %d = %d\n " ,n1 , n2 , n1/n2);
        } catch (Exception e){ // Exception -> 모든 예외처리의 상위 부모
            e.printStackTrace(); // InputMismatch 발생
            System.out.println(e.getMessage()); // 기본값 null
        }
        System.out.println("----------");


        try {
            System.out.print("a/b ... a?");
            int n1 = scan.nextInt();
            System.out.print("a/b ... b?");
            int n2 = scan.nextInt();

            System.out.printf("%d / %d = %d\n " ,n1 , n2 , n1/n2);
        } catch (InputMismatchException e){
            e.printStackTrace(); // InputMismatch 발생
            System.out.println(e.getMessage()); // 기본값 null
        } catch (ArithmeticException e){
            e.printStackTrace(); // InputMismatch 발생
            System.out.println(e.getMessage()); // 기본값 null
        } catch (Exception e){
            // Exception(상단에 작성) + 다른 catch 문 사용하면 에러 발생 -> 항상 다른 catch 문 사용 시 Exception은 가장 마지막으로
            // Throwable(최상위 부모) 사용 가능하나 catch 문에서 Exception 이 붙어 나와서 Exception 연결해서 쓰는거 추천
            e.printStackTrace(); // InputMismatch 발생
            System.out.println(e.getMessage()); // 기본값 null
        }



        System.out.println("==end==");
    }
}
