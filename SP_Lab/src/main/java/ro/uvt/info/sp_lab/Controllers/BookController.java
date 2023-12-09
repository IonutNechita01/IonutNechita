package ro.uvt.info.sp_lab.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ro.uvt.info.sp_lab.models.Book;
import ro.uvt.info.sp_lab.services.BookService;
import ro.uvt.info.sp_lab.services.GetBooks;
import ro.uvt.info.sp_lab.services.PostBook;

import java.util.List;

@RestController()
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
    @GetMapping("/")
    public List<Book> getBooks() {
        var command = new GetBooks();
        return command.execute();
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable int id) {
        System.out.println("search by id: " + id);
        return new Book("alt exemplu");
    }

    @PostMapping("/")
    public Book createBook(@RequestBody Book book) {
        var command = new PostBook(book, this.bookService);
        return command.execute();
    }

    @PutMapping("/{id}")
    public Book updateBook(@RequestBody Book book, @PathVariable int id) {
        System.out.println("Update by id: " + id);
        return new Book(book.getTitle());
    }

    @DeleteMapping("/{id}")
    public HttpStatus deleteBook(@PathVariable int id) {
        System.out.println("Delete by id: " + id);
        return HttpStatus.OK;
    }
}
