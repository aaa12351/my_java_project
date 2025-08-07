package ch06_abstract_interface.animaltest;

public class UniconMain {
    public static void main(String[] args) {
        Unicon unidol = new Unicon("유니돌", "M", "당근");
        unidol.display();
        unidol.flutter();


        System.out.println();

        Unicon unisoon = new Unicon("유니순", "F", "건초");
        unisoon.display();

        // 다형성 테스트
        // Unicon을 Animal, Horse, Bird 타입으로 다뤄 봅니다.
        // 승급
        Animal animal = new Unicon("다형성", "M", "사과"); //animal(객체,참조변수), 하나의 데이터를 여러개로 표현 '다형성' (코딩의 확장성이 좋다, 중복 없이 재사용 가능)
        animal.eat(); // 구현체 메소드가 실행됩니다.

        Horse horse = (Horse) animal ;
        horse.run();

        Bird bird = (Bird) animal ;
        Bird.fly();

    }

}
