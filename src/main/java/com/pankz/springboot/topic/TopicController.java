package com.pankz.springboot.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController

public class TopicController {
    @Autowired
    private TopicService topicService;
    @RequestMapping("/topics")
    public List<Topics> getAllTopics() {
        return topicService.getAlltopics();

    }
    @RequestMapping("/topics/{id}")
    public Topics getTopics(@PathVariable  String id)
    {
        return topicService.getTopics(id);
    }
  @RequestMapping(method = RequestMethod.POST,value="/topics")
    public void addTopics(@RequestBody Topics topics)
    {
        topicService.addTopics(topics);
    }

}
//Whatever be the return type(return object) Spring MVC's @RestController converted automatically in to JSON AND SENT BACK AS HTTP response