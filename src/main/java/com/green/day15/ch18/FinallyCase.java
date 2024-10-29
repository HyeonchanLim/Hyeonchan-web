package com.green.day15.ch18;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FinallyCase {
    public static void main(String[] args) {
        //만약 BufferedWriter writer = Files.newBufferedWriter(path); 이때는 문제가 없었고
        //writer.write("hello"); 이때 예외가 발생이 되었다면
        //writer.close(); 이 문장이 실행이 되지 않는다.
        //그런데 writer.close(); 이 문장이 무조건 실행이 되어야 한다.
        try {
        Path path = Paths.get("D:/Simple.txt"); // 절대경로 (full 경로)
        BufferedWriter writer = Files.newBufferedWriter(path);
        writer.write("hello");
        writer.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

class FinallyCase2 {
    // writer.close 무조건 실행 되도록
    public static void main(String[] args) {
        BufferedWriter writer = null;
        try {
        Path path = Paths.get("D:/Simple.txt"); // 절대경로 (full 경로)
        writer = Files.newBufferedWriter(path);
        writer.write("hello");
        } catch (IOException e){
            e.printStackTrace();
        }
        try {
        writer.close();
        } catch (IOException e){

        }
        System.out.println("----");
    }
}
class FinallyCase3 {
    public static void main(String[] args) {
        BufferedWriter writer = null;
        try {
            Path path = Paths.get("D:/Simple.txt"); // 절대경로 (full 경로)
            writer = Files.newBufferedWriter(path);
            writer.write("hello");
            return;
        } catch (IOException e){
            e.printStackTrace();

        } finally { // finally -> 예외가 발생하든 안하든 무조건 실행되는 부분 , 위에 return있더라도 finally를 실행하고 return
            //위의 try - catch 에서 close 해서 종료하더라도 finally 있으면 무조건 실행
            System.out.println("return 있더라도 finally 있어서 실행함");
            try {
                if(writer != null) {
                    //writer가 null이 아닐 경우에만 close()를 호출해 NullPointerException을 방지
                    writer.close();
                }
            } catch (IOException e) {

            }
        }
    }
}
