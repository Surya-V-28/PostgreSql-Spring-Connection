package com.postgrestrail.demo12.service;

import com.postgrestrail.demo12.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUser();

    User getUserById(Long userId);

    void saveUser(User user);

    void updateUser(User user, Long userId);

    void deleteUseryId(Long userId);
}
