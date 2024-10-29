package com.green.day15.ch21;

public class MultiTypeParam {
    public static void main(String[] args) {
        /*
        Dbox<String , Integer> {
        private String left;
        private Integer right;

        void setter (String left , Integer right){
        this.left = left;
        this.right=right;
        }
        }
        위 처럼 작성된 class를 객체화 한 것과 같은 효과가 난다.
         */

        DBox<String , Integer> box = new DBox<>(); // <> String , Integer 타입으로 left , right 설정
        box.setter("Apple" , 25);
//        box.setter("apple","25"); // 이렇게 하면 right는 Integer 설정했지만 문자열 25랑 타입 안맞아서 오류 발생
        System.out.println(box);

        System.out.println("--end--");

        DBox<Integer , Integer> box2 = new DBox<>();
        /*
        Dbox<Integer , Apple> {
        private Integer left;
        private Apple right;

        void setter (Integer left , Apple right){
        this.left = left;
        this.right=right;
        }
        }
        위 처럼 작성된 class를 객체화 한 것과 같은 효과가 난다.
         */

    }
}

class DBox<L,R>{
    private L left;
    private R right;

    void setter(L left , R right){
        this.left=left;
        this.right=right;
    }
    @Override
    public String toString(){
        return String.format("%s & %s" , left , right);
    }

}
