package ch01_variable_operator;

public class ShowJumsu {
    public static void main(String[] args) {
        String name ;
        double korean ; // double kor, eng
        double english ;
        double average ;

        name = "홍길동";
        korean = 40.0 ;
        english = 43.0 ;
        average = (korean + english) / 2.0 ;

        String message = "이름 : " + name ;
        System.out.println(message);
        System.out.println("국어 : " + korean);
        System.out.println("영어 : " + english);
        System.out.println("평균 : " + average);
    }
}
