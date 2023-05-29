package myproject.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {



    @GetMapping("/welcome")
    public String welcome(){
        return "This is first application";
    }}
