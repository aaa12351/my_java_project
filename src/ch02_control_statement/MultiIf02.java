package ch02_control_statement;

public class MultiIf02 {
    public static void main(String[] args) {
        int age = 5;
        double ticket = 1000.0 ;
        double discount ;
        String person ;
        if(age <8)
        {
            discount = 1.0;
            person = "유아(무료 입장)" ;
        }
        else if(age < 14)
        {
            discount = 0.5;
            person = "어린이(50% 할인)";
        }
        else if(age < 20)
        {
            discount = 0.3 ;
            person = "청소년(30% 할인)" ;

        }
        else if(age >= 65)
        {
            discount = 0.4 ;
            person = "노인(40% 할인)" ;
        }
        else
        {
            person = "성인(정가)" ;
            discount = 0.0 ;
        }
        double price = ticket * (1 - discount);
        String message = age + "살 : " + person ;
        System.out.println("가격은 " + price + "입니다.");
        System.out.println(message);



}

}