package ch02_variable_operator;

public class PlusMinus01 {
    public static void main(String[] args) {
        int a = 10, b= 20, c ;

        c = ++a + b++ ;
       // 3   1  2  4 < 계산 순서
        System.out.println("a : " + a); // a = 11
        System.out.println("b : " + b); // b = 21
        System.out.println("c : " + c); // c = 11 + 20 = 31

        c  = a++   + --b ;
        // 3  4    2   1  < 계산 순서
        System.out.println("a : " + a); // a = 12
        System.out.println("b : " + b); // b = 21 - 1 = 20
        System.out.println("c : " + c); // c = 20 + 11 = 31


        a = 15 ;
        b = 12 ;

        c    =    --a   +    --b ;
        //   4      1    3      2 < 계산 순서
        System.out.println("a : " + a); // a = 14
        System.out.println("b : " + b); // b = 11
        System.out.println("c : " + c); // c = 14 + 11 = 25

        a = 10 ;
        b = 20 ;

        ++a ; // 11
        b-- ; // 19
        c  =  ++a  +  b--;
        // 3    1   2   4
        System.out.println("a : " + a); // a = 12
        System.out.println("b : " + b); // b = 18
        System.out.println("c : " + c); // c = 12 + 19 = 31

        a = 30 ;
        b = 50 ;
        c = --a + b++;

        System.out.println("a : " + a); // a = 30-1 = 29
        System.out.println("b : " + b); // b = 51
        System.out.println("c : " + c); // c = 29 + 50 = 79

        a = 16 ;
        b = 20 ;

        --a ; // 15
        b++ ; // 21
        c = --a + b++;

        System.out.println("a : " + a); // a = 15-1= 14
        System.out.println("b : " + b); // b= 21+1=22
        System.out.println("c : " + c); // c = 14+21= 35

    }
}
