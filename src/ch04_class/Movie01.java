package ch04_class;

public class Movie01 {
    String title;
    String director;
    String genre ;
    double rating ;
    String language ;
    String country ;
    int age ;
    int year ;

    String ageinfo(int age){

        String ageinfo = "";
        if (age < 0) {
            ageinfo = "출입 불가";
        } else if (age < 15) {
            ageinfo = "관람 불가";
        } else {
            ageinfo = "관람 가능";
        }
        String message = title + "의 관람 등급은 " + age + "세 이므로 " + ageinfo + " 입니다.";
        return message;
    }



}
