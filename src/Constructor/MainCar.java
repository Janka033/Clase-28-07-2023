package Constructor;

public class MainCar {
    public static void main(String[] args) {
        Cars cars = new Cars("OPV98F",2022);
        cars.setPlate("KFC87U");
        System.out.println(cars.getPlate());
        System.out.println(cars.getModel());
    }
}
