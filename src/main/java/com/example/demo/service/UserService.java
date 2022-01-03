package com.example.demo.service;

import com.example.demo.model.Feature;
import com.example.demo.model.User;
import com.example.demo.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public void update(String featureName, Long id) {
        Optional<User> user = userRepository.findById(id);
       List<String> featureList = user.get().getFeatures();
       featureList.add(featureName);
       userRepository.save(user.get());
    }

    public List<String> getEnabledFeatures(Long id) {
        Optional<User> user = userRepository.findById(id);
       return user.get().getFeatures();
    }
}
