package ro.uvt.info.sp_lab;
import org.springframework.stereotype.Component;
@Component
public class SingletonComponent {
    public SingletonComponent() {
        System.out.println(
                "SingletonComponent::SingletonComponent = " + this);

    }
    public void operation() {
        System.out.println(
                "Invoked SingletonComponent::operation() on " + this);

    }
}
