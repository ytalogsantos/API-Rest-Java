package com.project.apirestjava.service;

import com.project.apirestjava.entity.Animes;
import com.project.apirestjava.repository.AnimesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimesService {
    @Autowired
    AnimesRepository animesRepository;

    public List<Animes> getAll() {
        return animesRepository.findAll();
    }

    public Animes getById(Integer id) {
        return animesRepository.findById(id).orElse(null);
    }
}