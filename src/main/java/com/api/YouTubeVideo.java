package com.api;

import com.google.api.client.util.Lists;

import java.util.List;

public class YouTubeVideo {
    private List<Comment> comments = Lists.newArrayList();

    public List<Comment> getComments() {
        return comments;
    }
}
