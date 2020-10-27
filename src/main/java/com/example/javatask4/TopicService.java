package com.example.javatask4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    @Autowired
    private TopicRepository repository;

   private List<TopicClass> topics=new ArrayList<>(Arrays.asList(
                new TopicClass("spring","springid","springdescript"),
                new TopicClass("java","javaid","javadescript"),
                new TopicClass("springboot","springbootid","springbootdescript")
         ));
           public List<TopicClass> getAllTopics(){
           return topics;
    }
    public TopicClass getTopic(String id){
               return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(TopicClass topic){
               repository.save(topic);
               topics.add(topic);
    }
    public void updateTopic(String id,TopicClass topic){
               for(int i=0;i<topics.size();i++){
                   TopicClass t=topics.get(i);
                   if(t.getId().equals(id)){
                       topics.set(i,topic);
                       return;
                   }
               }
    }
    public void deleteTopic(String id){
        topics.removeIf(t -> t.getId().equals(id));
    }

}
