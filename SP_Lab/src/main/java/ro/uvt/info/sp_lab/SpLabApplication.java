package ro.uvt.info.sp_lab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ApplicationContext;
import ro.uvt.info.sp_lab.Controllers.HelloController;
import ro.uvt.info.sp_lab.models.Book;
import ro.uvt.info.sp_lab.models.RenderContentVisitor;

@SpringBootApplication
public class SpLabApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpLabApplication.class, args);
        Book myBook = new Book("title");
        myBook.accept(new RenderContentVisitor());
    }

}
