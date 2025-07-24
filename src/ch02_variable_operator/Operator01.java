package ch02_variable_operator;

public class Operator01 {
    public static void main(String[] args) {
        int a = 10, b = 8 ;

        boolean bool1 = a != b ; // 10 != 8 true
        boolean bool2 = --a == b++ ; // bool2 = 9 == 8 // b = 9, a = 9
        boolean bool3 = a++ != --b ; // b= 9-1= 8 // bool3 = 8 != 9 //a =10
        boolean bool4 = bool3 && (5>7); // bool3= true (5>7) = false
        boolean bool5 = !bool4 || (bool1 && bool2); // !false || (true && false) = !false || false = true


        System.out.println("bool1 : " + bool1);
        System.out.println("bool2 : " + bool2);
        System.out.println("bool3 : " + bool3);
        System.out.println("bool4 : " + bool4);
        System.out.println("bool5 : " + bool5);

        int c = 9 ;
        int d = 4 ;

        boolean bool6 = c != d ; // 9 != 4 true
        boolean bool7 = --c == d++ ; // bool2 = 8 == 5 false
        boolean bool8 = c++ != --d ; // b = 4-1 = 3 // bool3 = 9 != 3 true // a = 9 + 1 = 10
        boolean bool9 = bool8 && (8>7); // true && (8>7); true
        boolean bool10 = !bool9 || (bool6 && bool7);// !true || (true && false) // false || false // false

        System.out.println("bool6 : " + bool6);
        System.out.println("bool7 : " + bool7);
        System.out.println("bool8 : " + bool8);
        System.out.println("bool9 : " + bool9);
        System.out.println("bool10 : " + bool10);










    }
}
