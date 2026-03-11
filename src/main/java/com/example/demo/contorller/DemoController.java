package com.example.demo.contorller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

   @GetMapping("/dummy")
 public String dummyapi(@RequestParam String param) {

       String numbers[] = {"10", "20", "ABC", "40"};

       for (int i = 0; i <= numbers.length; i++) {

           int a = Integer.parseInt(numbers[i]);
       }

      Integer abc =  Integer.parseInt("AAA");
     return param;
 }
}
