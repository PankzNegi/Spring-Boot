package com.pankz.springboot;


//Spring boot creates an application that is standalone.
// It doesn't need a servlet container,doesn't need to be deployed on a server
//This main class will create servlet container and starts it host an application for us.

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //It tells Spring boot that this main class  is the starting point of spring boot application
public class CourseApiApp {
    public static void main(String[] args) {
        SpringApplication.run(CourseApiApp.class,args); //passing the name of class where we have our main method
        //SpringApplication is a static class which has method run()
      //  It has everything it needs to create servlet container and run

    }
}
