package ch05_package_inheritance.general;

public class Sport03 {
    private String name ;
    private int entry ;

    public Sport03(String name, int entry) {
        this.name = name ;
        this.entry = entry ;
    }

    protected void showInfo() {
        System.out.println(this.name + " 경기는 " + this.entry + "명의 " + "엔트리로 구성이 됩니다.");


    }

}
