package ch05_package_inheritance.general;

public class BaseBall03 extends Sport03 {
    private int innings ;
    private double hitrate ;

    public BaseBall03(String name, int entry, int innings, double hitrate) {
        super(name,entry);
        this.innings = innings ;
        this.hitrate = hitrate ;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println(this.innings + "개의 " + "이닝으로 구성이 되며," + "타율 " + this.hitrate + "를 기록하였습니다.");
    }
}
