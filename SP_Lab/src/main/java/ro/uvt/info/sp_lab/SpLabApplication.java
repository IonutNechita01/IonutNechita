package ro.uvt.info.sp_lab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpLabApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpLabApplication.class, args);
        Book discoTitanic = new Book("Disco Titanic");
        Author author = new Author("Radu Pavel Gheo");
        discoTitanic.addAuthor(author);
        Section sec1 = new Section("Capitolul 1");
        Section sec11 = new Section("Capitolul 1.1");
        Section sec111 = new Section("Capitolul 1.1.1");
        sec1.add(new Paragraph("Paragraph 1"));
        sec1.add(sec11);
        sec11.add(sec111);
        sec1.add(new Image("Image 1"));
        sec11.add(new Paragraph("Paragraph 2"));
        sec11.add(new Table("Table 1"));
        sec111.add(new Paragraph("Paragraph 3"));
        discoTitanic.createSection(sec1);
        discoTitanic.print();
    }

}
