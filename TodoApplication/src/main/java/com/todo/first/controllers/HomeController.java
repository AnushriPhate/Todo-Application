package com.todo.first.controllers;

import com.todo.first.config.SpringConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class HomeController {
    @Value("${spring.profile.image.path}")
    private String profilePath;
    @Autowired
    private SpringConfig springConfig;

    @RequestMapping("/todos")
    public List<String> justTest() {
        List<String> todos = Arrays.asList(
                "Learn java",
                "Learn SpringBoot",
                "Develop project",
                "Learn Django",
                "Learn Spring",
                "Learn Node JS"
        );
        return todos;
    }

    @RequestMapping("/profile-path")
    public String getProfilePath(){
        return this.profilePath;
    }

    @RequestMapping("/springConfig")
    public SpringConfig getSpringConfig(){
        System.out.println(this.springConfig);
        return this.springConfig;
    }
}
