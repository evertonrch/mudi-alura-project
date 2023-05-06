package br.com.alura.mvc.mudi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SpringBootApplication()
public class MudiApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(MudiApplication.class, args);
    }

    @GetMapping("/")
    public ModelAndView redirectToServices() {
        return new ModelAndView("redirect:/home");
    }
}
