package com.Day4;

import java.util.PriorityQueue;

public class Demo13 {
    public static void main(String[] args) {

        PriorityQueue<String> priorityQueue = new PriorityQueue<>();

        priorityQueue.add("Mark");
        priorityQueue.add("Rafa");
        priorityQueue.add("mahi");
        priorityQueue.add("Ema");
        for (String name : priorityQueue) {
            System.out.println(name);
        }
        System.out.println("Head: " + priorityQueue.element());
        System.out.println("Head: " + priorityQueue.peek());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.poll());
        System.out.println("*****************");
        for (String name : priorityQueue) {
            System.out.println(name);
        }

    }
}
