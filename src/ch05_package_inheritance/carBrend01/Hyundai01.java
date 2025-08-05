package ch05_package_inheritance.carBrend01;

public class Hyundai01 extends brend01 {
    private int seat ;

    @Override
    public void showInfo() {
        super.showInfo();
        String message = super.getType() + "의 좌석 수는 " + this.seat + "개입니다.";
        System.out.println(message);
    }

    public Hyundai01(String name, String type, String fuel, int seat, int speed) {
        super(name,type,fuel,speed);
        this.seat = seat ;
    }

    public void run(){
        String message = super.getType() + "이" + super.getSpeed() + "의 속도로 달립니다.";
        System.out.println(message);

    }
}
