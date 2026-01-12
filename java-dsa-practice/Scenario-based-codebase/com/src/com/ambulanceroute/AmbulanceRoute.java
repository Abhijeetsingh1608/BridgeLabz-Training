package com.ambulanceroute;

class AmbulanceRoute {

    private HospitalUnit head = null;

    // Add hospital unit
    public void addUnit(String name, boolean available) {
        HospitalUnit newUnit = new HospitalUnit(name, available);

        if (head == null) {
            head = newUnit;
            newUnit.next = head;
            return;
        }

        HospitalUnit temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newUnit;
        newUnit.next = head;
    }

    // Find nearest available unit
    public HospitalUnit findAvailableUnit() {

        if (head == null) return null;

        HospitalUnit temp = head;

        do {
            if (temp.available) {
                System.out.println("🚑 Redirecting patient to: " + temp.name);
                return temp;
            }
            temp = temp.next;
        } while (temp != head);

        System.out.println("❌ No unit available");
        return null;
    }

    // Remove unit under maintenance
    public void removeUnit(String unitName) {

        if (head == null) return;

        HospitalUnit curr = head;
        HospitalUnit prev = null;

        do {
            if (curr.name.equals(unitName)) {

                // Single unit case
                if (curr == head && curr.next == head) {
                    head = null;
                    return;
                }

                // Removing head
                if (curr == head) {
                    HospitalUnit last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                } else {
                    prev.next = curr.next;
                }

                System.out.println("⚠️ Unit removed for maintenance: " + unitName);
                return;
            }

            prev = curr;
            curr = curr.next;

        } while (curr != head);
    }

    // Display route
    public void displayRoute() {

        if (head == null) {
            System.out.println("No hospital units");
            return;
        }

        HospitalUnit temp = head;
        System.out.print("Hospital Route: ");

        do {
            System.out.print(temp.name + " → ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(Back to " + head.name + ")");
    }
}
