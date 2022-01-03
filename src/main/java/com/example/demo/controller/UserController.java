package com.example.demo.controller;

import com.example.demo.service.FeatureService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    FeatureService featureService;

    @PutMapping("/{id}")
    public void addFeature(String featureName, @PathVariable Long id){
    userService.update(featureName, id);
    }

    @GetMapping("/{id}/features")
public List<String> getFeatures(@PathVariable Long id){
        List<String> featuresList = new ArrayList<>();
        featuresList.addAll(featureService.getEnabledFeatures());
       featuresList.addAll(userService.getEnabledFeatures(id));
        return featuresList;
    }

}
