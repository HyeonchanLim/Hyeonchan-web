package com.green.day11.ch16;

public class MyFriends2 {
    public static void main(String[] args) {
        UnivFriend2[] arr1 = new UnivFriend2[3];
        CompFriend2[] arr2 = new CompFriend2[3];

        //다형성 : 다양한 형태가 될 수 있는 성질 >> 변수타입은 다르지만 저장 가능.
        UnivFriend2 obj1 = new UnivFriend2("Lee" , "computer" , "010-1111-1111");
        Friend f1 = obj1;
        Friend f2 = new UnivFriend2("Seo" , "Electronics" , "010-2222-2222");
        CompFriend2 obj2 = new CompFriend2("Kim" , "Sangin" , "010-3333-3333");
        Friend f3 = obj2;

        // Friend f2 가 의미하는 바는 Friend 객체 주소값을 담을 수 있는 f2 레퍼런스 변수
        // 이제는 + Friend 를 상속받은 객체의 주소값도 담을 수 있다.

        Friend[] arr3 = new Friend[10]; // arr3의 각 방의 타입 : Friend
        // new UnivFriend2 , CompFriend2 객체 생성해도 Friend 타입
        // UnivFriend2 , CompFriend2 , Friend 객체 주소값 모두 담을 수 있는 배열 - 다형성
        arr3[0] = obj1;
        arr3[1] = f2;
        arr3[2] = new CompFriend2("Yoon" ,  "02-123-9999","R&D 1");
        arr3[3] = new CompFriend2("Park" , "02-333-5555" , "R&D 2");

        arr3[0].showInfo();
        // arr3[4].showInfo(); // null point exception 발생
        // 반복문으로 arr3에 객체주소값이 있는 친구들만 showInfo() 메소드 호출
        System.out.println("----");
        for (int i=0; i<arr3.length; i++){
            if (arr3[i]!=null){
                arr3[i].showInfo();
            }
        }
        System.out.println("----");
        for (int i=0; i<arr3.length; i++){
            Friend item = arr3[i];
            if (item==null){
                continue;
            }
            item.showInfo();
            System.out.println();
        }
        //main 메소드 수정 금지
        // 이름 , 전화번호 + 대학친구는 전공도 출력 , 직장동료는 부서 출력

    }
}


class Friend {
    protected String name;
    protected String phone;

    Friend (String name , String phone){
        this.name=name;
        this.phone=phone;
    }
    public String getName() {
        return name;
    }
    public String getPhone() {
        return phone;
    }

    public void showInfo(){
        System.out.println("이름 : " + name);
        System.out.println("전화 : " + phone);
    }
}

class UnivFriend2 extends Friend{
    private String major;

    UnivFriend2 (String name , String phone , String major){
        super(name,phone);
        this.major=major;
    }
    public String getMajor(){
        return major;
    }
    @Override
    public void showInfo(){
        super.showInfo(); // 부모클래스(super)의 showInfo 메서드 호출
        System.out.println("전공 : "+major);
    }
}

class CompFriend2 extends Friend{
    private String department;

    CompFriend2 (String name , String phone , String department){
        super(name,phone);
        this.department=department;
    }
    public String getDepartment(){
        return department;
    }
    @Override
    public void showInfo(){ //상속으로 받은 오버라이딩 - 다형성 is - a 관계
        super.showInfo();
        System.out.println("부서 : "+department);
    }
}
