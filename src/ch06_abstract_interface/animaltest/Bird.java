package ch06_abstract_interface.animaltest;

public interface Bird {
    int speed = 300; // final이 붙으면 절대로 값을 바꿀 수 없다.(초기화시켜야함)

    // public static final int speed = 300 ; 암시적으로 붙어 있습니다.
    static void fly() {

    }
    // 위의 문장과 같다 (public abstract) << 숨어 있음 void fly();

    default void flutter(){
        System.out.println("날개를 펄럭입니다.");

     }

    // 구현체 메소드 or 구현화 메소드

}
