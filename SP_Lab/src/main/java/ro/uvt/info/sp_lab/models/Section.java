package ro.uvt.info.sp_lab.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@Entity
@NoArgsConstructor(force = true)
@Getter
public class Section extends BaseElement implements Visitee {

    private String name;

    @OneToMany(targetEntity = BaseElement.class)
    private final List<Element> content = new ArrayList<>();

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

    @Override
    public void accept(Visitor visitor) {
        visitor.visitSection(this);
    }

}
