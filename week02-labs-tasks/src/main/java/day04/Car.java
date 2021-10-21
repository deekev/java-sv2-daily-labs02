package day04;

public class Car {

    private int fuel;
    private int km;

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public int getFuel() {
        return fuel;
    }

    public int getKm() {
        return km;
    }

    public double calculateConsumption() {
        return ((fuel * 1.0) / km) * 100;
    }
}