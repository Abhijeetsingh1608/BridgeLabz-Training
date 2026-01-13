package com.callcentre;

public class CallCentreMain {
    public static void main(String[] args) {

        CallCenter center = new CallCenter();

        Customer c1 = new Customer("U101", "Rahul", false);
        Customer c2 = new Customer("U102", "Anita", true);
        Customer c3 = new Customer("U101", "Rahul", false);

        center.receiveCall(c1);
        center.receiveCall(c2);
        center.receiveCall(c3);

        center.handleCall();
        center.handleCall();

        center.showCallCount("U101");
    }
}
