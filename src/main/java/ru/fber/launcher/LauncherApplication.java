package ru.fber.launcher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.security.web.authentication.HttpStatusEntryPoint;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collections;
import java.util.Map;

import static java.lang.String.format;

@SpringBootApplication
@RestController
public class LauncherApplication {

    @GetMapping("/redirect")
    public ModelAndView lk() {
        return new ModelAndView("redirect:http://localhost:9080/lk");
    }

    public static void main(String[] args) {
        SpringApplication.run(LauncherApplication.class, args);
    }
}