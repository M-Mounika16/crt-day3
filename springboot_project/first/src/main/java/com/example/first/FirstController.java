package com.example.first;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    
    @RequestMapping("/movie")
    public String first(){
        return "movie";
    }
}
