package com.pankz.springboot.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController

public class TopicController {
    @RequestMapping("/topics")
    public List<Topics> getAllTopics() {
        return Arrays.asList(
                new Topics("spring"," Spring Framework","Spring Framework Description"),
                new Topics("java"," Core Java","Core Java Description"),
                new Topics("javascript"," JS ","JS Description")

        );
                //Whatever be the return type(return object) Spring MVC's @RestController converted automatically in to JSON AND SENT BACK AS HTTP response
    }

}
