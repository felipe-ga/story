package com.story.news.feign;

import com.story.news.model.ResponseStoryApi;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StoryClientTest {

    @Autowired
    private StoryClient storyClient;

    @Test
    public void shouldLoadAllStories() {
        final ResponseStoryApi stories = storyClient.getAll();
        Assertions.assertNotNull(stories);
        Assertions.assertNotNull(stories.getHits());
        int expected = 20;
        int result = stories.getHits().size();
        Assertions.assertEquals(expected, result);
    }
}