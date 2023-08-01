package com.epam.collections.queue;

import java.util.*;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {

        Queue<Integer> queue = new LinkedList<>();
        List<Integer> result = new ArrayList<>();

        // Initialize the queue with dish numbers
        for (int i = 1; i <= numberOfDishes; i++) {
            queue.add(i);
        }

        // Start eating dishes
        int count = 0;
        while (!queue.isEmpty()) {
            int dish = queue.poll();
            count++;
            if (count == everyDishNumberToEat) {
                result.add(dish);
                count = 0;
            } else {
                queue.add(dish);
            }
        }

        return result;
    }
}
