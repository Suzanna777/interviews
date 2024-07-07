package com.bank.dsa_03_CollectionsReview.Day_02_ReviewCollections;

import java.util.Objects;

public class Car {
    int id;
    String make;

    public Car(int id, String make) {
        this.id = id;
        this.make = make;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;

        Car car = (Car) o;

        if (id != car.id) return false;
        return Objects.equals(make, car.make);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (make != null ? make.hashCode() : 0);
        return result;
    }
}
