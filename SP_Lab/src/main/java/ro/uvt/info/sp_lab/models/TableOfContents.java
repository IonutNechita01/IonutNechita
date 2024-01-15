package ro.uvt.info.sp_lab.models;

import jakarta.persistence.Entity;
import ro.uvt.info.sp_lab.models.Element;

@Entity
class TableOfContents extends BaseElement implements  Visitee {

    @Override
    public void accept(Visitor visitor) {

    }
}