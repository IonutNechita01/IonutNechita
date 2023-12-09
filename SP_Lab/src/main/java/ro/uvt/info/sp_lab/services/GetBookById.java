package ro.uvt.info.sp_lab.services;

import ro.uvt.info.sp_lab.models.Book;

public class GetBookById implements Command<Book> {

    @Override
    public Book execute() {
        return new Book("Alt exemplu");
    }
}
