package io.arukas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootHerokuApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootHerokuApplication.class, args);
    }

    @GetMapping("")
    public String welcome() {
        return "hello heroku";
    }

}
