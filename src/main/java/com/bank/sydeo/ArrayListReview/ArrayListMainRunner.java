package com.bank.sydeo.ArrayListReview;

import java.util.*;

public class ArrayListMainRunner {
    public static void main(String[] args) {

        // creat arrayList and class
        List<Student> students = new ArrayList<>();

        // add data to new Student and constructor obj in arrayList
        students.add(new Student(1, "suzanna"));
        students.add(new Student(2, "yusif"));
        students.add(new Student(3,"ruslan"));
        students.add(new Student(4,"alina"));

        // iterate arrayList
        // 1. for loop get(data) size starting from index [0]
        System.out.println("< ------------- Iterating arrayList with for loop ------------- >");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }

        // 2. Iterator
        // Forward Iteration
        System.out.println("Printing with iterator..............");

        Iterator iterator = students.listIterator();
         while (iterator.hasNext()) {
             System.out.println(iterator.next());
         }

        // Backwards Iteration
        System.out.println("Printing Backwards with iterator..............");
         while (((ListIterator<?>) iterator).hasPrevious()){
             System.out.println(((ListIterator<?>) iterator).hasPrevious());
         }

        // 3. for each loop
        System.out.println("Printing with for_each loop..............");

        for (Student student : students) {
            System.out.println(student);
        }

        // 4. Lambda
        System.out.println("Printing with Lambda function loop..............");
        students.forEach(student -> System.out.println("student = " + student));

        // Sorting Elements in List using comparator interface
        System.out.println("Sorting with Comparator Interface by Id Desc......");




    }
}
