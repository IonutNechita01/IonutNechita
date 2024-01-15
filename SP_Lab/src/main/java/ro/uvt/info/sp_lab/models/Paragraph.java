package ro.uvt.info.sp_lab.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Transient;
import lombok.NoArgsConstructor;
import ro.uvt.info.sp_lab.services.AlignStrategy;
import ro.uvt.info.sp_lab.models.Context;
import ro.uvt.info.sp_lab.models.Element;

@Entity
@NoArgsConstructor(force = true)
public class Paragraph extends BaseElement implements Visitee {
    
    private final String text;

    @Transient
    private final AlignStrategy strategy;

    @Transient
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
