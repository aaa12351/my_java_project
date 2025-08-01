package ch04_class;

public class CarMain05 {
    public static void main(String[] args) {

        int[] arr = new int[2];

        Car05[] Car = new Car05[2];


        Car[0] = new Car05("bmw", 14.8, "5 series", "blue", 232, 2025);

        Car[1] = new Car05("kia","morning", "red", 180, 2025);

        for (int i = 0; i < Car.length; i++) {
            Car[i].display();

        }
        Car05[] mycar = {
                new Car05("Benz", 16.8, "E CLASS", "GREEN", 300, 2026), new Car05("Peugeot","Peugeot 208", "yellow", 215, 2028)
        };

        for (int i = 0; i < mycar.length; i++) {
            mycar[i].display();
        }

    }
}
