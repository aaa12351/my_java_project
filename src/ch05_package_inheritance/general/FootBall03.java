package ch05_package_inheritance.general;

public class FootBall03 extends Sport03 {
    private int halftime ;
    private int goal ;

    public FootBall03(String name, int entry, int halftime, int goal
    ) {
        super(name,entry);
        this.halftime = halftime ;
        this. goal = goal ;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println(this.halftime + "개의" + " 하프타임으로 구성이 되며, " + this.goal + " 골이 들어갔습니다!");
    }
}
