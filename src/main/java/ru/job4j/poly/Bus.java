package ru.job4j.poly;

public class Bus implements Transport {
    private int passengers;
    private float price = 50.3f;

    @Override
    public void go() {
        System.out.println("The bus is going");
    }

    @Override
    public void passengers(int number) {
        this.passengers = number;
    }

    @Override
    public float fill(float fuel) {
        return fuel * price;
    }
}
