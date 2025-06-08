package com.conceptandcoding.learningspringboot.service;

import java.beans.PropertyEditorSupport;

public class FirstNamePropertyEditor extends PropertyEditorSupport {
    @Override
    public void setAsText(String text) {
        setValue(text.trim().toLowerCase());
    }
}
