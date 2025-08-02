package com.abhishek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class StartApplication {

    @GetMapping("/")
    public String index(final Model model) {
        model.addAttribute("title", "I have successfuly built a sprint boot application using Maven");
        model.addAttribute("msg", "This application is deployed on to Kubernetes using Argo CD");
        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello"); // Creates a new object in memory
        String str4 = "World";

        // Comparing content using equals()
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // true (content is the same)
        System.out.println("str1.equals(str3): " + str1.equals(str3)); // true (content is the same)
        System.out.println("str1.equals(str4): " + str1.equals(str4)); // false (content is different)

        // Comparing references using ==
        System.out.println("str1 == str2: " + (str1 == str2)); // true (string literals often refer to the same object in the string pool)
        System.out.println("str1 == str3: " + (str1 == str3)); // fal
    }

    
}
