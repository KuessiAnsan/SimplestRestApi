package com.example.starter.SimpleRestApi;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course>retrieveAllCourses(){
        return Arrays.asList(
                new Course(1L, "Devenir développeur JAVA", "Jean-Philippe EHRET"),
                new Course(2L, "Java Testing with JUnit 4 / 5", "In28minutes"),
                new Course(3L, "Spring Boot tutorial for beginners", "In28minutes")
        );
    }
}
