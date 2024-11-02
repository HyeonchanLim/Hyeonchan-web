package academy;
public class Grade {
    private String name;
    private double kor;
    private double eng;
    private double math;

    public static void main(String[] args) {
        Grade student1 = new Grade("강백호", 90.0, 85.5, 70.0);
        Grade student2 = new Grade("채치수", 82.0, 92.0, 60.5);
        student1.average();
        student2.average();
    }
    Grade (String name , double kor , double eng , double math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    void average() {
        System.out.printf("%s의 평균 점수 : %.2f \n" , name , (kor+eng+math)/3);
    }
}