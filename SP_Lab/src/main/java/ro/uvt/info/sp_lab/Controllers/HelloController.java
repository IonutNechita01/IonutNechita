package ro.uvt.info.sp_lab.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.util.HashMap;
import java.net.http.HttpRequest;
@RestController
public class HelloController {
    @GetMapping("/")
    public String hello() {
        return "hello";

    }
}
