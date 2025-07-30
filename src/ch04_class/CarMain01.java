package ch04_class;

public class CarMain01 {
    public static void main(String[] args) {

        Car01 bmw = new Car01();

        String brend;
        double fuelefficiency;
        String model;
        int modelyear;
        String color;
        int maxspeed;

        bmw.brend = "bmw";
        bmw.fuelefficiency = 15.4;
        bmw.model = "5serise";
        bmw.modelyear = 2025;
        bmw.color = "blue";
        bmw.maxspeed = 232;

        System.out.println("브랜드 : " + bmw.brend + " 입니다.");
        System.out.println("연비 : " + bmw.fuelefficiency + "km 입니다.");
        System.out.println("모델 : " + bmw.model + " 입니다.");
        System.out.println("연식 : " + bmw.modelyear + "년 입니다.");
        System.out.println("색깔 : " + bmw.color + " 입니다.");
        System.out.println("최고 스피드 : " + bmw.maxspeed + "km 입니다.");

        System.out.println("브랜드: " + bmw.brend + " 연비는 " + bmw.fuelefficiency + "km/L 입니다. 결과: " + bmw.fuelinfo(bmw.fuelefficiency));

        System.out.println(bmw.speed(bmw.maxspeed));

        bmw.display();




    }
}
