package ch05_package_inheritance.carBrend01;

public class brendMain01 {
    public static void main(String[] args) {

        brend01[] brend = {new Hyundai01("현대","세단","가솔린",5,100)};

        for (int i = 0; i < brend.length; i++) {
            brend[i].showInfo();

            if(brend[i] instanceof brend01){
                Hyundai01 hyundai = (Hyundai01) brend[i];
                hyundai.run();


            }


        }

    }
}
