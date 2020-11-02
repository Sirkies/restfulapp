package com.example.restfulapp.demo.signup;

public interface UserService {
    boolean createUser(User user);

    User getUser(int id);

    boolean updateUser(User user);

    boolean deleteUser(int id);
}
