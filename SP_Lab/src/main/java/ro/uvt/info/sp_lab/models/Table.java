package ro.uvt.info.sp_lab.models;

import ro.uvt.info.sp_lab.models.Element;

public class Table implements Element, Visitee {
    
    private String title;

    public Table(String title) {
        this.title = title;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitTable(this);
    }

    public String getTitle() {
        return this.title;
    }
}
