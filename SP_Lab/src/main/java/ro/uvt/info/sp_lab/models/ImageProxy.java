package ro.uvt.info.sp_lab.models;

import ro.uvt.info.sp_lab.models.Picture;
import ro.uvt.info.sp_lab.models.Element;
import ro.uvt.info.sp_lab.models.Image;

import java.awt.Dimension;

public class ImageProxy implements Element, Picture, Visitee{
    private String url;
    private Dimension dim;
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
