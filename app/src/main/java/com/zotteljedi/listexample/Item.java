package com.zotteljedi.listexample;

public class Item {

    private String text;
    private String subText;

    public Item(String text, String subText) {
        this.text = text;
        this.subText = subText;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSubText() {
        return subText;
    }

    public void setSubText(String subText) {
        this.subText = subText;
    }
}
