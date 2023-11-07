package ro.uvt.info.sp_lab;

public class Paragraph implements Element{
    
    private final String text;

    public Paragraph(String text) {
        this.text = text;
    }

    public void print() {
        System.out.println("Paragraph: " + text);
    }

    public void setAlignStrategy(AlignStrategy strategy, Context context) {
        strategy.render(text, context);
    }
}
