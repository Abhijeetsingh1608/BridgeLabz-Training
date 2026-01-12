package com.browserbuddy;

public class BrowserBuddyMain {
    public static void main(String[] args) {

        BrowserManager manager = new BrowserManager();
        BrowserTab tab1 = new BrowserTab();

        tab1.visit("google.com");
        tab1.visit("github.com");
        tab1.visit("stackoverflow.com");

        tab1.back();
        tab1.back();
        tab1.forward();

        manager.closeTab(tab1);

        BrowserTab restoredTab = manager.reopenTab();
        System.out.println("Current Page: " + restoredTab.getCurrentPage());
    }
}
