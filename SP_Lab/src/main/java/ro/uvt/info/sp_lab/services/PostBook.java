package ro.uvt.info.sp_lab.services;

import ro.uvt.info.sp_lab.models.Book;

public class PostBook implements  Command<Book>{

    private final Book newBook;
    private final BookService bookService;

    public PostBook(Book newBook, BookService bookService) {
        this.newBook = newBook;
        this.bookService = bookService;
    }
    @Override
    public Book execute() {
        return this.bookService.saveBook(this.newBook);
    }
}
