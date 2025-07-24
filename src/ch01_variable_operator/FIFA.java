package ch01_variable_operator;

public class FIFA {
    public static void main(String[] args) {
        String game ;
        String human ;
        String human2 ;
        int a ;
        int b ;
        int c ;

        game = "FIFA" ;
        human = "호날두" ;
        human2 = "메시" ;
        a = 3150 ;
        b = 280 ;
        c = a - b ;

        String message = "좋아하는 축구 게임은 " + game + " 입니다." ;
        System.out.println(message);
        System.out.print("좋아하는 축구선수는 " + human + "와");
        System.out.println(" " + human2 + " 입니다.");
        System.out.println(human + "의 연봉은 " + a + "억 원입니다.");
        System.out.println(human2 + "의 연봉은 " + b + "억 원입니다.");
        System.out.println("두 선수 연봉 차이 금액은 " + c + "억 원입니다.");



    }
}
