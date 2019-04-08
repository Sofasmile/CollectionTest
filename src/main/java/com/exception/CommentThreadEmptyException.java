package com.exception;

public class CommentThreadEmptyException extends NullPointerException {
    public CommentThreadEmptyException() {
        super();
    }

    public CommentThreadEmptyException(String message) {
        super(message);
    }
}
