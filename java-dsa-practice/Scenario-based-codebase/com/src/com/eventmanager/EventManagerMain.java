package com.eventmanager;

class EventManagerMain {

    public static void main(String[] args) {

        Ticket[] tickets = {
            new Ticket(1200),
            new Ticket(500),
            new Ticket(2500),
            new Ticket(800),
            new Ticket(1500)
        };

        System.out.println("Before Sorting:");
        display(tickets);

        QuickSorter.quickSort(tickets, 0, tickets.length - 1);

        System.out.println("\nAfter Sorting by Price:");
        display(tickets);

        System.out.println("\nTop Cheapest Ticket: " + tickets[0].price);
        System.out.println("Top Expensive Ticket: " + 
                            tickets[tickets.length - 1].price);
    }

    static void display(Ticket[] tickets) {
        for (Ticket t : tickets) {
            System.out.print(t.price + " ");
        }
        System.out.println();
    }
}
