package com.patterns.prototype;

public class PrototypeApplication {
    private static final String SIZE_PAPER = "A4";
    private static final String COLOR_OF_PAPER = "black";

    public static void main(String[] args) {
        SheetOfPaper paper = new SheetOfPaper(SIZE_PAPER, COLOR_OF_PAPER);
        System.out.println(paper);

        PaperFactory paperFactory = new PaperFactory(paper);
        SheetOfPaper firstPaper = paperFactory.makeCopy();
        SheetOfPaper secondPaper = paperFactory.makeCopy();
        System.out.println(firstPaper);
        System.out.println(secondPaper);
    }
}
