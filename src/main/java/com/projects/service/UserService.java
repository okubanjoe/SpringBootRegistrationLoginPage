package com.projects.service;

import com.projects.model.User;

public interface UserService {

    public User findUserByEmail(String email);

    public void saveUser(User user);
}