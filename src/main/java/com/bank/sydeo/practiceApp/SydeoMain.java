package com.bank.sydeo.practiceApp;

public class SydeoMain {
    public static void main(String[] args) {
        MySingleLinkedListSydeo list = new MySingleLinkedListSydeo();
 //       System.out.println(list.isEmpty());

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        list.print();

        System.out.println("K^th items from the last : "+list.getKthItemFromLast(3));

        list.removeKthItemFromLast(1);
        list.print();

//        list.deleteByData(9);
//        list.print();
//        System.out.println("index of data 8 " +list.indexOf(8));

    }
}
