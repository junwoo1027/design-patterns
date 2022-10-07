package com.example.designpatterns._02_structural_patterns._07_bridge._02_after;

import com.example.designpatterns._02_structural_patterns._07_bridge._01_before.Champion;

/**
 * 브릿지 패턴: 추상적인 것과 구체적인 것 분리하여 연결하는 패턴
 *  장점
 *   - 추상적인 코드를 구체적인 코드 변경 없이도 독립적으로 확장할 수 있다.
 *   - 추상적인 코드와 구체적인 코드를 분리하여 사용할 수 있다.
 *
 *   단점
 *    - 계층 구조나 늘어나 복잡도가 증가할 수 있다.
 */
public class App {
    public static void main(String[] args) {
        Champion kda = new 아리(new KDA());
        kda.skillQ();
        kda.skillE();

        Champion poolParty = new 아리(new PoolParty());
        poolParty.skillQ();
        poolParty.skillE();
    }
}
