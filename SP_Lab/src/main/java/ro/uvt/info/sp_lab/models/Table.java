package ro.uvt.info.sp_lab.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import ro.uvt.info.sp_lab.models.Element;

@Getter
@Entity
@NoArgsConstructor(force = true)
public class Table extends BaseElement implements Visitee {
    
    private String title;

    public Table(String title) {
        this.title = title;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitTable(this);
    }

}
