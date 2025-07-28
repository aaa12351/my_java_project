package ch02_control_statement;

public class Forswitch01 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;

        for (int i = 1; i < 11; i++) {
            switch (i%2){
                case 0:
                    a += i;
                break;
                case 1:
                    b += i;
                break;

            }

            }
        System.out.println("짝수의 총합은 " + a + "입니다.");
        System.out.println("홀수의 총합은 " + b + "입니다.");
        }
    }

