package ro.uvt.info.sp_lab;

public class AlignRight implements AlignStrategy{

    @Override
    public void render(String paragraph, Context context) {
        for (int i = 0; i < context.getY(); i++) {
            System.out.println("\n");
        }
        StringBuilder xStartPosition = new StringBuilder();
        xStartPosition.append(" ".repeat(Math.max(0, context.getX())));
        int currentWidth = 0;
        StringBuilder line = new StringBuilder();
        for(String word: paragraph.split(" ")) {
            final int wordLen = word.length();
            if (wordLen + currentWidth > context.getWidth()) {
                System.out.print(" ".repeat(Math.max(0, context.getWidth() - currentWidth)));
                System.out.print(xStartPosition);
                System.out.print(line);
                line.setLength(0);
                currentWidth = 0;
                System.out.print("\n");
            }
            line.append(" " + word);
            currentWidth += wordLen;
        }
    }
}
