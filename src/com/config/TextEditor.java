package com.config;

public class TextEditor {
    public SpellChecker spellChecker;

    public TextEditor(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
        System.out.println("Inside TextEditor constructor.");
    }

    public void spellingCheck(){
        spellChecker.checkSpelling();
    }
}
