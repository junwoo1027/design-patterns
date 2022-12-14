package com.example.designpatterns._02_structural_patterns._09_decorator;

/**
 * 데코레이터 패턴: 기존 코드를 변경하지 않고 부가 기능을 추가 패턴
 * 장점
 *  - 새로운 클래스를 만들지 않고 기존 기능을 조합할 수 있다.
 *  - 컴파일 타임이 아닌 런타임에 동적으로 기능을 변경할 수 있다.
 *
 *  단점
 *   - 데코레이터를 조합하는 코드가 복잡할 수 있다.
 */
public class App {
    private static boolean enabledSpamFilter = true;
    private static boolean enabledTrimming = true;

    public static void main(String[] args) {
        CommentService commentService = new DefaultCommentService();

        if (enabledSpamFilter) {
            commentService = new SpamFilterCommentService(commentService);
        }

        if (enabledTrimming) {
            commentService = new TrimmingCommentDecorator(commentService);
        }

        Client client = new Client(commentService);
        client.writeComment("오징어게임");
        client.writeComment("재밌어요...");
        client.writeComment("http://junwoo.me");
    }
}
