package com.bank.sydeo;

import java.util.ArrayList;
import java.util.Arrays;

public class NumberOfPeopleInTheBus {
    public static void main(String[] args) {
        ArrayList<int[]> busStops = new ArrayList<>();
        busStops.add(new int[] {10, 0});
        busStops.add(new int[] {3, 1});
        busStops.add(new int[] {2,7});

        System.out.println(countPassengers(busStops));
    }
    public static int countPassengers(ArrayList <int[]> busStop){
       int countAllPeople = 0;
        for (int i = 0; i < busStop.size() ; i++) {
            countAllPeople = countAllPeople + busStop.get(i)[0] - busStop.get(i)[1]; // [0] = people get in to the buss [1] = people get out from the bus
        }
        return countAllPeople;
    }
}
