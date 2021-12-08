package a.zak.springcourse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//Controller for first hello-word static page 
@Controller
public class HelloController {
    @GetMapping("/hello-world")
    public String sayHello(){
        return "hello_world";
    }
}
