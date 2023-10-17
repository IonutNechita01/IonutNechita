package ro.uvt.info.sp_lab;

import java.util.ArrayList;
import java.util.List;

public class Book {
    
    private String title;
    private TableOfContents tableOfContents;
    private List<Author> authors = new ArrayList<>();
    private List<Chapter> chapters = new ArrayList<>();

    public Book(String title) {
        this.title = title;
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public int createChapter(String chapterName) {
        Chapter chapter = new Chapter(chapterName);
        chapters.add(chapter);
        return chapters.indexOf(chapter);
    }

    public Chapter getChapter(int index) {
        return chapters.get(index);
    }

    public void setTableOfContents(TableOfContents tableOfContents) {
        this.tableOfContents = tableOfContents;
    }

    public TableOfContents getTableOfContents() {
        return tableOfContents;
    }

    public void print() {
        System.out.println("Book: " + title);
    }
}
