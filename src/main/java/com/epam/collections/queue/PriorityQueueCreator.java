package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {

        List<String> m = new ArrayList<>(firstList);
        m.addAll(secondList);

        Collections.sort(m, Collections.reverseOrder());

        PriorityQueue<String> priorityQueue = new PriorityQueue<>(m);

        return priorityQueue;
    }
}
