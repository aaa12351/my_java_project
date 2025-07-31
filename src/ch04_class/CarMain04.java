package ch04_class;

public class CarMain04 {
    public static void main(String[] args) {
        Car04 a = new Car04();

        a.setBrend("BMW");
        a.setFuelfficiency(14.8);
        a.setModel("5 series");
        a.setColor("blue");
        a.setMaxspeed(232);
        a.setModelyear(2025);

        System.out.println("브랜드 : " + a.getBrend());
        System.out.println("연비 : " + a.getFuelfficiency());
        System.out.println("모델 : " + a.getModel());
        System.out.println("색상 : " + a.getColor());
        System.out.println("연식 : " + a.getModelyear());
        System.out.println("최고 속도 : " + a.getMaxspeed());





    }
}
