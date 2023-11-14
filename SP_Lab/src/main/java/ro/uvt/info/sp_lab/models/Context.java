package ro.uvt.info.sp_lab.models;

import lombok.Getter;

public class Context {
    @Getter
    private int x;
    @Getter
    private int y;
    @Getter
    private int w;
    @Getter
    private int pageX;
    @Getter
    private int pageY;
    public Context(int x, int y, int w) {
//        this.x = x;
//        this.y = y;
//        this.w = w;
        this.pageX = 1000;
        this.pageY = 1000;
        this.x = x;
        this.y = y;
        this.w = w;
    }

    public int getWidth() {
        return this.w;
    }
}
