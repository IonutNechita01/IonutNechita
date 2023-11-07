package ro.uvt.info.sp_lab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpLabApplication {

    public static void main(String[] args) {
        Paragraph p1 = new Paragraph("In the heart of the bustling city, the streets thrummed with life. People hurried along the sidewalks, their footsteps creating a symphony of movement. Tall skyscrapers reached for the sky, their glass facades reflecting the golden rays of the setting sun. The aroma of street food wafted through the air, tempting passersby with its tantalizing scent Amidst the urban chaos, a sense of unity prevailed. Diverse individuals from various backgrounds and walks of life came together in this vibrant metropolis. They shared the same crowded subways, visited the same local coffee shops, and celebrated the city's festivals with a collective spirit that transcended their differences. On the outskirts of the city, nature's beauty unfolded. Rolling hills stretched as far as the eye could see, and wildflowers danced in the breeze. The countryside offered a serene escape from the urban hustle and bustle, providing solace to those seeking a moment of respite. Whether in the heart of the city or on the outskirts, the world continued to turn, and life carried on with its unending rhythm. Each day brought new challenges and opportunities, woven into the tapestry of existence.");
        p1.setAlignStrategy(new AlignLeft(), new Context(10, 2, 100));
        p1.setAlignStrategy(new AlignRight(), new Context(40, 2, 50));
    }

}
