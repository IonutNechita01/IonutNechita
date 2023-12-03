package ro.uvt.info.sp_lab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ro.uvt.info.sp_lab.Controllers.BookController;
import ro.uvt.info.sp_lab.Controllers.HelloController;

@Component
public class ClientComponent {
    private final TransientComponent tc;
    private final SingletonComponent sc;
    private final HelloController hc;

    private final BookController bc;
    @Autowired
    public ClientComponent(TransientComponent tc, SingletonComponent
            sc, HelloController hc, BookController bc) {
        this.tc = tc;
        this.sc = sc;
        this.hc = hc;
        this.bc = bc;
    }
}
