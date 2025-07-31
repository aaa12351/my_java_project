package ch04_class;

public class ShapeAreaMain {
    public static void main(String[] args) {

        ShapeArea obj = new ShapeArea();

        //메소드 오버로딩
        obj.Area(10); // 원
        obj.Area(10,5) ; // 사각형
        obj.Area(5,10,15) ; // 사다리꼴




    }
}
