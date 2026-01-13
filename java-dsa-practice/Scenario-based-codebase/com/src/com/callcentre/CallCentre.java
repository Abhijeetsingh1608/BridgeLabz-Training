package com.callcentre;

import java.util.*;

class CallCenter {

    Queue<Customer> normalQueue = new LinkedList<>();
    Queue<Customer> priorityQueue = new LinkedList<>();
    HashMap<String, Integer> callCountMap = new HashMap<>();

    // Receive a call
    void receiveCall(Customer customer) {

        if (customer.isPriority) {
            priorityQueue.add(customer);
        } else {
            normalQueue.add(customer);
        }

        callCountMap.put(
            customer.userId,
            callCountMap.getOrDefault(customer.userId, 0) + 1
        );
    }

    // Handle a call
    void handleCall() {

        Customer customer;

        if (!priorityQueue.isEmpty()) {
            customer = priorityQueue.poll();
        } else if (!normalQueue.isEmpty()) {
            customer = normalQueue.poll();
        } else {
            System.out.println("No calls in queue");
            return;
        }

        System.out.println("Handling call of: " + customer.name);
    }

    // Show call count
    void showCallCount(String userId) {
        System.out.println(
            "Total calls this month: " +
            callCountMap.getOrDefault(userId, 0)
        );
    }
}