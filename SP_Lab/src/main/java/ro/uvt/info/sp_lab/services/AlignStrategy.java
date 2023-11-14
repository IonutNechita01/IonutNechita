package ro.uvt.info.sp_lab.services;
import ro.uvt.info.sp_lab.models.Context;

public interface AlignStrategy {
    public void render(String paragraph, Context context);
}