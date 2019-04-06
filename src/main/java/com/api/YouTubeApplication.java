package com.api;

import java.util.ArrayList;
import java.util.List;

public class YouTubeApplication {
    public static void main(String[] args) {
        YouTubeParser parser = new YouTubeParser();
        parser.init();
        List<String> listOfVideoId = new ArrayList<>();
        listOfVideoId.add("0sWpjUvbGcQ");

        parser.getCommentsFromVideos(listOfVideoId);
    }
}
