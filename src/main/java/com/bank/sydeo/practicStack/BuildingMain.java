package com.bank.sydeo.practicStack;

public class BuildingMain {

    public static void main(String[] args) {
        BuildingStock stock = new BuildingStock();
        int[] building = {3, 5, 4, 4, 3, 1, 3, 2};
        for (int height : building) {
            stock.add(height);
        }
        String direction = "EAST";
        System.out.println(stock.sunsetView(direction));
    }


}
