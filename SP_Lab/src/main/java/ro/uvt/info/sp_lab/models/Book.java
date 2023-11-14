package ro.uvt.info.sp_lab.models;

import java.util.ArrayList;
import java.util.List;

public class Book extends Section {
    
    private String title;
    private List<Author> authors = new ArrayList<>();
    private List<Section> sections = new ArrayList<>();

    public Book(String title) {
        super(title);
        this.title = title;
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public int createSection(Section section) {
        sections.add(section);
        return sections.indexOf(section);
    }

    public Section getSection(int index) {
        return sections.get(index);
    }

    public void print() {
        System.out.println("Book: " + title);
        System.out.print("Authors: ");
        for (Author author : authors) {
            author.print();
        }
        for (Section section : sections) {
            section.print();
        }
    }
}
