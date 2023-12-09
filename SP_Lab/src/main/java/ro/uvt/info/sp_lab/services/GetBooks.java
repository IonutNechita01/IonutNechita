package ro.uvt.info.sp_lab.services;

import ro.uvt.info.sp_lab.models.Book;

import java.util.List;

public class GetBooks implements Command<List<Book>> {

    @Override
    public List<Book> execute() {
        return List.of(new Book("Un exemplu"));
    }
}
