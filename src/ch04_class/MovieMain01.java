package ch04_class;

public class MovieMain01 {
    public static void main(String[] args) {

        Movie01 KorMovie = new Movie01();

        String title ;
        String director ;
        String genre ;
        double rating ;
        String language ;
        String country ;
        int age ;
        int year ;

        KorMovie.title = "태극기 휘날리며";
        KorMovie.director = "강제규";
        KorMovie.genre = "전쟁" ;
        KorMovie.rating = 8.1;
        KorMovie.language = "한국어";
        KorMovie.country = "한국";
        KorMovie.age = 15;
        KorMovie.year = 2004;

        System.out.println("영화 제목 : " + KorMovie.title + " 입니다." );
        System.out.println(KorMovie.title  + "의" + " 감독 : " + KorMovie.director + " 입니다." );
        System.out.println(KorMovie.title + "의" + " 장르 : " + KorMovie.genre + " 입니다.");
        System.out.println(KorMovie.title + "의" + " 언어 : " + KorMovie.language + " 입니다.");
        System.out.println(KorMovie.title + "의" + " 개봉 국가 : " + KorMovie.country + " 입니다.");
        System.out.println(KorMovie.title + "의" + " 관람 등급 : " + KorMovie.age + "세 이상 입니다.");
        System.out.println(KorMovie.title + "의" + " 개봉 년도 : " + KorMovie.year + "년 입니다.");

        System.out.println(KorMovie.ageinfo(KorMovie.age));


    }
}
