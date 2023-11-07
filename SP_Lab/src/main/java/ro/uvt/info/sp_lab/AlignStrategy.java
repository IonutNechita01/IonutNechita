package ro.uvt.info.sp_lab;
import ro.uvt.info.sp_lab.Paragraph;

interface AlignStrategy {
    public void render(String paragraph, Context context);
}