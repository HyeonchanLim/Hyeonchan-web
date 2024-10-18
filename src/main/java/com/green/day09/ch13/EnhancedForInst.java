package com.green.day09.ch13;

public class EnhancedForInst {
    public static void main(String[] args) {
        //메인 메소드 수정 금지
        Product[] arr = new Product[4];
        arr[0] = new Product("Coffee" , 5000);
        arr[1] = new Product("Computer",1_000_000);
        arr[2] = new Product("Apple",7_000);
        arr[3] = new Product("Dress",400_000);

        //System.out.println(arr[0]); // 제품명 : coffee , 가격 : 5000원 출력
        /*
        enhanced-for를 사용하여 제품명 , 가격을 콘솔에 출력하고 모든 제품의 가격을 더한값을 출력해 주세요.
         */
        for (Product pr : arr){
            System.out.println(pr + " ");
        }

        System.out.println("-----");
        int sum=0;

        for (Product pr1 : arr){
            sum += pr1.getPrice();
        }
        System.out.println("sum : " + sum);
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

        public String getName() {
            return name;
        }

        public int getPrice() {
            return price;
        }
    }
