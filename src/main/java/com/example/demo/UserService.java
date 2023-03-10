package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Optional;
import java.util.TreeMap;

@Service
public class UserService {
    @Autowired // it is not making the object of the interface but the object of the class that is goiung to implemenets the
            // this UserRepositaory interface
    UserRepository userRepository;
    TreeMap map = new TreeMap();

    public String addUser(User user) {
        userRepository.save(user);
        return "user added succesfully";
    }

    public User getUser(int userId) {

        User user = userRepository.findById(userId).get();
        return user;

    }
}
