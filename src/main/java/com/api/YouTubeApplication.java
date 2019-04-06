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

        for (YouTubeVideo video : parser.getListOfVideos()) {
            for (Comment comment : video.getComments()) {
                System.out.println("Author: " + comment.getAuthorName());
                System.out.println("Comment: " + comment.getMessageText());
                System.out.println("Date of last modification: " + comment.getLastModified());
                System.out.println("Likes: " + comment.getLike());
                System.out.println("Edited: " + comment.isEditing());
                System.out.println("");
            }
        }
    }
}
