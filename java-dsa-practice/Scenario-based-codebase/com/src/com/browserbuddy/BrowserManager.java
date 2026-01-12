package com.browserbuddy;

import java.util.Stack;

class BrowserManager {

    private Stack<BrowserTab> closedTabs = new Stack<>();

    // Close tab
    public void closeTab(BrowserTab tab) {
        closedTabs.push(tab);
        System.out.println("Tab closed");
    }

    // Restore recently closed tab
    public BrowserTab reopenTab() {
        if (!closedTabs.isEmpty()) {
            System.out.println("Tab restored");
            return closedTabs.pop();
        }
        System.out.println("No tabs to restore");
        return null;
    }
}
