package ch04_class;

public class Saram03 {

    private String name; //private 숨기고 싶은 데이터가 있을 때 쓴다

    public void setName(String name){

        this.name = name ;
    }

    public String getName(){
        return name ;
    }

    //get이 붙어 있으면 읽기
    private double height;

    public void setHeight(double height){

        this.height = height;
    }

    public double getHeight(){
        return height ;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    private double weight;
    private String hobby;
    private String blood;

// 알트 + 인서트 게터, 섹터 만들떄 단축키


}
