package ru.fber.launcher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.fber.launcher.session.ignite.EnableIgniteHttpSession;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@RestController
@EnableIgniteHttpSession
public class LauncherApplication {

    @RequestMapping("/")
    public void root(HttpServletResponse response, HttpSession session) throws IOException {
        session.setAttribute("slavs", "here");
        response.sendRedirect("http://localhost:9080");
    }

    public static void main(String[] args) {
        SpringApplication.run(LauncherApplication.class, args);
    }
}
