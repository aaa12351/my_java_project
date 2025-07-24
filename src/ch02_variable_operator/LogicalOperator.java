package ch02_variable_operator;

public class LogicalOperator {
    public static void main(String[] args) {
        int x = 3, y = 2 ;

        System.out.println("x =" + x + ", y=" + y);
        System.out.println("(x >= y) : " +(x >= y)); // 참
        System.out.println("!(x >= y) : " + !(x >= y)); // 참을 거짓으로 거짓을 참으로 반전, 거짓
        System.out.println("(x == y) : " +(x == y)); // 거짓
        System.out.println("(x != y) : " +(x != y)); // 참

        System.out.println("(-1 < 0) : " +(-1 < 0)); // 참

        System.out.println("((3>2) && (3>4)) : " +((3>2)&&(3>4)));// 거짓

        System.out.println("((x != y) && (-1 > 0)) : " +((x != y)&&(-1 > 0))); // 거짓

        System.out.println("('a' > 'b') : " +('a' > 'b')); // a, b, c ~~~~~ z 가 있다면 a에서 z로 가는 방향이 크다

        x = 5 ;
        y = 6 ;

        System.out.println("x =" + x + ", y=" + y);
        System.out.println("(x >= y) : " + (x >= y));
        System.out.println("(x <= y) : " + (x <= y));
        System.out.println("(x == y) : " + (x == y));
        System.out.println("(x != y) : " + (x != y));

        System.out.println("((5>6) && (3>4)) : " +((5>6)&&(3>4)));
        System.out.println("((x <= y) && (-1 > 0)) : " +((x <= y)&&(-1 > 0)));




    }
}
