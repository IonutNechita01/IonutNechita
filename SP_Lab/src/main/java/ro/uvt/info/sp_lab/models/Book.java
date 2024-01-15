package ro.uvt.info.sp_lab.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import jakarta.persistence.*;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor(force = true)
public class Book extends Section implements Visitee {

    private String title;

    @ManyToMany
    private final List<Author> authors = new ArrayList<>();

    @OneToMany
    private final List<Section> sections = new ArrayList<>();

    @JsonCreator
    public Book(String title) {
        super(title);
        this.title = title;
    }

    public int createSection(Section section) {
        sections.add(section);
        return sections.indexOf(section);
    }

    public Section getSection(int index) {
        return sections.get(index);
    }

    public void setAuthor(Author author) {
        this.authors.add(author);
    }

    public void addAuthor(Author author) {
        this.authors.add(author);
        author.setBook(this);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitBook(this);
    }

}
