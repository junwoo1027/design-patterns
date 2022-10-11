package com.example.designpatterns._03_behavioral_patterns._13_chain_of_responsibilities;

/**
 * 책임 연쇄 패턴: 요청을 보내는 쪽과 요청을 처리하는 쪽을 분리하는 패턴
 */
public class Client {
    private RequestHandler requestHandler;

    public Client(RequestHandler requestHandler) {
        this.requestHandler = requestHandler;
    }

    public void doWork() {
        Request request = new Request("뽑기");
        requestHandler.handle(request);
    }

    public static void main(String[] args) {
        RequestHandler chain = new AuthRequestHandler(new LoggingRequestHandler(new PrintRequestHandler(null)));
        Client client = new Client(chain);
        client.doWork();
    }
}
