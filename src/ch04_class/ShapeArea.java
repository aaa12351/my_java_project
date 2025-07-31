package ch04_class;

public class ShapeArea {

    public void Area(int width, int height) {
        int area = width * height;
        System.out.println("사각형의 면적: " + area);
    }
    public void Area(int top, int width, int bottom) {
        double area = (double) (top + bottom) * width / 2.0;
        System.out.println("사다리꼴의 면적: " + area);
    }

    public void Area(int radius){

        final double PI = 3.14;
        double area = PI * (radius * radius) ;

        System.out.println("원의 면적 : " + area);
    }
}
