package ro.uvt.info.sp_lab.models;

import ro.uvt.info.sp_lab.models.Element;

public class Table implements Element {
    
    private String title;

    public Table(String title) {
        this.title = title;
    }
    
    public void print() {
        System.out.println("Table: " + title);
    }
}
