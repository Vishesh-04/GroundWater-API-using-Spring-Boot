package com.Vishesh.GroundWater.Controller;

import com.Vishesh.GroundWater.Model.GroundWater;
import com.Vishesh.GroundWater.Repository.MainRepository;
import com.Vishesh.GroundWater.Service.GroundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {
    @Autowired
    private MainRepository repo;
    @Autowired
    private GroundService service;
    @GetMapping("/get/{district}")
    public GroundWater get(@PathVariable String district){
         return service.getData(district);
    }
    @GetMapping("/test")
    public String testConnection() {
        return "Connected to DB: " + repo.count();
    }
    @GetMapping("/all")
    public List<GroundWater> getAll(){
        return service.getAllData();
    }
}