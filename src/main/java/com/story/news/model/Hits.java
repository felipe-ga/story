package com.story.news.model;

import lombok.Data;

import java.util.List;

@Data
public class Hits {
    private List<Story> stories;
}
