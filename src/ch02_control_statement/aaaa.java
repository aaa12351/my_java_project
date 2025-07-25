package ch02_control_statement;

public class aaaa {
    public static void main(String[] args) {
        int score = 11;
        String type;
        if (score >= 100 && score <= 120)
        {
            type = "장학생";
        }
        else if (score >= 80 && score <= 90)
        {
            type = "우수학생";
        }
        else if (score >= 60 && score <= 70)
        {
            type = "열심히 하는 학생";
        }
        else
        {
            type = "낙제생" ;
        }

        String message = type + " 점수는 " + score + " 입니다. " ;
        System.out.println(message);
    }
}
