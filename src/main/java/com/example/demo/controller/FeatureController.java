package com.example.demo.controller;

import com.example.demo.model.Feature;
import com.example.demo.service.FeatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feature")
public class FeatureController {

    @Autowired
    FeatureService featureService;

    @PostMapping
    public void createFeature(Feature feature){
        featureService.create(feature);
    }
}
