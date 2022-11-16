package br.com.alura.mvc.mudi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.thymeleaf.extras.java8time.dialect.Java8TimeDialect;

@SpringBootApplication
public class MudiApplication {

    public static void main(String[] args) {
        SpringApplication.run(MudiApplication.class, args);
    }


}
