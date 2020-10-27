package com.example.javatask4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {


    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<TopicClass> getAllTopics(){
        return topicService.getAllTopics();
    }

    @RequestMapping("/topics/{id}")
    public TopicClass getTopic(@PathVariable String id){
        return topicService.getTopic(id);
    }

    @RequestMapping(method=RequestMethod.POST,value="/topics")
    public void addTopic(@RequestBody TopicClass topic){
          topicService.addTopic(topic);
    }

    @RequestMapping(method=RequestMethod.PUT,value="/topics/{id}")
    public void updateTopic(@RequestBody TopicClass topic,@PathVariable String id){
        topicService.updateTopic(id,topic);
    }
    @RequestMapping(method=RequestMethod.DELETE,value="/topics/{id}")
    public void deleteTopic(@PathVariable String id){
        topicService.deleteTopic(id);
    }
}