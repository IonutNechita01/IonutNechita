package ro.uvt.info.sp_lab.services;

import org.springframework.stereotype.Component;
import ro.uvt.info.sp_lab.models.Book;

@Component
public class BookService {

    public Book saveBook(Book newBook) {
        System.out.println("Salvam cartea");
        return newBook;
    }
}
