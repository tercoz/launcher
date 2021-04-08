package ru.fber.launcher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@SpringBootApplication
@RestController
public class LauncherApplication {

    @RequestMapping("/")
    public ModelAndView root(HttpSession session) {
        session.setAttribute("slavs", "here");
        return new ModelAndView("redirect:http://localhost:9080");
    }

    public static void main(String[] args) {
        SpringApplication.run(LauncherApplication.class, args);
    }
}