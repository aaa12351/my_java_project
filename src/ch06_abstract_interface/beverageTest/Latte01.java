package ch06_abstract_interface.beverageTest;

public class Latte01 extends beverage01 {
    private String milktype ;

    @Override
    public String toString() {
        String message = "우유 타입 : " + this.milktype + "\n" ;
        return  super.toString() + message ;
    }

    public Latte01(String name, double price, String milktype) {
        super(name,price);
        this.milktype = milktype ;
    }

    @Override
    public String drink() {
        String message = "부드럽고 크리미한 " + super.getName() + "를 마십니다.";
        System.out.println(message);
        return message ;
    }

    @Override
    public String make() {
        String message = super.getName() + " 제조법\n" ;
        message += "에스프레소 1샷을 추출합니다.\n";
        message += "컵에 에스프레소를 넣고 뜨거운 물을 부어줍니다.\n";
        message += "에스프레소를 먼저 넣고 물을 나중에 부으면 됩니다.";
        System.out.println(message);
        return message ;
    }
}
