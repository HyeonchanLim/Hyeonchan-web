package com.green.day13;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        System.out.println(list.size());
        list.add(10);
        System.out.println(list);
        System.out.println(list.size());
        list.add(20);
        System.out.println(list);
        list.add(30);
        System.out.println(list);
        System.out.println(list.size());

        list.clear();
        System.out.println(list);
        System.out.println(list.size());
//        list.add(2,30);
    }
}

class MyArrayListTest2{
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        int removeValue = list.remove(1);
        System.out.println(removeValue);
        System.out.println(list);
        // 마지막 방에 있는 값은 리턴 , 마지막 방도 없애야 하고 size는 3이 나와야함

    }
}