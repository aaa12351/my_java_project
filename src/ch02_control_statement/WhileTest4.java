package ch02_control_statement;

import java.util.Scanner;

public class WhileTest4 {
    public static void main(String[] args) {
        // 스캐너 장치 준비
        Scanner scan = new Scanner(System.in);

        int total = 0; // 총점
        int count = 0 ; // 시행 횟수
        double average = 0.0 ; // 평균


        while (true){
            System.out.print("점수 입력 : ");
            int grade = scan.nextInt();
            //System.out.println("숫자 : " + grade);

            if(grade < -10){ //숫자가 -10 미만인 경우에 대한 처리
                System.out.println("프로그램을 종료합니다.");
                break;
            }else if(grade<0){ // -10 이상의 음수에 대한 처리
                grade= -grade;
            }else{

            }

            // 양수가 아닌 경우 계산을 하면 안됩니다.
            total += grade ;
            count++;
        }

        System.out.println("총점 : " + total);
        average = (double) total / count ;
        System.out.println("평균 : " + average);
    }
}
