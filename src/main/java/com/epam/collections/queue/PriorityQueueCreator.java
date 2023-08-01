package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        List<String> mergedList = new ArrayList<>(firstList);
        mergedList.addAll(secondList);

        PriorityQueue<String> priorityQueue = new PriorityQueue<>(
                (s1, s2) -> s2.compareTo(s1)
        );

        priorityQueue.addAll(mergedList);

        return priorityQueue;
    }
}
