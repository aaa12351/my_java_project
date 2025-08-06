package ch06_abstract_interface.myshape;

public class Rectangle extends Shape {
    private double width ; // 너비
    private double height ; // 높이

    public Rectangle(String linecolor, String fillcolor, double width, double height){
        super(linecolor,fillcolor);
        this.height = height ;
        this.width = width ;
    }

    @Override
    public double calcArea() {
        return this.height * this.width ;
    }

    @Override // 둘레 = 2.0 * (밑변 + 높이)
    public double calcperimeter() {
        return 2.0 * (this.width + this.height);
    }

    @Override
    public void display() {
        super.perimeter = this.calcperimeter();
        super.area = this.calcArea();
        System.out.println("사각형 정보");
        System.out.println("면적 : " + super.area);
        System.out.println("둘레 : " + super.perimeter);
    }
}
