package ro.uvt.info.sp_lab.models;

import lombok.Getter;
import ro.uvt.info.sp_lab.models.Picture;
import ro.uvt.info.sp_lab.models.Element;

import java.awt.Dimension;
import java.util.concurrent.TimeUnit;

@Getter
public class Image implements Element, Picture, Visitee {

    private final String imageName;

    public Image(String name) {
        imageName = name;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String url() {
        return imageName;
    }

    @Override
    public Dimension dim() {
        return new Dimension(100, 100);
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visitImage(this);
    }

}
