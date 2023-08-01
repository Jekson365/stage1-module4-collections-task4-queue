package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {

        Queue<Integer> q = new ArrayDeque<>();
        List<Integer> d = new ArrayList<>();

        for (int i = 1; i <= numberOfDishes; i++) {
            q.add(i);
        }

        int count = 1;
        while (!q.isEmpty()) {
            int dishNumber = q.poll();
            if (count % everyDishNumberToEat == 0) {
                d.add(dishNumber);
            } else {
                q.add(dishNumber);
            }
            count++;
        }

        return d;
    }
}
