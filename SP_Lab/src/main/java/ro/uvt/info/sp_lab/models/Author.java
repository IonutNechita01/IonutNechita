package ro.uvt.info.sp_lab.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor(force = true)
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private double id;

    // Getter and setter for books
    @Getter
    @ManyToMany()
    private final List<Book> books = new ArrayList<>();

    private final String name;

    public Author(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(name);
    }

    public void addBook(Book book) {
        book.setAuthor(this);
        books.add(book);
    }

    public void setBook(Book book) {
        this.books.add(book);
    }
}
