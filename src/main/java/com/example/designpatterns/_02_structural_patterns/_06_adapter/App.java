package com.example.designpatterns._02_strucural_patterns._06_adapter;

import com.example.designpatterns._02_strucural_patterns._06_adapter.security.LoginHandler;
import com.example.designpatterns._02_strucural_patterns._06_adapter.security.UserDetailsService;

/**
 * 어댑터 패턴: 기존 코드를 클라이언트가 사용하는 인터페이스의 구현체로 바꿔주는 패턴
 * 장점
 *  - 기존 코드를 변경하지 않고 원하는 인터페이스 구현체를 만들어 재사용할 수 있다.
 *  - 기존 코드가 하던 일과 특정 인터페이스 구현체로 변환하는 작업을 각기 다른 클래스로 분리하여 관리할 수 있다.
 *
 *  단점
 *   - 새 클래스가 생겨 복잡도가 증가할 수 있다. 경우에 따라서 기존코드가 해당 인터페이스를 구현하도록 수정하는 것이 좋은 선택이 될 수도 있다.
 */
public class App {
    public static void main(String[] args) {
        UserDetailsService accountService = new AccountService();
        LoginHandler loginHandler = new LoginHandler(accountService);

        String login = loginHandler.login("junwoo", "junwoo");
        System.out.println(login);
    }
}
