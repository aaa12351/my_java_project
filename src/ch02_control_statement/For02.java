package ch02_control_statement;

public class For02 {
    public static void main(String[] args) {
        int a = 0; // a = 짝수
        int b = 0; // b = 홀수

        for (int i = 1; i < 11; i++) {
            if (i % 2 == 0) {
                a += i;

            } else {
                b += i;
            }
        }
        System.out.println("짝수의 총합 : " + a);
        System.out.println("홀수의 총합 : " + b);
    }
}
// 중첩 구문