package com.medwarehouse;

public class Medicine {
    private String name;
    private String batchNo;
    private int expiryDays; // days left to expire

    public Medicine(String name, String batchNo, int expiryDays) {
        this.name = name;
        this.batchNo = batchNo;
        this.expiryDays = expiryDays;
    }

    public int getExpiryDays() {
        return expiryDays;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " (Batch " + batchNo + ") -> Expires in "
                + expiryDays + " days";
    }
}
