package ch02_variable_operator;

public class PlusMinus02 {
    public static void main(String[] args) {
        int x = 3, y = 5, z ;

        z = x++ + --y ;


        System.out.println("x : " + x); // x = 3 + 1 = 4
        System.out.println("y : " + y); // y = 5 -1 = 4
        System.out.println("z : " + z); // z = 3 + 4 = 7

        z += --x + y++ ;
        // z= z + --x + y++ ;


        System.out.println("x : " + x); // x = 4 - 1 = 3
        System.out.println("y : " + y); // y = 4 + 1 = 5
        System.out.println("z : " + z); // z = 7 + 3 + 4 = 14
    }
}
