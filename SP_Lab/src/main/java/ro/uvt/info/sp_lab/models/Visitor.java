package ro.uvt.info.sp_lab.models;

import ro.uvt.info.sp_lab.services.AlignStrategy;

public interface Visitor {

    void visitImageProxy(ImageProxy imageProxy);
    void visitImage(Image image);
    void visitTable(Table table);
    void visitSection(Section section);
    void visitTableOfContents(TableOfContents tableOfContents);
    void visitParagraph(Paragraph paragraph);
    void visitBook(Book book);
}
