package com.story.news.model;

import lombok.Data;

import java.util.List;
@Data
public class ResponseStoryApi {
    private int page;
    private int nbPages;
    private int hitsPerPage;
    private List<Story> hits;
}
