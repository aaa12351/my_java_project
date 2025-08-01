package ch04_class;

public class Car05 {
    private String brend;
    private double fuelfficiency = 10.8;
    private String model;
    private String color;
    private int maxspeed;
    private int modelyear;

    public Car05(String brend,double fuelfficiency,String model,String color,int maxspeed,int modelyear){
    this.brend = brend;
    this.fuelfficiency = fuelfficiency;
    this.model = model;
    this.color = color;
    this.maxspeed = maxspeed;
    this.modelyear = modelyear;


}

public Car05(String brend,String model,String color,int maxspeed,int modelyear){
    this.brend = brend;
    this.model = model;
    this.color = color;
    this.maxspeed = maxspeed;
    this.modelyear = modelyear;


}

    public void display() {
        System.out.println("브랜드 : " + this.brend);
        System.out.println("연비 : " + this.fuelfficiency);
        System.out.println("모델 : " + this.model);
        System.out.println("색상 : " + this.color);
        System.out.println("최고 속도 : " + this.maxspeed);
        System.out.println("연식 : " + this.modelyear);
    }
    }
