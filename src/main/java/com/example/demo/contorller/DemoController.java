package com.example.demo.contorller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.SQLException;

@RestController
@RequestMapping("/demo")
public class DemoController {

   @GetMapping("/dummy")
 public String dummyapi(@RequestParam String param) throws FileNotFoundException, SQLException {
       FileReader file = new FileReader("data.txt");

       // Artificial condition to throw SQLException
       if (file == null) {
           throw new SQLException("Database error occurred");
       }

       System.out.println("Processing completed");
     return param;
 }
}
