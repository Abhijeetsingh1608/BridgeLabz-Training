package com.texteditor;

public class TextEditorMain{

    public static void main(String[] args) {

        TextEditor editor = new TextEditor();

        editor.insert("Hello");
        editor.insert(" World");
        editor.delete(5);

        editor.undo();
        editor.undo();

        editor.redo();
    }
}
