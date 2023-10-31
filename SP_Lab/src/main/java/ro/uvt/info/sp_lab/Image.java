package ro.uvt.info.sp_lab;

import java.awt.Dimension;
import java.util.concurrent.TimeUnit;

public class Image implements Element, Picture {

    private String imageName;

    public Image(String name) {
        imageName = name;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void print() {
        System.out.println("Image with name: " + imageName);
    }

    @Override
    public String url() {
        return imageName;
    }

    @Override
    public Dimension dim() {
        return new Dimension(100, 100);
    }
}
