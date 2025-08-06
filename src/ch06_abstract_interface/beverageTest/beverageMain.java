package ch06_abstract_interface.beverageTest;

public class beverageMain {
    public static void main(String[] args) {

        beverage01[] beverage = {new Americano01("아메리카노", 4000.0, 250.0), new Espresso01("마이뿌레소", 2000.0, 1), new Latte01("latte", 3000.0, "바나나 우유")};

        for (int i = 0; i < beverage.length; i++) {
            System.out.println("===============");
            beverage[i].showData();
            beverage[i].drink();
            beverage[i].make();
            System.out.println();
        }

        System.out.println("toString 메소드 오버라이딩 실습");
        for (int i = 0; i < beverage.length; i++) {
            System.out.println(beverage[i].toString());
        }
    }
}
