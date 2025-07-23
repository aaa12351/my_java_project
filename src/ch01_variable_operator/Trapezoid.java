package ch01_variable_operator;

public class Trapezoid {
    public static void main(String[] args) {
        double bottom ;
        double top ;
        double height ;
        double area ;

        bottom = 20.0;
        top = 10.0;
        height = 15.0;
        area = ( bottom + top ) * height / 2.0;

        String message = "밑변 : " + bottom  ;
        System.out.println(message);
        System.out.println("윗변 : " + top );
        System.out.println("높이 : " + height);
        System.out.println("면적 : " + area );




    }
}
