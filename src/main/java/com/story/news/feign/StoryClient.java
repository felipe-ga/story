package com.story.news.feign;

import com.story.news.model.ResponseStoryApi;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="stories", url="${host.url.service}")
public interface StoryClient {
    @RequestMapping(method = RequestMethod.GET, value = "${endpoint.find.java.news}")
    ResponseStoryApi getAll();
}
