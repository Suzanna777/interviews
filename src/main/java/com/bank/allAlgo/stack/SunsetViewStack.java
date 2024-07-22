package com.bank.allAlgo.stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class SunsetViewStack {

    public static void main(String[] args) {
       int[] building = {3,5,4,4,3,1,3,2};
       sunsetViews(building, "west").forEach(System.out::println);
    }
  //  push() insert data
  //  Pop() remove and return the last value
  //  peek()   Remove value of tail/top
    public static ArrayList<Integer> sunsetViews(int[]building, String direction){
        // building stay in arr and direction string
        Stack<Integer> sNode = new Stack<>();
        int i =0;
        int step = 1;
        if (direction.equalsIgnoreCase("west")){
            i=building.length-1;
            step=-1;
        }
        while (i>=0&& i < building.length){
            while (!sNode.isEmpty() && building[i]>=building[sNode.peek()]){ //remove
                sNode.pop(); //remove and return
            }
            sNode.push(i);
            i+=step;
        }
        if (direction.equalsIgnoreCase("west")) Collections.reverse(sNode);
        return new ArrayList<Integer>(sNode);
    }

}
