package com.example.demo.service;

import com.example.demo.model.Feature;
import com.example.demo.repo.FeatureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FeatureService {

    @Autowired
    FeatureRepository featureRepository;

    public void create(Feature feature) {
        featureRepository.save(feature);
    }

    public List<String> getEnabledFeatures() {
       return  featureRepository.getEnabledFeatures();
    }
}
