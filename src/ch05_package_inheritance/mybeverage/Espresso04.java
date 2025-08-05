package ch05_package_inheritance.mybeverage;

import org.w3c.dom.ls.LSOutput;

public class Espresso04 extends Beverage04 {
    private int shotCount ;

    @Override
    public String toString() {
        String message = ", 샷 : " + this.shotCount + "개 입니다.";
        return super.toString() + message ;

    }

    public void drinkEspresso(){
        String message = "맛이 진하고 강렬한 " + super.getName() + "을(를) 마십니다." ;
        System.out.println(message);
    }

    public Espresso04(String name, double price, int shotCount){
    super(name,price);
    this.shotCount = shotCount ;
    }



}
