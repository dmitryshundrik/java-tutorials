package org.example.builder;

public class Main {
    public static void main(String[] args) {
        User user = new User.Builder()
                .username("username")
                .password("password")
                .build();
    }
}
