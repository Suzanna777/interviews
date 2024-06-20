package com.bank.sydeo.pract.nodePra;

public class MainTest {
    public static void main(String[] args) {
        PersonNode personNode1 = new PersonNode("mich", new Car("audi", "a4"));
        PersonNode personNode2 = new PersonNode("suzanna", new Car("mercedes", "s450"));
        System.out.println(personNode1 + " = person1");
        System.out.println(personNode2 + " = person 2");

        personNode1.next = personNode2; // next would keep the address of 2
        System.out.println(personNode1.next);
        System.out.println(personNode2);
        PersonNode current = personNode2; // current has address of 2
        System.out.println(current);

        personNode2 = personNode1;
        System.out.println(personNode2);
        System.out.println(current);
    }
}
