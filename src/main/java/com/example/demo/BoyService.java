package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoyService {

    @Autowired
    private BoysRepo boysRepo;

    public List<Boy> fetchAll() {
        return boysRepo.fetchAll();
    }

    public Boy findUserById(int id) {
        return boysRepo.findUserById(id);
    }
}
