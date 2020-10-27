package com.example.javatask4;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="TopicClass")
public class TopicClass {

    @Id
    private String id;
    private String name;
    private String description;

    public TopicClass() {

    }
    public TopicClass(String name, String id, String description) {
        this.name = name;
        this.id = id;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}