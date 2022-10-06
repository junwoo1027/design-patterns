package com.example.designpatterns._01_creatinal_patterns._06_adapter.security;

public interface UserDetailsService {
    UserDetails loadUser(String username);
}
