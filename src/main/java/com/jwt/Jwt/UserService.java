package com.jwt.Jwt;

import com.jwt.Jwt.models.User;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
@Service
public class UserService {

    private final List<User> store = new ArrayList<>();

    public UserService() {
        store.add(new User(UUID.randomUUID().toString(), "rohit", "rohit@example.com"));
        store.add(new User(UUID.randomUUID().toString(), "Gurpreet", "Gurpreet@example.com"));
        store.add(new User(UUID.randomUUID().toString(), "singh", "singh@example.com"));
        store.add(new User(UUID.randomUUID().toString(), "ballu", "ballu@example.com"));
    }

    public List<User> getStore() {
        return store;
    }

}
