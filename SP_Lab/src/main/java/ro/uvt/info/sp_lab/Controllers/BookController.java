package ro.uvt.info.sp_lab.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ro.uvt.info.sp_lab.models.Book;

import java.util.List;

@RestController
public class BookController {

    @GetMapping("/books")
    public List<Book> getBooks() {
        return List.of(new Book("Un exemplu"));
    }

    @GetMapping("/books/{id}")
    public Book getBookById(@PathVariable int id) {
        System.out.println("search by id: " + id);
        return new Book("alt exemplu");
    }

    @PostMapping("/books")
    public Book createBook(@RequestBody Book book) {
        return new Book(book.getTitle());
    }

    @PutMapping("/books/{id}")
    public Book updateBook(@RequestBody Book book, @PathVariable int id) {
        System.out.println("Update by id: " + id);
        return new Book(book.getTitle());
    }

    @DeleteMapping("/books/{id}")
    public HttpStatus deleteBook(@PathVariable int id) {
        System.out.println("Delete by id: " + id);
        return HttpStatus.OK;
    }
}
