package com.example.restfulapp.demo.signup;

class DefaultUserService implements UserService  {
    @Override
    public boolean createUser(User user) {
        return false;
    }

    @Override
    public User getUser(int id) {
        return null;
    }

    @Override
    public boolean updateUser(User user) {
        return false;
    }

    @Override
    public boolean deleteUser(int id) {
        return false;
    }
}
