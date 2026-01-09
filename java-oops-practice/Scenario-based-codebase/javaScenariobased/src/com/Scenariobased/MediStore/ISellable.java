package com.Scenariobased.MediStore;

public interface ISellable {

    void sell(int quantity);

    boolean checkExpiry();
}