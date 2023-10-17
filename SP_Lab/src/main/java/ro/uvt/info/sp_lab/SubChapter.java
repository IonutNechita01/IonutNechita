package ro.uvt.info.sp_lab;

import java.util.ArrayList;
import java.util.List;

public class SubChapter {
    
    private String name;
    private List<Object> content = new ArrayList<Object>();

    public SubChapter(String name) {
        this.name = name;
    }

    public void addContent(Object obj) {
        content.add(obj);
    }

    public void createNewParagraph(String text) {
        Paragraph paragraph = new Paragraph(text);
        content.add(paragraph);
    }

    public void createNewImage(String imageName) {
        Image image = new Image(imageName);
        content.add(image);
    }

    public void createNewTable(String title) {
        Table table = new Table(title);
        content.add(table);
    }

    public void print() {
        System.out.println("Subchapter: " + name);
        for (Object obj : content) {
            if (obj instanceof Paragraph) {
                ((Paragraph) obj).print();
            } else if (obj instanceof Image) {
                ((Image) obj).print();
            } else if (obj instanceof Table) {
                ((Table) obj).print();
            }
        }
    }
}
