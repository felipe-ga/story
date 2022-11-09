package com.story.news.model;

import lombok.Data;

import java.util.List;

@Data
public class Story {
    private Integer story_id;
    private String author;
    private List<String> tags;
    private String title;
    private String created_at;
    private String comment_text;
}
