package ch01_variable_operator;

public class MyBox {
    public static void main(String[] args) {
        double a ;
        double b ;
        double c ;
        double d ;

        a = 10.0 ;
        b = 5.0 ;
        c = a * b ;
        d = 2 * ( a +  b ) ;


        String message = "너비 : " + a ;
        System.out.println(message);
        System.out.println("높이 : " + b );
        System.out.println("사각형의 넓이 : " + c );
        System.out.println("사각형의 둘레 : " + d );

    }
}
