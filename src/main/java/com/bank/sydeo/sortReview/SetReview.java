package com.bank.sydeo.sortReview;

import com.bank.sydeo.ArrayListReview.Student;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetReview {
    public static void main(String[] args) {
        //1. create a set
        Set<Student> set = new LinkedHashSet<>();

        // 2. add element

        set.add(new Student(1, "Jack"));
        set.add(new Student(2, "Julia"));
        set.add(new Student(4, "Mary"));
        set.add(new Student(3, "Mike"));
        set.add(new Student(4, "Mary"));

        System.out.println(set);
        //String st= "Javva Developer";

        //System.out.println(firstRepeatingChar(st));


        // What is the time complexity of the following code? O(n)


    }
    public static Character firstRepeatingChar(String str){
        // create a hashSet
        Set<Character> chars = new HashSet<>();

        // iterate over the char array and add chars into hashSet
        for (Character ch:str.toCharArray()) if (!chars.add(ch)) return ch;
        return null;
        // if add ops is false return that char

    }







}



