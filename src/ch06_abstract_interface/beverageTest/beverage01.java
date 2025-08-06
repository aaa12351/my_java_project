package ch06_abstract_interface.beverageTest;

public abstract class beverage01 {
    private String name ;
    private double price ;

    @Override
    public String toString() {
        String message = "이름 : " + this.name + "\n";
        message += "단가 : " + this.price + "원\n";
        return message ;
    }

    public String getName() {
        return name;
    }



    public beverage01(String name, double price) {
        this.name = name ;
        this.price = price ;
    }

    public final void showData() {
        System.out.println("음료 " + this.name + "의 단가는 " + this.price + "입니다.");
    }

    public abstract String drink();


    public abstract String make();

    //protected final String getA() {
    //    return this.name + "제조법\n";
    //}
}
