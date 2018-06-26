package com.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main1 {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(TextEditorConfig.class);
        TextEditor textEditor = ctx.getBean(TextEditor.class);
        textEditor.spellingCheck();
    }
}
