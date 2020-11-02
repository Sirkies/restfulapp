package com.example.restfulapp.demo.signup;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public interface AuthController {

    ResponseEntity<User> singIn(String login, String password);
    ResponseEntity<User> signUp(String login, String password);

}
