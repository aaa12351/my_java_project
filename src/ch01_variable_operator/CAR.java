package ch01_variable_operator;

public class CAR {
    public static void main(String[] args) {
        String name ;
        String car ;
        int a ;
        int b ;
        int c ;


        name = "bmw" ;
        car = "5 serise" ;
        a = 7000 ;
        b = 11 ;
        c = 3500 ;



        String message = "좋아하는 자동차 브랜드는 " + name + " 입니다." ;
        System.out.println(message);
        System.out.println("좋아하는 시리즈는 " + car + " 입니다.");
        System.out.println("연비는 " + b + " Km 입니다.");
        System.out.println("중고차 평균 가격은 " + c + "만원 입니다.");


    }
}
