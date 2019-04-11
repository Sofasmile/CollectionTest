package com.patterns.prototype;

import lombok.ToString;

@ToString
public class SheetOfPaper implements Copyable {
    private String size;
    private String color;

    public SheetOfPaper(String size, String color) {
        this.size = size;
        this.color = color;
    }

    @Override
    public Object copy() {
        SheetOfPaper copy = new SheetOfPaper(size, color);
        return copy;
    }
}
