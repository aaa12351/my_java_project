package ch06_abstract_interface.beverageTest;

public class Americano01 extends beverage01 {
    private double waterAmount;

    @Override
    public String toString() {
        String message = "물의 양 : " + this.waterAmount + "\n" ;
        return  super.toString() + message ;
    }

    public Americano01(String name, double price, double waterAmount) {
        super(name, price);
        this.waterAmount = waterAmount;

    }

    @Override
    public String drink() {
        String message = super.getName() + "를(을) " + " 홀짝 홀짝 마십니다.";
        System.out.println(message);
        return message;
    }

    @Override
    public String make() {
        System.out.println(super.getName() + " 제조법");
        System.out.println("에스프레소 1샷을 추출합니다.");
        System.out.println("컵에 에스프레소를 넣고 뜨거운 물을 부어줍니다");
        System.out.println("에스프레소를 먼저 넣고 물을 나중에 부으면 됩니다.");
        //System.out.println(super.getA()+message);

        return "";
    }
}
