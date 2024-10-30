package com.green.day16.ch26;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

// supplier 는 return 만 있고 파라미터는 없음 / 공급만
public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<Integer> supRandom = () -> (int)(Math.random() * 50); // 0~49
        System.out.println(supRandom.get());

        //랜덤 정수값(0~49) 5개를 가지고 있는 ArrayList를 리턴
        List<Integer> list = makeIntList(supRandom,5);
        System.out.println(list);

        //랜덤 정수값(20~50) 8개를 가지고 있는 ArrayList를 리턴
        Supplier<Integer> supRandom2 = () -> (int)(Math.random()*31.0)+20;
        List<Integer> list2 = makeIntList(supRandom2,8);
        System.out.println(list2);
    }
    public static List<Integer> makeIntList (Supplier<Integer> sup , int n1){
        ArrayList<Integer> arr = new ArrayList<>(n1);
        // 배열 몇 개 생성할지 알고 있으면 미리 생성하는게 성능 향상에 좋음
        // 작성 안하면 계속 복사 하면서 방을 만들기 때문에 성능 차이가 큼

        for (int i=0; i<n1; i++){
            arr.add(sup.get());
        }
        return arr;
    }
}
