package test;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class Example {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/feature")
    String feature() {
        return "I just wanted to create first feature";
    }

    @RequestMapping("/feature2")
    String feature2() {
        return "I just wanted to create a feature number 2";
    }

    @RequestMapping("/feature3")
    String feature3() {
        return "I just wanted to create a feature number 3 a";
    }


    public static void main(String[] args) throws Exception {
        SpringApplication.run(Example.class, args);
    }

}