package com.patterns.prototype;

public class PaperFactory {
    SheetOfPaper sheetOfPaper;

    public PaperFactory(SheetOfPaper sheetOfPaper) {
        setPrototype(sheetOfPaper);
    }

    private void setPrototype(SheetOfPaper sheetOfPaper) {
        this.sheetOfPaper = sheetOfPaper;
    }

    public SheetOfPaper makeCopy() {
        return (SheetOfPaper) sheetOfPaper.copy();
    }
}
