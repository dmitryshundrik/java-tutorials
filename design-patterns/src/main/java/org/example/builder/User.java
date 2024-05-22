package org.example.builder;

/**
 * Строитель — это порождающий паттерн проектирования, который позволяет создавать сложные объекты пошагово. Строитель
 * даёт возможность использовать один и тот же код строительства для получения разных представлений объектов.
 */
public class User {
    private String username;
    private String password;

    public static class Builder {
        private User user;

        public Builder() {
            user = new User();
        }

        public Builder username(String username) {
            user.username = username;
            return this;
        }

        public Builder password(String password) {
            user.password = password;
            return this;
        }

        public User build() {
            return user;
        }
    }
}
