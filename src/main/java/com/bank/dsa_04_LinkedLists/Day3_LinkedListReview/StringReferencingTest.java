package com.bank.dsa_04_LinkedLists.Day3_LinkedListReview;

public class StringReferencingTest {
    public static void main(String[] args) {
        Car car1=new Car("Audi",2020);
        Car car2=new Car("BMW", 2024);
        Car car3=new Car("Ford", 2024);

        car1.next=car2;
        car2.next=car3;
        System.out.println(car1);
        System.out.println(car1.next);
        Car current= car1;
        while(current!=null){
            System.out.println(current.make + " address of this current is " + current);
            current=current.next;
        }
        }
}
