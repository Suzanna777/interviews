package com.bank.sydeo.practicStack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class BuildSunsetStock {

    public static void main(String[] args) {
        // array text
        int[] text = {3,5,4,4,3,1,3,2};
        // patter
        buildSunsetStock(text, "EAST").forEach(System.out::println);
    }
    public static ArrayList<Integer> buildSunsetStock(int[] buildingText, String directionText){
        Stack<Integer> stack = new Stack<>();
        // for east lower building
        int i = 0;
        int step = 1;

       // for west highest building
        if (directionText.equalsIgnoreCase("west")){
            i = buildingText.length-1; // [i] = text size -1
            step=-1; // move 1 step to the head
        }
        while (i >= 0 && i < buildingText.length){
            while (!stack.isEmpty() && buildingText[i]>=buildingText[stack.peek()]){
                stack.pop();
            }
            stack.push(i);
            i+=step;
        }

        if (directionText.equalsIgnoreCase("east")) Collections.reverse(stack); {
            return new ArrayList<>(stack);
        }
    }
}
