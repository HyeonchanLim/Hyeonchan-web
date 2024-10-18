package com.green.day09.ch13;

public class EnhancedForInst {
    public static void main(String[] args) {
        //메인 메소드 수정 금지
        Product[] arr = new Product[4];
        arr[0] = new Product("Coffee" , 5000);

        System.out.println(arr[0]); // 제품명 : coffee , 가격 : 5000원 출력

    }
}

    class Product{
        private String name;
        private int price;
    Product (String str1 , int n1){
        this.name = str1;
        this.price = n1;
    }
    void checkMyProduct (){
        System.out.printf("제품: %s 가격 : %s\n", name , price);
    }

    public String toString(){
        //return "제품명 :"+name + ", 가격 :" + price;
        return String.format("제품명 : %s , 가격 : %,d원" , name , price);
    }
}
