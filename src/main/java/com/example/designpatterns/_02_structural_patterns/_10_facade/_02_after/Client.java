package com.example.designpatterns._02_structural_patterns._10_facade._02_after;

/**
 * 퍼사드 패턴: 복잡한 서브 시스템 의존성을 최소화하는 방법
 *
 * 장점
 *  - 서브 시스템에 대한 의존성을 한곳으로 모을 수 있다.
 *
 *  단점
 *   - 퍼사드 클래스가 서브 시스템에 대한 모든 의존성을 가지게 된다.
 */
public class Client {
    public static void main(String[] args) {
        EmailSettings emailSettings = new EmailSettings();
        emailSettings.setHost("127.0.0.1");
        EmailMessage emailMessage = new EmailMessage();
        EmailSender emailSender = new EmailSender(emailSettings);
        emailMessage.setFrom("junwoo");
        emailMessage.setTo("kim");
        emailMessage.setSubject("hello");
        emailMessage.setText("haha");

        emailSender.sendEmail(emailMessage);
    }
}
