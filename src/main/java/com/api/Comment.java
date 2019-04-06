package com.api;

import com.google.api.client.util.DateTime;

public class Comment {
    private String authorName;
    private String messageText;
    private long like;
    private DateTime lastModified;
    private boolean editing;

    public Comment(String authorName, String messageText, long like, DateTime lastModified, boolean editing) {
        this.authorName = authorName;
        this.messageText = messageText;
        this.like = like;
        this.lastModified = lastModified;
        this.editing = editing;
    }

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

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public void setLike(long like) {
        this.like = like;
    }

    public void setLastModified(DateTime lastModified) {
        this.lastModified = lastModified;
    }

    public void setEditing(boolean editing) {
        this.editing = editing;
    }
}
