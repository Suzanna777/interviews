package com.bank.sydeo.pract.nodePra;

public class PersonNode {
    String data;
    Car car;
    PersonNode next; // next would keep the address of the node

    public PersonNode(String data, Car car) {
        this.data = data;
        this.car = car;
    }
}
