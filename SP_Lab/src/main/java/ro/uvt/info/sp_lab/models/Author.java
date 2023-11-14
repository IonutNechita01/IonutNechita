package ro.uvt.info.sp_lab.models;

public class Author {
    
    private String name;

    public Author(String name) {
        this.name = name;
    }
    
    public void print() {
        System.out.println(name);
    }
}
