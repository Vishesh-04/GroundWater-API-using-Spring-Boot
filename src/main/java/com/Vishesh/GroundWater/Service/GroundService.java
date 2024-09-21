package com.Vishesh.GroundWater.Service;

import com.Vishesh.GroundWater.Model.GroundWater;
import com.Vishesh.GroundWater.Repository.MainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroundService {

    @Autowired
    public MainRepository repo;
    public GroundWater getData(String district) {
        System.out.println(repo.findById(district));

        return repo.findById(district).orElse(new GroundWater());
    }
    public List<GroundWater> getAllData(){
        return repo.findAll();
    }
}
