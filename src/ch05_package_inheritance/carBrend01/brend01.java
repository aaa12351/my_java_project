package ch05_package_inheritance.carBrend01;

public class brend01 {
    private String name ;
    private String type ;
    private String fuel ;
    private int speed ;

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getFuel() {
        return fuel;
    }

    public int getSpeed() {
        return speed;
    }

    public brend01(String name, String type, String fuel,int speed) {
        this.name = name ;
        this.type = type ;
        this.fuel = fuel ;
        this.speed = speed ;
    }

    public void showInfo() {
        String message = "브랜드가 " + this.name + "인 " + this.type + "의 연료 종류는 " + this.fuel + "입니다.";
        System.out.println(message);


    }

}
