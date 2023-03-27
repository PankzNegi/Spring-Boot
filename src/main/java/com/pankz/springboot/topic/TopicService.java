package com.pankz.springboot.topic;


import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService
{
    //Here we moved this to separate business service.Everytime a request comes in this list is sent as response
 private List<Topics> topics= Arrays.asList(
        new Topics("spring"," Spring Framework","Spring Framework Description"),
        new Topics("java"," Core Java","Core Java Description"),
        new Topics("javascript"," JS ","JS Description")

        );
 public List<Topics> getAlltopics()
 {
     return topics;
 }
 public Topics getTopics(String id)
 {
     return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();

 }
}

/*NOTE-Business Service  are Singletons,when an application starts up spring creates an instance of service and then it keeps it in its m/m
Other controller depends on this,it declares a dependency to tell spring that it needs the service and spring inject it to those classes
 */

/* NOTE-02-->When an application starts it detects the classpath with all classes having @service  and then it cretaes an instances of all those classes
now in any other classes e.g here topiccontroller we want an instance of this service,we can get by declaring as a member and spring will inject it.
as annotated @restcontroller so no 'new' each time spring will do it for us.When spring creates an instance of TestController it looks for
member variable and see if any of them has dependency to TopiService and inject that
 */