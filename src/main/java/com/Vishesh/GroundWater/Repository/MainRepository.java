package com.Vishesh.GroundWater.Repository;

import com.Vishesh.GroundWater.Model.GroundWater;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MainRepository extends JpaRepository<GroundWater, String> {
}