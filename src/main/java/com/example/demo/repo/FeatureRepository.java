package com.example.demo.repo;

import com.example.demo.model.Feature;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface FeatureRepository extends JpaRepository<Feature, String> {

    @Query("SELECT f FROM feature f WHERE f.isEnabled = false")
    List<String> getEnabledFeatures();
}
