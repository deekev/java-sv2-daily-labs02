package day04;

public class GasStation {

    private int price;

    public GasStation(int price) {
        this.price = price;
    }

    public int tankCar(Car car, int liter){
        car.setFuel(liter);
        return price * liter;
    }
}