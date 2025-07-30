package ch04_class;

public class Car01 {
    String brend;
    double fuelefficiency;
    String model;
    int modelyear;
    String color;
    int maxspeed;

    String fuelinfo(double efficiency) {
        String fuelinfo = "";
        if (fuelefficiency < 16) {
            fuelinfo = "좋음";

        } else {
            fuelinfo = "나쁨";
        }

        String message = brend + " 는(은) " + fuelefficiency + " 이므로" + " 연비가 " + fuelinfo + " 입니다.";
        return message;

    }

    String speed(int speed){
           String speedinfo = "";
        if(maxspeed < 300){
            speedinfo = "빠른 속도" ;
        }else{
            speedinfo = "너무 느린 속도";
        }

        String message = brend + "의 " + model + " 최고 속도는 " + maxspeed + "이므로 " + speedinfo + "입니다." ;
        return message;

    }

    void display(){
        System.out.println("연식 : " + modelyear + "년 입니다.");
        System.out.println(brend + "시리즈 중 " +  model +"가 " + "가장 많이 팔린 국가는" + " 한국 입니다.");

    }





}






