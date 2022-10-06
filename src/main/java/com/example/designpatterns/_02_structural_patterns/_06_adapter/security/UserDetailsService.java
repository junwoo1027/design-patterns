package com.example.designpatterns._02_strucural_patterns._06_adapter.security;

public interface UserDetailsService {
    UserDetails loadUser(String username);
}
