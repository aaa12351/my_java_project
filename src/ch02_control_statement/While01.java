package ch02_control_statement;

public class While01 {
    public static void main(String[] args) {

        int i = 1 ; // 초기식
        int total = 0 ; // total 값이 수시로 변하는 것을 알고 싶으면 while 안에 써넣은다
                        // 고정된 값이면 while 밖에 써넣은다
        while (i < 11){
            total += i ; // 문장
            i++ ; // 증감식

        } // (i < 11) <== 조건식

        System.out.println("총합01 : " + total);

         i = 1;
         total = 0;

        while ( i < 101 ){
            total += i ;
            i+=3 ;
        }

        System.out.println("총합02 : " + total);

        i = 97;
        total = 0;
        while (i > 1){
            total += i ;
            i-= 5;
        }

        System.out.println("총합03 : " + total);

        i = 1 ;
        total = 0 ;
        while (i < 97){
            total += i*i;
            i+= 5;

        }

        System.out.println("총합04 : " + total);

        i = 1 ;
        total = 0 ;
        while (i < 6){
            total += i+(i*i);
            i++;
        }

        System.out.println("총합05 : " + total);




        }

        }


