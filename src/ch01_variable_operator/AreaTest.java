package ch01_variable_operator;

public class AreaTest {
    public static void main(String[] args) {
       double a ;
       double b ;

       a = 10.0 ;
       b = 3.14 ;

       double c ;
       c = b * a * a;

        String message = "반지름이 " + a + "일 떄";
        System.out.print(message);
        System.out.print(" 원의 면적은 " + b + "입니다.");
    }
}
