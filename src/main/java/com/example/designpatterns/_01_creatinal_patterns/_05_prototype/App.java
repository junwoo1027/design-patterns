package com.example.designpatterns._01_creatinal_patterns._05_prototype;

/**
 * 프로토 타입 패턴: 기존 인스턴스를 복제하여 새로운 인스턴스를 만드는 방법
 * 장점
 *  - 복잡한 객체를 만드는 과정을 숨길 수 있다.
 *  - 기존 객체를 복제하는 과정이 새 인스턴스를 만드는 것보다 비용적인면에서 효율적일 수도 있다.
 *  - 추상적인 타입을 리턴할 수 있다.
 *
 * 단점
 *  - 복제한 객체를 만드는 과정 자체가 복잡할 수 있다. (특히, 순환 참조가 있는 경우)
 */
public class App {
    public static void main(String[] args) throws CloneNotSupportedException {
        GithubRepository repository = new GithubRepository();
        repository.setUser("junwoo");
        repository.setName("study");

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("study");

        String url = githubIssue.getUrl();
        System.out.println(url);

        GithubIssue clone = (GithubIssue) githubIssue.clone();

        System.out.println(clone != githubIssue);
        System.out.println(clone.equals(githubIssue));
        System.out.println(clone.getClass() == githubIssue.getClass());
        System.out.println(clone.getRepository() == githubIssue.getRepository());
    }
}