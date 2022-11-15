package br.com.alura.mvc.mudi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    @ResponseBody()
    public List<String> test() {
        return Arrays.asList("el1", "el2", "el3", "el4", "ellll5");
    }
}
