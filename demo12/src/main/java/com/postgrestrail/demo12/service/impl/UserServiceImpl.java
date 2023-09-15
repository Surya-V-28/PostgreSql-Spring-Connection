package com.postgrestrail.demo12.service.impl;


import com.postgrestrail.demo12.model.User;
import com.postgrestrail.demo12.repository.UserRepository;
import com.postgrestrail.demo12.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Long userId) {
        Optional<User> userOpt = userRepository.findById(userId);
        if(userOpt.isPresent())
            return userOpt.get();
        else
            throw new RuntimeException("user not found.");
    }

    @Override
    public void saveUser(User user) {
        User userDetail = userRepository.save(user);
        System.out.println("user saved to db with userId : " + userDetail.getId());
    }

    @Override
    public void updateUser(User user, Long userId) {
        Optional<User> userDetailOpt = userRepository.findById(userId);
        if(userDetailOpt.isPresent()){
            User userDetail = userDetailOpt.get();
            if(user.getName() != null || user.getName().isEmpty())
                userDetail.setName(user.getName());
            if(user.getEmail() != null || user.getEmail().isEmpty())
                userDetail.setName(user.getEmail());
            if(user.getName() != null || user.getName().isEmpty())
                userDetail.setName(user.getName());
            userRepository.save(userDetail);
        }else{
            throw new RuntimeException("user not found.");
        }
    }

    @Override
    public void deleteUseryId(Long userId) {
        Optional<User> userOpt = userRepository.findById(userId);
        if(userOpt.isPresent())
            userRepository.deleteById(userId);
        else
            throw new RuntimeException("user not found.");
    }
}
