package com.example.designpatterns._03_behavioral_patterns._13_chain_of_responsibilities;

public abstract class RequestHandler {
    private RequestHandler nextHandler;

    public RequestHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handle(Request request) {
        if (request != null) {
            nextHandler.handle(request);
        }
    }
}