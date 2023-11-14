package ro.uvt.info.sp_lab.models;

import ro.uvt.info.sp_lab.models.Element;

import java.util.ArrayList;
import java.util.List;


public class Section implements Element {
    
    private String name;
    private List<Element> content = new ArrayList<>();

    public Section(String name) {
        this.name = name;
    }

    @Override
    public void add(Element elm) {
        content.add(elm);
    }

    @Override
    public void remove(Element elm) {
        content.remove(elm);
    }

    @Override
    public Element getElement(int index) {
        return content.get(index);
    }

    public void print() {
        System.out.println("Section: " + name);
        for (Element element : content) {
            element.print();
        }
    }
}
