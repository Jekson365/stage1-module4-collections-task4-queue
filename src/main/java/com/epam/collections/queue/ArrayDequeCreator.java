package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        Queue<Integer> mergedQueue = new ArrayDeque<>();

        while (!firstQueue.isEmpty()) {
            mergedQueue.add(firstQueue.remove());
        }

        while (!secondQueue.isEmpty()) {
            mergedQueue.add(secondQueue.remove());
        }

        return (ArrayDeque<Integer>) mergedQueue;
    }
}
