package ro.uvt.info.sp_lab;

import java.util.ArrayList;
import java.util.List;

public class Chapter {
    
    private String name;
    private List<SubChapter> subChapters = new ArrayList<SubChapter>();

    public Chapter(String name) {
        this.name = name;
    }

    public int createSubChapter(String subChapterName) {
        SubChapter subChapter = new SubChapter(subChapterName);
        subChapters.add(subChapter);
        return subChapters.indexOf(subChapter);
    }

    public SubChapter getSubChapter(int index) {
        return subChapters.get(index);
    }

    public void print() {
        System.out.println("Chapter: " + name);
    }
}
