package ch02_control_statement;

public class WhileTest1 {
    public static void main(String[] args) {
      int i = 1;
      int dan = 3;

      while (i < 10){
          String message = dan + "*" + i + "="+(dan*i);
          System.out.println(message);
          i++;

          i = 1;
          dan = 5;

          while (i <= 14){
              String message1 = dan + " * " + i + " = " + (dan * i) ;
              System.out.println(message1);
              i++;
          }
      }
    }
}
