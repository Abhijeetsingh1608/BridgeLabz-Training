package com.texteditor;

import java.util.Stack;

public class TextEditor {

    private String text = "";
    private Stack<String> undoStack = new Stack<>();
    private Stack<String> redoStack = new Stack<>();

    // Insert operation
    public void insert(String newText) {
        undoStack.push(text);
        text = text + newText;
        redoStack.clear();
        System.out.println("After insert: " + text);
    }

    // Delete last n characters
    public void delete(int count) {
        if (count > text.length()) {
            return;
        }

        undoStack.push(text);
        text = text.substring(0, text.length() - count);
        redoStack.clear();
        System.out.println("After delete: " + text);
    }

    // Undo operation
    public void undo() {
        if (undoStack.isEmpty()) {
            System.out.println("Nothing to undo");
            return;
        }

        redoStack.push(text);
        text = undoStack.pop();
        System.out.println("After undo: " + text);
    }

    // Redo operation
    public void redo() {
        if (redoStack.isEmpty()) {
            System.out.println("Nothing to redo");
            return;
        }

        undoStack.push(text);
        text = redoStack.pop();
        System.out.println("After redo: " + text);
    }
}
