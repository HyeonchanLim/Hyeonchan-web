package com.green.day15.ch18;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.*;
//패키지명은 대문자 사용 x , 클래스명은 대문자로 시작 & 마지막에 작성 + 메소드 있을 경우 클래스명.메소드명();

//p.402 예제
/*
d드라이브에 Simple.txt 파일을 만든다.

 */
public class IOExceptionCase3 {
    public static void main(String[] args) {
        try {
            md1();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("--end--");
    }
    public static void md1() throws IOException{
        md2();
    }
    public static void md2() throws IOException {
        Path path = Paths.get("D:/Simple.txt"); // 절대경로 (full 경로)
        BufferedWriter writer = Files.newBufferedWriter(path);
        /*
        1.newBufferedWriter 는  메소드
        2. static 메소드
        3. 리턴메소드 - 타입은 BufferedWriter
        4. 파라미터 타입은 path
        5. throws 메소드
         */
        writer.write('A');
        writer.write("hello");
        writer.close();
    }
}
