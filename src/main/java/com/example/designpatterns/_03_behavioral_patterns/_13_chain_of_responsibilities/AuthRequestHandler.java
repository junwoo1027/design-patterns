package com.example.designpatterns._03_behavioral_patterns._13_chain_of_responsibilities;

public class AuthRequestHandler extends RequestHandler {
    public AuthRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println("인증");
        super.handle(request);
    }
}
