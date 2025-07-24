package ch02_variable_operator;

public class TernaryOperator {
    public static void main(String[] args) {
        int a = 3, b = 50 ;
        int result = a >= b ? a - b : b - a ; // 삼항 연산자(조건 연산자)

        System.out.println("절대 값 : " + result);

        int x = 10 ; // x가 짝수면 +3 홀수면 제곱
        result = x % 2 == 0 ? x + 3 : x * x ;

        System.out.println("결과 : " + result);

        x = 8 ;
        int y = 4;
        result = x >= y ?  x  : y ;
        System.out.println("큰 수 : " + result);

        result = x <= y ?  x  : y ;
        System.out.println("작은 수 : " + result);

        x = 5 ;
        y = 12 ;

        String str = y % x == 0 ? "yes" : "no" ;
        System.out.println("결과 : " + str);


        int su = 17 ;
        String msg = su % 2 == 0 ? "짝수" : "홀수" ;
        // 숫자 7은(는) 홀수입니다.
        msg = "숫자" + su + "은(는)" + msg + "입니다." ;
        System.out.println(msg);

        int score = 55 ; // 60점 이상이면 합격
        msg = score >= 60 ? "합격" : "불합격" ;
        // 85점이므로 합격입니다.
        msg = score + "점이므로 " + msg + "입니다." ;
        System.out.println(msg);

        int so = 19 ;
        //숫자 19은(는) 홀수입니다.
        String message = so % 2 == 0 ? "짝수" : "홀수" ;
        message = "숫자" + so + "은(는)" + message + "입니다. " ;
        System.out.println(message);

        int si = 90 ; // 80점 이상이면 합격
        //90점이므로 합격입니다.
        msg = si >= 80 ? "합격" : "불합격" ;
        msg = si + " 점이므로 " + msg + " 입니다." ;
        System.out.println(msg);








    }
}
