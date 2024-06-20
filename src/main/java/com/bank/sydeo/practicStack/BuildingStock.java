package com.bank.sydeo.practicStack;

import com.bank.sydeo.pract.LinkedSingList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BuildingStock <T>{
    /*Given an array of buildings and a direction that all of the buildings face, return an array of the indices of the buildings that can see the sunset.
    A building can see the sunset if it's strictly taller than all of the buildings that come after it in the direction that it faces.
    The input array named buildings contains positive, non-zero integers representing the heights of the buildings.
    A building at index i thus has a height denoted by buildings[i].
    All of the buildings face the same direction, and this direction is either east or west, denoted by the input string named direction, which will always be equal to either "EAST" or "WEST" . In relation to the input array, you can interpret these directions as right for east and left for west. Important note: the indices in the output array should be sorted in ascending order.
     Sample Input buildings = [3, 5, 4, 4, 3, 1, 3, 2] direction = "EAST"
     Sample Output/[1, 3, 6, 7] //*/


    public StockNode<Integer> bottom;
    public StockNode<Integer> top;

    int size;

    public void add(int data){
        StockNode<Integer> node = new StockNode<>(data);
        if (bottom==null){
            top = bottom = node;
        }
        else{
            bottom.next = node;
            bottom=node;
        }
    }

    public List<Integer> sunsetView (String direction){
        List<Integer> result = new ArrayList<>();
        if (top==null){
            return result;
        }
        StockNode<Integer> current = top;
        List<Integer> building = new ArrayList<>();
        while (current!=null){
            building.add(current.data);
            current = current.next;
        }
        if (direction.equals("EAST")){
            int heighest = 0;
            for (int i = building.size()-1; i >=0 ; i--) {
                if (building.get(i) > heighest){
                    result.add(i);
                    heighest = building.get(i);
                }
            }
            }
        else if (direction.equals("WEST")){
            int height = 0;
            for (int i = 0; i < building.size(); i++) {
              if (building.get(i) > height){
                  result.add(i);
                  height = building.get(i);
              }
            }
        }
        Collections.sort(result);
        return result;
    }


}
