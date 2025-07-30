package ch04_class;

public class SaramMain01 {
    public static void main(String[] args) {


        // 단계 2 : 객체 생성
        // 클래스이름 객체이름 = new 생성자이름() ;
        // 생성자의 이름과 클래스의 이름이 같아야 한다
        Saram01 yusin = new Saram01();      // int x = 10;    int x; x = 10 ;

        Saram01 soon ;
        soon = new Saram01();

        // 단계3 : 객체의 멤버 변수에 쓰기 작업
        // 점(.)을 멤버 참조 연산자라고 부릅니다.
        yusin.nationality = "대한 민국";
        yusin.name = "김유신";
        yusin.height = 172.5;
        yusin.weight = 75.4;
        yusin.blood = "AB";
        yusin.hobby = "농구";

        // 단계4 : 객체의 멤버 변수의 값을 출력
        System.out.println("국적 : " + yusin.nationality );
        System.out.println("이름 : " + yusin.name );
        System.out.println("키 : " + yusin.height );
        System.out.println("몸무게 : " + yusin.weight );
        System.out.println("취미 : " + yusin.hobby);
        System.out.println("혈액형 : " + yusin.blood );
        System.out.println();
        soon.nationality = "대한민국";
        soon.name = "유관순";
        soon.height = 168.5 ;
        soon.weight = 52.4 ;
        soon.hobby = "축구" ;
        soon.blood = "O";

        System.out.println("국적 : " + soon.nationality);
        System.out.println("이름 : " + soon.name);
        System.out.println("키 : " + soon.height);
        System.out.println("몸무게 : " + soon.weight);
        System.out.println("취미 : " + soon.hobby);
        System.out.println("혈액형 : " + soon.blood);

        String message = yusin.showGenderInfo(1);
        String message1 = soon.showGenderInfo(2);
        System.out.println(message);
        System.out.println(message1);

        message = yusin.showBmiInfo();
        System.out.println(message);

        message = soon.showBmiInfo();

        yusin.display();
        soon.display();
    }
}
