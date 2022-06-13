package com.example.backend.app.web;

import com.example.backend.app.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class BackendRestController {

    Logger logger = LoggerFactory.getLogger(BackendRestController.class);

    @GetMapping("/users")
    public List<User> getUsers() {
        logger.info("access GET sample");
        List<User> users = new ArrayList<>();
        users.add(User.builder().userId("1").userName("Taro").build());
        users.add(User.builder().userId("2").userName("Jiro").build());
        return users;
    }
}
