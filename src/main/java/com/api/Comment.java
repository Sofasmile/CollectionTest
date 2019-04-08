package com.api;

import com.google.api.client.util.DateTime;

public class Comment {
    private String authorName;
    private String messageText;
    private long like;
    private DateTime lastModified;
    private boolean editing;

    public String getAuthorName() {
        return authorName;
    }

    public String getMessageText() {
        return messageText;
    }

    public long getLike() {
        return like;
    }

    public DateTime getLastModified() {
        return lastModified;
    }

    public boolean isEditing() {
        return editing;
    }

    public static class Bilder {
        private Comment comment;

        public Bilder() {
            comment = new Comment();
        }

        public Bilder setAuthorName(String authorName) {
            comment.authorName = authorName;
            return this;
        }

        public Bilder setMessageText(String messageText) {
            comment.messageText = messageText;
            return this;
        }

        public Bilder setLike(long like) {
            comment.like = like;
            return this;
        }

        public Bilder setLastModified(DateTime lastModified) {
            comment.lastModified = lastModified;
            return this;
        }

        public Bilder setEditing(boolean editing) {
            comment.editing = editing;
            return this;
        }

        public Comment build() {
            return comment;
        }
    }
}
