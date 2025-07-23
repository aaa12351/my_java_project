package ch01_variable_operator;

public class sim {
    public static void main(String[] args) {
        String name ;
        String ramen ;
        int a ;
        int b ;

        name = "농심" ;
        ramen = "신라면" ;
        a = 1000 ;
        b = a / 2  ;


        String message = "좋아하는 라면 회사는 " + name ;
        System.out.println(message);
        System.out.println("좋아하는 라면은 " + ramen);
        System.out.println("가격은 " + a  + "원 입니다." );
        System.out.println("반값할인 가격은 " + b + "원 입니다.");






    }
}
