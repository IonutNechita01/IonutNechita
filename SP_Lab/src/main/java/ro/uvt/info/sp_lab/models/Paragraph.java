package ro.uvt.info.sp_lab.models;

import ro.uvt.info.sp_lab.services.AlignStrategy;
import ro.uvt.info.sp_lab.models.Context;
import ro.uvt.info.sp_lab.models.Element;

public class Paragraph implements Element, Visitee {
    
    private final String text;
    private final AlignStrategy strategy;
    private  final Context context;

    public Paragraph(String text, AlignStrategy strategy, Context context) {
        this.text = text;
        this.strategy = strategy;
        this.context = context;
    }

    public void setAlignStrategy() {
        strategy.render(text, context);
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visitParagraph(this);
    }

    public String getText() {
        return this.text;
    }
}
