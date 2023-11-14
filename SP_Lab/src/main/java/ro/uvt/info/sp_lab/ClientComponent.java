package ro.uvt.info.sp_lab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ro.uvt.info.sp_lab.Controllers.HelloController;

@Component
public class ClientComponent {
    private final TransientComponent tc;
    private final SingletonComponent sc;
    private final HelloController hc;
    @Autowired
    public ClientComponent(TransientComponent tc, SingletonComponent
            sc, HelloController hc) {
        this.tc = tc;
        this.sc = sc;
        this.hc = hc;
        System.out.println("ClientComponent::ClientComponent = " +

                this);
        System.out.println(" o SingletonComponent = " + sc);
        System.out.println(" o TransientComponent = " + tc);
        System.out.println(" o HelloComponent = " + hc);
    }
    public void operation() {
        System.out.println("Invoked ClientComponent::operation() on " +
                this);
        System.out.println(" o SingletonComponent = " + sc);
        System.out.println(" o TransientComponent = " + tc);
        System.out.println(" o TransientComponent = " + hc);
    }
}
