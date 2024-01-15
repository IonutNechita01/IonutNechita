package ro.uvt.info.sp_lab.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Transient;
import lombok.NoArgsConstructor;
import ro.uvt.info.sp_lab.models.Picture;
import ro.uvt.info.sp_lab.models.Element;
import ro.uvt.info.sp_lab.models.Image;

import java.awt.Dimension;

@Entity
@NoArgsConstructor(force = true)
public class ImageProxy extends BaseElement implements Picture, Visitee{
    private String url;
    private Dimension dim;
    @Transient
    private Image realImage;

    public ImageProxy(String url) {
        this.url = url;
        this.realImage = null;
    }

    public Image loadImage() {
        if (realImage == null) {
            realImage = new Image(url);
        }
        return realImage;
    }

    @Override
    public String url() {
        return url;
    }

    @Override
    public Dimension dim() {
        return dim;
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visitImageProxy(this);
    }
}
