package com.story.news.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class RequestStory implements Serializable {
    private String author;
    private List<String> tags;
    private String title;
    private String month;
}
