package com.pankz.springboot.hello;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Purpose of this controller to map the URL request /hello
//@RestController-->It means we h've methods in this class which map to URL request
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String sayHii()
    {
        return "Hii!!!!"; //return value as the response
    }




}
//@RequestMapping tells the spring framework that whenever there is any http request to this application at /hello this method is executed...
//@RequestMapping  by default maps only to GET methods.